grammar DASA;


programa: prog1 prog2 main ;

prog1: vars_st prog1 |   ;

prog2: metodos prog2 |   ;

main: MAIN LPAREN RPAREN LCURLY main1 main2 RCURLY ;

main1: vars_st main1 |   ;

main2: estatuto main2 |   ;

metodos: FUNC ID LPAREN met1 RPAREN met2 LCURLY met3 met4 RCURLY ;

met1: params |   ;

met2: COLON tipo |   ;

met3: vars_st met3 |   ;

met4: estatuto met4 |   ;

params: tipo COLON ID params1 ;

params1: COMMA params |   ;

vars_st: DEFINE tipo vars1 COLON vars3 SCOLON ;

vars1: LBRACK CINT RBRACK vars2 |   ;

vars2: LBRACK CINT RBRACK |   ;

vars3: ID vars4 vars6 ;

vars4: ASSIGN vars5 |   ;

vars5: cte | arreglo ;

vars6: COMMA vars3 |   ;

estatuto: asignacion
        | durante
        | condicion
        | funcion SCOLON
        | lectura
        | escritura
        | estdesc
        | dibujar
        | regresion
        | clustering
        | regresa ;

asignacion: ID asig1 ASSIGN expresion SCOLON ;

asig1: LBRACK expresion RBRACK asig2 |   ;

asig2: LBRACK CINT RBRACK |   ;

durante: WHILE LPAREN expresion RPAREN bloque ;

condicion: IF LPAREN expresion RPAREN bloque con1 ;

con1: ELSE bloque |   ;

lectura: INPUT LPAREN ID lec1 RPAREN SCOLON ;

lec1: LBRACK expresion RBRACK lec2 |   ;

lec2: LBRACK expresion RBRACK |  ;

arreglo: LBRACK arr1 RBRACK ;

arr1: arr2 | arr4 ;

arr2: cte arr3|   ;

arr3: COMMA arr2 |   ;

arr4: LBRACK arr5 RBRACK arr7 ;

arr5: expresion arr6 |   ;

arr6: COMMA arr5|   ;

arr7: COMMA arr4 |   ;

cte: CINT
   | CFLOAT
   | CCHAR
   | CARRCHAR
   | CBOOL
   | NULL;

tipo: TINT
    | TFLOAT
    | TCHAR
    | TBOOL ;

bloque: LCURLY bloque1 RCURLY ;

bloque1: estatuto bloque1 |   ;

escritura: PRINT LPAREN expresion RPAREN SCOLON ;

estdesc: DESCRIBE LPAREN expresion RPAREN SCOLON ;

dibujar: PLOT LPAREN expresion COMMA expresion RPAREN SCOLON ;

regresion: REGRESSION LPAREN expresion reg1 RPAREN SCOLON ;

reg1: COMMA expresion |   ;

clustering: CLUSTER LPAREN expresion COMMA expresion RPAREN SCOLON ;

funcion: ID LPAREN func1 RPAREN ;

func1: expresion func2 |   ;

func2: COMMA func1 |   ;

regresa: RETURN expresion SCOLON ;

expresion: comp expres1 ;

expres1: expres2 comp |   ;

expres2: AND | OR ;

comp: exp comp1 ;

comp1: comp2 exp |   ;

comp2: GREATEQ
     | GREAT
     | LESSEQ
     | LESS
     | DIFF
     | EQUALS ;

exp: termino exp1 ;

exp1: exp2 termino |   ;

exp2: PLUS | MINUS ;

termino: factor term1 ;

term1: term2 termino |   ;

term2: MULT | DIVIDE | MOD ;

factor: fact1 fact2 ;

fact1: NOT |   ;

fact2: LPAREN expresion RPAREN | fact3 valor;

fact3: PLUS | MINUS |   ;

valor: cte
     | arreglo
     | funcion
     | vacio
     | castint
     | castfloat
     | castarrchar
     | ID valor1 ;

valor1:  LBRACK expresion RBRACK valor2 |   ;

valor2: LBRACK expresion RBRACK |   ;

vacio: ISNULL LPAREN expresion RPAREN ;

castint: TOINT LPAREN expresion RPAREN ;

castfloat: TOFLOAT LPAREN expresion RPAREN ;

castarrchar: TOARRCHAR LPAREN expresion RPAREN ;


DEFINE:     'define';
FUNC:       'func';
MAIN:       'main';
TINT:       'Int';
TFLOAT:     'Float';
TBOOL:      'Bool';
TCHAR:      'Char';
TSTRING:    'String';
PRINT:      'print';
INPUT:      'input';
ISNULL:     'isNull';
TOINT:      'toInt';
TOFLOAT:    'toFloat';
TOARRCHAR:  'toArrChar';
PLOT:       'plot';
DESCRIBE:   'describe';
REGRESSION: 'regression';
CLUSTER:    'cluster';
RETURN:     'return';
WHILE:      'while';
IF:         'if';
ELSE:       'else';
NULL:       'Null';

COLON	:':';
SCOLON    :';';
COMMA     :',';
LCURLY    :'{';
RCURLY    :'}';
LPAREN    :'(';
RPAREN    :')';
LBRACK    :'[';
RBRACK    :']';
DIFF      :'!=';
EQUALS    :'==';
ASSIGN    :'=';
GREATEQ   :'>=';
LESSEQ    :'<=';
GREAT     :'>';
LESS      :'<';
PLUS      :'+';
MINUS     :'-';
MULT      :'*';
DIVIDE    :'/';
NOT       :'!';
MOD       :'%';
AND       :'&&';
OR        :'||';

IGNORE: [ \t\r\f\n]+ -> skip;

CCHAR: ['].['];

CARRCHAR: ["].*? ["];

CFLOAT: [0-9]+[.][0-9]+;

CINT: [0-9]+;

CBOOL: 'True'|'False';

ID: [a-zA-Z_][a-zA-Z0-9_]*;
