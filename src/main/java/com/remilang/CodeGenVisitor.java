package com.remilang;

import com.remilang.RemiLangBaseVisitor;
import com.remilang.RemiLangParser;

public class CodeGenVisitor extends RemiLangBaseVisitor<String> {
    private final String lang;
    private int indent = 0;

    public CodeGenVisitor(String lang) { this.lang = lang; }

    private String tab() { return "  ".repeat(indent); }

    @Override
    public String visitPrograma(RemiLangParser.ProgramaContext ctx) {
        StringBuilder sb = new StringBuilder();
        if ("Java".equals(lang)) {
            sb.append("public class Programa {\n")
                    .append("  public static void main(String[] args) {\n");
        } else {
            sb.append("def main():\n");
        }
        indent = "Java".equals(lang) ? 2 : 1;

        // recorrer declaraciones y sentencias
        for (var d : ctx.decl()) sb.append(tab()).append(visit(d)).append("\n");
        for (var s : ctx.sentencia()) sb.append(tab()).append(visit(s)).append("\n");

        if ("Java".equals(lang)) sb.append("  }\n}\n");
        else sb.append("if __name__ == '__main__':\n  main()\n");
        return sb.toString();
    }

    @Override
    public String visitDecl(RemiLangParser.DeclContext ctx) {
        String id = ctx.ID().getText();
        return "Java".equals(lang)
                ? "int " + id + ";"  // en Java declaramos variable sin inicializar
                : id + " = None";    // en Python la inicializamos en None
    }

    @Override
    public String visitAsignacion(RemiLangParser.AsignacionContext ctx) {
        String id = ctx.ID().getText();
        String expr = visit(ctx.expr());
        return "Java".equals(lang)
                ? id + " = " + expr + ";"
                : id + " = " + expr;
    }

    @Override
    public String visitImprimir(RemiLangParser.ImprimirContext ctx) {
        String expr = visit(ctx.expr());
        return "Java".equals(lang)
                ? "System.out.println(" + expr + ");"
                : "print(" + expr + ")";
    }

    @Override
    public String visitCondicional(RemiLangParser.CondicionalContext ctx) {
        String cond = visit(ctx.expr());
        String then = visit(ctx.sentencia(0));
        String base;
        if ("Java".equals(lang)) {
            base = "if (" + cond + ") {\n" + tab() + then + "\n" + tab() + "}";
            if (ctx.SINO() != null) {
                String elseS = visit(ctx.sentencia(1));
                base += " else {\n" + tab() + elseS + "\n" + tab() + "}";
            }
        } else {
            base = "if " + cond + ":\n" + tab() + then;
            if (ctx.SINO() != null) {
                String elseS = visit(ctx.sentencia(1));
                base += "\n" + tab().substring(0, tab().length()-1) + "else:\n" + tab() + elseS;
            }
        }
        return base;
    }

    @Override
    public String visitBucle(RemiLangParser.BucleContext ctx) {
        String cond = visit(ctx.expr());
        String body = visit(ctx.sentencia());
        return "Java".equals(lang)
                ? "while (" + cond + ") {\n" + tab() + body + "\n" + tab() + "}"
                : "while " + cond + ":\n" + tab() + body;
    }

    /* ---------- EXPRESIONES ---------- */

    @Override
    public String visitEnteroExpr(RemiLangParser.EnteroExprContext ctx) {
        return ctx.ENTERO().getText();
}

    @Override
    public String visitCadenaExpr(RemiLangParser.CadenaExprContext ctx) {
        return ctx.CADENA().getText();
    }

    @Override
    public String visitIdExpr(RemiLangParser.IdExprContext ctx) {
        return ctx.ID().getText();
    }

    @Override
    public String visitAritExpr(RemiLangParser.AritExprContext ctx) {
        String left = visit(ctx.expr(0));
        String op   = ctx.OPARIT().getText();
        String right = visit(ctx.expr(1));
        return left + " " + op + " " + right;
    }

    @Override
    public String visitRelExpr(RemiLangParser.RelExprContext ctx) {
        String left = visit(ctx.expr(0));
        String op   = ctx.OPREL().getText();
        String right = visit(ctx.expr(1));
        return left + " " + op + " " + right;
    }

    @Override
    public String visitParensExpr(RemiLangParser.ParensExprContext ctx) {
        return "(" + visit(ctx.expr()) + ")";
    }
}
