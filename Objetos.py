class Dictionaries():
    operators = {
        "!"   : 0,
        "+u"  : 1,
        "-u"  : 2,
        "*"   : 3,
        "/"   : 4,
        "%"   : 5,
        "+"   : 6,
        "-"   : 7,
        "<"   : 8,
        "<="  : 9,
        ">"   : 10,
        ">="  : 11,
        "=="  : 12,
        "!="  : 13,
        "&&"  : 14,
        "||"  : 15,
        "="   : 16
    }

    types = {
        "Error"     : -1,
        "Null"      : 0,
        "Int"       : 1,
        "Float"     : 2,
        "Bool"      : 3,
        "Char"      : 4,
        "Int[]"     : 5,
        "Float[]"   : 6,
        "Bool[]"    : 7,
        "Char[]"    : 8,
        "Int[][]"   : 9,
        "Float[][]" : 10,
        "Bool[][]"  : 11,
        "Char[][]"  : 12}

    scope = {
        "Local" : 1,
        "Global"  : 2
        # "Const"  : 3,
        # "Temp"   : 4
    }

class Arrays():
    operators = ["!", "+u", "-u", "*", "/", "%", "+", "-", "<", "<=", ">", ">=", "==", "!=", "&&", "||", "="]
    types = ["Null", "Int", "Float", "Bool", "Char", "Int[]", "Float[]", "Bool[]", "Char[]", "Int[][]", "Float[][]", "Bool[][]", "Char[][]"]
    socpe = [None, "Local", "Global"]

class Memory():
    stack = [0,
            [0,[],[],[],[]], #Local = 1
            [0,[],[],[],[]]] #Global = 2

    IntBase = 1000
    FloatBase = 2000
    BoolBase = 3000
    CharBase = 4000

    LocalBase= 10000
    GlobalBase= 20000

    dirFunctions = []


class Quadruples():
    stack  = []

class Semantics():
    square = [[-1 for y in range(3)] for x in range(13)]
    square[1][1] = 1
    square[1][2] = 1
    square[2][1] = 2
    square[2][2] = 2
    square[3][0] = 3

    cube = [[[-1 for z in range(17)] for y in range(13)] for x in range(13)]
    cube[1][1][3] = 1
    cube[1][1][4] = 2
    cube[1][1][5] = 1
    cube[1][1][6] = 1
    cube[1][1][7] = 1
    cube[1][1][8] = 3
    cube[1][1][9] = 3
    cube[1][1][10] = 3
    cube[1][1][11] = 3
    cube[1][1][12] = 3
    cube[1][1][13] = 3
    cube[1][1][16] = 1
    cube[1][2][3] = 2
    cube[1][2][4] = 2
    cube[1][2][5] = 2
    cube[1][2][6] = 2
    cube[1][2][7] = 2
    cube[1][2][8] = 3
    cube[1][2][9] = 3
    cube[1][2][10] = 3
    cube[1][2][11] = 3
    cube[1][2][12] = 3
    cube[1][2][13] = 3
    cube[1][2][16] = 1
    cube[2][1][3] = 2
    cube[2][1][4] = 2
    cube[2][1][5] = 2
    cube[2][1][6] = 2
    cube[2][1][7] = 2
    cube[2][1][8] = 3
    cube[2][1][9] = 3
    cube[2][1][10] = 3
    cube[2][1][11] = 3
    cube[2][1][12] = 3
    cube[2][1][13] = 3
    cube[2][1][16] = 2
    cube[2][2][3] = 2
    cube[2][2][4] = 2
    cube[2][2][5] = 2
    cube[2][2][6] = 2
    cube[2][2][7] = 2
    cube[2][2][8] = 3
    cube[2][2][9] = 3
    cube[2][2][10] = 3
    cube[2][2][11] = 3
    cube[2][2][12] = 3
    cube[2][2][13] = 3
    cube[2][2][16] = 2
    cube[3][3][12] = 3
    cube[3][3][13] = 3
    cube[3][3][14] = 3
    cube[3][3][15] = 3
    cube[3][3][16] = 3
    cube[4][4][6] = 8
    cube[4][4][12] = 3
    cube[4][4][13] = 3
    cube[4][4][16] = 4
    cube[4][8][6] = 8
    cube[5][5][12] = 3
    cube[5][5][13] = 3
    cube[5][6][12] = 3
    cube[5][6][13] = 3
    cube[6][5][12] = 3
    cube[6][5][13] = 3
    cube[6][6][12] = 3
    cube[6][6][13] = 3
    cube[7][7][12] = 3
    cube[7][7][13] = 3
    cube[8][4][6] = 8
    cube[8][8][6] = 8
    cube[8][8][12] = 3
    cube[8][8][13] = 3
    cube[9][9][12] = 3
    cube[9][9][13] = 3
    cube[9][10][12] = 3
    cube[9][10][13] = 3
    cube[10][9][12] = 3
    cube[10][9][13] = 3
    cube[10][10][12] = 3
    cube[10][10][13] = 3
    cube[11][11][12] = 3
    cube[11][11][13] = 3
    cube[12][12][12] = 3
    cube[12][12][13] = 3
    cube[12][4][16] = 12
