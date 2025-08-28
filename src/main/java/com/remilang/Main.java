package com.remilang;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.nio.file.*;

public class Main {
    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.err.println("Uso: java -jar remilang-compiler.jar <archivo.remi>");
            System.exit(1);
        }

        String input = Files.readString(Path.of(args[0]));
        RemiLangLexer lexer = new RemiLangLexer(CharStreams.fromString(input));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RemiLangParser parser = new RemiLangParser(tokens);

        ParseTree tree = parser.programa();

        // ---------- Paso 1: Análisis semántico ----------
        SemanticVisitor semantic = new SemanticVisitor();
        semantic.visit(tree);

        if (semantic.hasErrors()) {
            System.err.println("❌ Se encontraron errores semánticos. No se generará código.");
            System.exit(1); // corta la ejecución
        }

        // ---------- Paso 2: Generación de código Java ----------
        CodeGenVisitor javaGen = new CodeGenVisitor("Java");
        String javaCode = javaGen.visit(tree);
        Files.writeString(Path.of("output", "Programa.java"), javaCode);
        System.out.println("✅ Java generado en output/Programa.java");

        // ---------- Paso 3: Generación de código Python ----------
        CodeGenVisitor pyGen = new CodeGenVisitor("Python");
        String pyCode = pyGen.visit(tree);
        Files.writeString(Path.of("output", "programa.py"), pyCode);
        System.out.println("✅ Python generado en output/programa.py");
    }
}
