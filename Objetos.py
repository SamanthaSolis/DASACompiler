class Memoria():
    memGlobal = [0, [], [], [], []] # [0, [Bool], [Char], [Float], [Int]]    
    memLocal = [0, [], [], [], []] # [0, [Bool], [Char], [Float], [Int]]
    ##memTemp = [0, [], [], [], []] # [0, [Bool], [Char], [Float], [Int]]
    memConst = [0, [], [], [], []] # [0, [Bool], [Char], [Float], [Int]]
    memTemp = []
    for i in range(0, 500):
        memTemp.append("t"+str(i))

class Operadores():
    dicOperations = {"!"  : 0,
                     "+u"  : 1,
                     "-u"  : 2,
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
                     "=" :16}

class Tipos():
    dicTypes = {"Error"     : -1,
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


class CuadroSemantico():
    semSquare = [[-1 for y in range(3)] for x in range(13)]
    
    semSquare[1][1] = 1
    semSquare[1][2] = 1
    semSquare[2][1] = 2
    semSquare[2][2] = 2
    semSquare[3][0] = 3

class CuboSemantico():
    semCube = [[[-1 for z in range(17)] for y in range(13)] for x in range(13)]
    
    semCube[1][1][3] = 1
    semCube[1][1][4] = 2
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
    
    
        