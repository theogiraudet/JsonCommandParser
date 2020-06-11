grammar JsonCommandSyntax;

@header {
package fr.theogiraudet.json_command_parser;
}

@rulecatch {
catch (RecognitionException e) { reportError (e) ; throw e ; }
}

//Ajouter Float

root : '{' string_lex { Actions.initCommand(); } ':' {Actions.newContext();} '{' descriptor { Actions.deleteContext(); } '}' '}' { Actions.resultCommand(); } ;

descriptor : descriptor_expressions (',' descriptor_expressions)* ;
descriptor_expressions : description | aliases | permissions | arguments | execute ;
description : '"description"' ':' string_lex { Actions.setDescription(); } ;
aliases : '"aliases"' ':' array_string { Actions.setAliases(); } ;
permissions : '"permissions"' ':' array_string { Actions.setPermissions(); } ;
arguments : '"arguments"' ':' '[' { Actions.stackArguments(); } (argument (',' argument)*)? ']' ;

argument : {Actions.newContext(); } '{' argument_expressions (',' argument_expressions)* '}' { Actions.deleteContext(); } ;
argument_expressions : type | tag | matches | id | arguments | execute | keep_value ;
type : '"type"' ':' type_lex { Actions.setType(); } ;
id : '"id"' ':' string_lex { Actions.setId(); } ;


matches : '"matches"' ':' string_lex { Actions.setMatches(); } ;
execute : '"execute"' ':' string_lex { Actions.setExecute(); } ;
keep_value : '"keep_value"' ':' boolean_lex { Actions.setKeepValue(); } ;
tag : '"tag"' ':' string_lex { Actions.setTag(); } ;
array_string : { Actions.initList(); } '[' (string_lex { Actions.addToList(); } (',' string_lex { Actions.addToList(); } )*)? ']' ;


int_lex : INTEGER { UtilLex.integer_\$eq(Integer.parseInt($INTEGER.text)); } ;
float_lex : FLOAT { UtilLex.floating_\$eq(Float.parseFloat($FLOAT.text)); } ;
boolean_lex : BOOLEAN { UtilLex.bool_\$eq(Boolean.parseBoolean($BOOLEAN.text)); } ;
string_lex : STRING { UtilLex.string_\$eq($STRING.text.substring(1, $STRING.text.length() - 1)); } ;
type_lex : TYPE_QUOTED { UtilLex.string_\$eq($TYPE_QUOTED.text.substring(1, $TYPE_QUOTED.text.length() - 1)); } ;

TYPE_QUOTED : '"' TYPE '"' ;
fragment TYPE : (SIMPLE_TYPE | COMPLEX_TYPE) ;
fragment SIMPLE_TYPE : 'integer' | 'boolean' | 'reference' | 'string' | 'float' ;
fragment COMPLEX_TYPE : ('list<' TYPE '>') | (SIMPLE_TYPE '...') ;

STRING : '"' (ESC | SAFECODEPOINT)* '"' ;

fragment ESC : '\\' (["\\/bfnrt] | UNICODE) ;
fragment UNICODE : 'u' HEX HEX HEX HEX ;
fragment HEX : [0-9a-fA-F] ;
fragment SAFECODEPOINT : ~ ["\\\u0000-\u001F] ;

BOOLEAN 		 : 'true' | 'false' ;
FLOAT            : (INTEGER 'f') | INTEGER '.' INTEGER ;
INTEGER          : [0-9]+ ;

BACK_LINE : [\n] { UtilLex.lineNumber_\$eq(UtilLex.lineNumber() + 1); } -> skip ;
WHITESPACE  : [ \t\r] + -> skip ;
COMMENT : '//' ~[\n]+ -> skip ;


