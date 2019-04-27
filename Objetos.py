class Calc():
    def genAddress(scope,type,pos):
        return scope*10000 + type*1000 + pos


class Memoria():

    memStack = [
        0,
        [0,[],[],[],[]], #Local = 1
        [0,[],[],[],[]], #Global = 2
        [[None], [], [], [True, False], [],] #Constante = 3
    ]

    funcTable = []

    offsetStack = []
    
    BaseINT = 1000
    BaseFLOAT = 2000
    BaseBOOL = 3000
    BaseSTRING = 4000

    BaseLOCAL= 10000
    BaseGLOBAL= 20000
    BaseCTE = 30000


class Cuadruplos():

    cuadruplos  = []
    
    # def __init__(self):
    #     self.cuadruplos = []

    # def printQuads(self):
    #     index = 0
    #     for y in self.cuadruplos:
    #         print("\t",index, ".", "{Oper:", y["Oper"], ", Op1:", y["Op1"], ", Op2:", y["Op2"], ", Res:", y["Res"], "}")
    #         index += 1
        

class Operadores():
    dicOperations = {
        "!"  : 0,
        "+u" : 1,
        "-u" : 2,
        "*"  : 3,
        "/"  : 4,
        "%"  : 5,
        "+"  : 6,
        "-"  : 7,
        "<"  : 8,
        "<=" : 9,
        ">"  : 10,
        ">=" : 11,
        "==" : 12,
        "!=" : 13,
        "&&" : 14,
        "||" : 15,
        "=" :16,
        "GOTO" : 17,
        "GOTOF": 18,
        "GOSUB": 19,
        "END": 20,
        "ENDPROC": 21,
        "PARAM": 22,
        "ERA": 23,
        "RETURN": 24,
        "PRINT": 25,
        "INPUT": 26,
        "DESCRIBE": 27,
        "PLOT": 28,
        "REGRESION": 29,
        "VACIO": 30,
        "CLUSTER": 31,
        "CASTINT": 32,
        "CASTFLOAT": 33,
        "CASTSTR": 34
    }


class Tipos():
    dicTypes = {
        "Error"     : -1,
        "Null"      : 0,
        "Int"       : 1,
        "Float"     : 2,
        "Bool"      : 3,
        "String"    : 4,
        "Int[]"     : 5,
        "Float[]"   : 6,
        "Bool[]"    : 7,
        "String[]"  : 8,
        "Int[][]"   : 9,
        "Float[][]" : 10,
        "Bool[][]"  : 11,
        "String[][]": 12
    }

class Scopes():
    dicScopes = {
        "Global" : 1,
        "Local"  : 2,
        "Const"  : 3,
        "Temp"   : 4
    }

class CuadroSemantico():
    semSquare = [[-1 for y in range(3)] for x in range(13)]
    
    semSquare[1][1] = 1
    semSquare[1][2] = 1
    semSquare[2][1] = 2
    semSquare[2][2] = 2
    semSquare[3][0] = 3

class CuboSemantico():
    semCube = [[[-1 for z in range(17)] for y in range(13)] for x in range(13)]
    
    semCube[0][1][16] = 1
    semCube[0][2][16] = 1
    semCube[0][3][16] = 1
    semCube[0][4][16] = 1

    semCube[1][1][3] = 1
    semCube[1][1][4] = 1
    semCube[1][1][5] = 1
    semCube[1][1][6] = 1
    semCube[1][1][7] = 1
    semCube[1][1][8] = 3
    semCube[1][1][9] = 3
    semCube[1][1][10] = 3
    semCube[1][1][11] = 3
    semCube[1][1][12] = 3
    semCube[1][1][13] = 3
    semCube[1][1][16] = 1
    semCube[1][2][3] = 2
    semCube[1][2][4] = 2
    semCube[1][2][5] = 2
    semCube[1][2][6] = 2
    semCube[1][2][7] = 2
    semCube[1][2][8] = 3
    semCube[1][2][9] = 3
    semCube[1][2][10] = 3
    semCube[1][2][11] = 3
    semCube[1][2][12] = 3
    semCube[1][2][13] = 3
    semCube[1][2][16] = 1

    semCube[2][1][3] = 2
    semCube[2][1][4] = 2
    semCube[2][1][5] = 2
    semCube[2][1][6] = 2
    semCube[2][1][7] = 2
    semCube[2][1][8] = 3
    semCube[2][1][9] = 3
    semCube[2][1][10] = 3
    semCube[2][1][11] = 3
    semCube[2][1][12] = 3
    semCube[2][1][13] = 3
    semCube[2][1][16] = 2
    semCube[2][2][3] = 2
    semCube[2][2][4] = 2
    semCube[2][2][5] = 2
    semCube[2][2][6] = 2
    semCube[2][2][7] = 2
    semCube[2][2][8] = 3
    semCube[2][2][9] = 3
    semCube[2][2][10] = 3
    semCube[2][2][11] = 3
    semCube[2][2][12] = 3
    semCube[2][2][13] = 3
    semCube[2][2][16] = 2


    semCube[3][3][12] = 3
    semCube[3][3][13] = 3
    semCube[3][3][14] = 3
    semCube[3][3][15] = 3
    semCube[3][3][16] = 3


    semCube[4][4][6] = 8
    semCube[4][4][12] = 3
    semCube[4][4][13] = 3
    semCube[4][4][16] = 4
    semCube[4][8][6] = 8


    semCube[5][5][12] = 3
    semCube[5][5][13] = 3
    semCube[5][6][12] = 3
    semCube[5][6][13] = 3
    semCube[6][5][12] = 3
    semCube[6][5][13] = 3
    semCube[6][6][12] = 3
    semCube[6][6][13] = 3
    semCube[7][7][12] = 3
    semCube[7][7][13] = 3
    semCube[8][4][6] = 8
    semCube[8][8][6] = 8
    semCube[8][8][12] = 3
    semCube[8][8][13] = 3
    semCube[9][9][12] = 3
    semCube[9][9][13] = 3
    semCube[9][10][12] = 3
    semCube[9][10][13] = 3
    semCube[10][9][12] = 3
    semCube[10][9][13] = 3
    semCube[10][10][12] = 3
    semCube[10][10][13] = 3
    semCube[11][11][12] = 3
    semCube[11][11][13] = 3
    semCube[12][12][12] = 3
    semCube[12][12][13] = 3
    semCube[12][4][16] = 12
    
    
        