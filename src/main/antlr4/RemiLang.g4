grammar RemiLang;

@header {
package com.remilang;
}

/* ---------- LEXER ---------- */
SI       : 'SI' ;
SINO     : 'SINO' ;
MIENTRAS : 'MIENTRAS' ;
FIN      : 'FIN' ;
IMPRIMIR : 'IMPRIMIR' ;
ENTERO   : [0-9]+ ;
CADENA   : '"' (~["\r\n])* '"' ;
ID       : [a-zA-Z_][a-zA-Z0-9_]* ;
OPARIT   : '+' | '-' | '*' | '/' ;
OPREL    : '>' | '<' | '>=' | '<=' | '==' | '!=' ;
WS       : [ \t\r\n]+ -> skip ;
COMMENT  : '#' ~[\r\n]* -> skip ;

/* ---------- PARSER ---------- */
programa   : (decl | sentencia)+ EOF ;

decl       : 'ENTERO' ID ';' ;

sentencia  : asignacion
           | condicional
           | bucle
           | imprimir ;

asignacion : ID '=' expr ';' ;

condicional: SI expr sentencia (SINO sentencia)? FIN ;

bucle      : MIENTRAS expr sentencia FIN ;

imprimir   : IMPRIMIR '(' expr ')' ';' ;

/* ---------- EXPRESIONES ---------- */
expr
    : expr OPARIT expr      #aritExpr
    | expr OPREL expr       #relExpr
    | ENTERO                #enteroExpr
    | CADENA                #cadenaExpr
    | ID                    #idExpr
    | '(' expr ')'          #parensExpr
    ;
