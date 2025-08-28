package com.remilang;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import java.util.HashMap;
import java.util.Map;

public class SemanticVisitor extends RemiLangBaseVisitor<String> {
    private final Map<String, String> tabla = new HashMap<>();
    private boolean hasErrors = false;

    public boolean hasErrors() {
        return hasErrors;
    }

    private void error(ParserRuleContext ctx, String msg) {
        Token start = ctx.getStart();
        int line = start.getLine();
        int col = start.getCharPositionInLine();
        System.err.println("Error semántico en línea " + line + ", columna " + col + ": " + msg);
        hasErrors = true;
    }

    // --------- Declaración ---------
    @Override
    public String visitDecl(RemiLangParser.DeclContext ctx) {
        String id = ctx.ID().getText();
        if (tabla.containsKey(id)) {
            error(ctx, "Variable '" + id + "' ya declarada");
        } else {
            tabla.put(id, "ENTERO"); // por ahora, solo ENTERO soportado
        }
        return null;
    }

    // --------- Asignación ---------
    @Override
    public String visitAsignacion(RemiLangParser.AsignacionContext ctx) {
        String id = ctx.ID().getText();
        if (!tabla.containsKey(id)) {
            error(ctx, "Variable '" + id + "' no declarada");
            return null;
        }
        String tipoVar = tabla.get(id);
        String tipoExpr = visit(ctx.expr());

        if (tipoVar != null && tipoExpr != null && !tipoVar.equals(tipoExpr)) {
            error(ctx, "No se puede asignar " + tipoExpr + " a variable " + tipoVar);
        }
        return null;
    }

    // --------- Expresiones ---------
    @Override
    public String visitEnteroExpr(RemiLangParser.EnteroExprContext ctx) {
        return "ENTERO";
    }

    @Override
    public String visitCadenaExpr(RemiLangParser.CadenaExprContext ctx) {
        return "CADENA";
    }

    @Override
    public String visitIdExpr(RemiLangParser.IdExprContext ctx) {
        String id = ctx.ID().getText();
        if (!tabla.containsKey(id)) {
            error(ctx, "Variable '" + id + "' no declarada");
            return null;
        }
        return tabla.get(id);
    }

    @Override
    public String visitAritExpr(RemiLangParser.AritExprContext ctx) {
        String left = visit(ctx.expr(0));
        String right = visit(ctx.expr(1));

        if (!"ENTERO".equals(left) || !"ENTERO".equals(right)) {
            error(ctx, "Operación aritmética requiere operandos ENTERO");
        }
        return "ENTERO";
    }

    @Override
    public String visitRelExpr(RemiLangParser.RelExprContext ctx) {
        String left = visit(ctx.expr(0));
        String right = visit(ctx.expr(1));

        if (left != null && right != null && !left.equals(right)) {
            error(ctx, "Operación relacional requiere operandos del mismo tipo");
        }
        return "ENTERO"; // las relacionales devuelven boolean, pero no lo tenemos aún
    }

    @Override
    public String visitParensExpr(RemiLangParser.ParensExprContext ctx) {
        return visit(ctx.expr());
    }
}
