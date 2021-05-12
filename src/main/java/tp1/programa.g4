grammar programa;

@header {
package tp1;
}

fragment LETRA : [A-Za-z] ;
fragment DIGITO : [0-9] ;

LLAVEA : '{' ;
LLAVEC : '}' ;

PARENA : '(' ;
PARENC : ')' ;

INT : 'int' ;
DOUBLE : 'double' ;
VOID : 'void' ;
FLOAT : 'float' ;

WHILE : 'while' ;
IIF : 'if' ;
IFOR : 'for' ;

MAS : '+' ;
MENOS : '-' ;
MULT: '*' ;
DIV : '/' ;
MENOR : '<' ; 
MAYOR : '>' ;
MENORIGUAL : '<=' ;
MAYORIGUAL : '>=' ;
IGUALES: '==' ;
DISTINTO : '!=' ;
ASIG : '=' ;
PYQ : ';' ;
COMA : ',' ;


ENTERO : DIGITO+ ;

ID : (LETRA | '_')(LETRA | DIGITO | '_')* ;



WS : [ \n\t\r]+ -> skip;


programa : { System.out.println("\n\n -->Inicio para ver si marca un error en token<--"); } instrucciones{ System.out.println("\n\n -->Fin...si hay error marcara el token de error, si no, se observa con el parser tree que no hay error<--"); } ;


instrucciones :  instruccion instrucciones
              | bloque instrucciones
              |
              ;


bloque : LLAVEA instrucciones LLAVEC ;



instruccion : declaracion PYQ
            | asignacion PYQ
            | iwhile
            | iif
            | ifor
            | funtion
            ;

verificador : ID | ENTERO ;


/*  INICIO DECLARACION  */
declaracion :  tipo_de_datos termino ;

tipo_de_datos : INT | DOUBLE | FLOAT ;

termino : ID 
        | asignacion_simple
        | varias_variables
        |
        ;

asignacion_simple : ID ASIG verificador asignacion_simple 
                  | entrada_al_reves  asignacion_simple
                  | 
                  ;

entrada_al_reves : COMA ID entrada_al_reves
                 | COMA 
                 ; 

varias_variables : varias ;

varias : ID COMA varias
       | ID 
       |
       ;

/* FIN DECLARACION */

/* INICIO ASIGNACION */
asignacion : ID ASIG opal ;

opal : exp ;

exp : term e ;

e : MAS   term e
  | MENOS term e
  |
  ;

term : factor t ;

t : MULT factor t
  | DIV  factor t
  |
  ;

factor : ID
       | ENTERO
       | PARENA exp PARENC
       ;

/* FIN ASIGNACION */

/* INICIO ESTRUCTURAS DE CONTROL */
comp : PARENA verificador comparacion verificador PARENC 
     | verificador comparacion verificador 
     ;

bloque_for : PARENA ( (declaracion | asignacion) PYQ comp PYQ incremento ) PARENC ;

comparacion : MAYOR | MENOR | MAYORIGUAL | MENORIGUAL | IGUALES | DISTINTO ;

incremento : verificador MAS MAS 
           | verificador MENOS MENOS
           ;

iwhile : WHILE comp bloque ;
  
iif : IIF comp bloque  ;

ifor : IFOR bloque_for bloque ;

/* FIN ESTRUCTURAS DE CONTROL */

tipo_de_funcion : INT | DOUBLE | FLOAT | VOID;

una_o_mas_variables : declaracion una_o_mas_variables
                    | declaracion
                    ; 

bloque_entre_parentesis : PARENA una_o_mas_variables PARENC ;


funtion : tipo_de_funcion ID bloque_entre_parentesis bloque ;
 



