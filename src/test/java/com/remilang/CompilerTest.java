package com.remilang;

import org.junit.jupiter.api.Test;
import java.nio.file.*;
import static org.junit.jupiter.api.Assertions.*;

public class CompilerTest {
    @Test
    void testGeneracionOK() throws Exception {
        String source = """
                        ENTERO x;
                        x = 5 + 3;
                        IMPRIMIR(x);
                        """;
        Files.createDirectories(Path.of("output"));
        Files.writeString(Path.of("output", "mini.remi"), source);
        Main.main(new String[]{"output/mini.remi"});
        assertTrue(Files.exists(Path.of("output", "Programa.java")));
        assertTrue(Files.exists(Path.of("output", "programa.py")));
    }
}