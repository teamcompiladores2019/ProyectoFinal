grammar ProyectoFinal;

start
:
	proyecto
;
proyecto: (librerias*)? programa contenido fin? ;
librerias: IMPORT nombrelib;
nombrelib: CARACTERES ;
programa: PROGRAM nombreprg;
nombreprg: CARACTERES ;
contenido: MAIN (variables*)? (sentencias*)? (ciclos*)? (condicion*)?;
variables: tipov nombrev ;
tipov: INT | FLOAT | CHAR | STRING ;
nombrev: CARACTERES ;
sentencias: (imprimirvalor | agregarvalor) ;
imprimirvalor: PRINT (CARACTERES|DIGITOS)* ;
agregarvalor: CARACTERES (ASIGNACION|ASIGNACION CARACTERES OPERADORES) (CARACTERES*|DIGITOS);
ciclos: FOR PARENTESIS agregarvalor PYC LIMITE PYC ACCION PARENTESIS (CARACTERES|sentencias*) | 
		WHILE PARENTESIS LIMITE PARENTESIS (CARACTERES|sentencias*) ACCION?;
condicion: IF PARENTESIS (LIMITE|IFCONT) PARENTESIS CARACTERES* (sentencias*)? | ELSE CARACTERES* (sentencias*)? ;
fin: END ;

IMPORT: 'IMPORT';
PROGRAM: 'PROGRAM';
MAIN: 'MAIN';
BEGIN: 'BEGIN';
INT: 'INT';
FLOAT: 'FLOAT';
BOOLEAN: 'BOOLEAN';
CHAR: 'CHAR';
STRING: 'STRING';
PRINT: 'PRINT';
FOR: 'FOR';
IF: 'IF';
ELSE: 'ELSE';
LIMITE: CARACTERES OPERADORESLOGICOS (CARACTERES|DIGITOS);
ACCION: CARACTERES OPERADORES;
IFCONT: ACCION CARACTERES;
WHILE: 'WHILE'; 
END: 'END';
ASIGNACION: '=';
PARENTESIS: '('|')';
OPERADORES: ('+'|'-'|'*'|'/')+;
OPERADORESLOGICOS: ('<'|'>'|'=='|'!=')+ ;
PYC: ';';

CARACTERES: ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
DIGITOS: ('0'..'9')+;

WS
:
	[ \t\r\n]+ -> skip
;
