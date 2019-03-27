import sys
from antlr4 import *
from DASALexer import DASALexer
from DASAParser import DASAParser
from DASAListener import DASAListener
from Objetos import CuadroSemantico as s2
from Objetos import CuboSemantico as s3
from Objetos import Tipos as s2
from Objetos import Operadores as s3

def main(argv):
    input = FileStream(argv[1])
    lexer = DASALexer(input)
    stream = CommonTokenStream(lexer)
    parser = DASAParser(stream)
    tree = parser.programa()

    dasa = DASAListener()
    walker = ParseTreeWalker()
    walker.walk(dasa, tree)

    print(s2().semSquare[2][1])
    print(s3().semCube[1][1][9])
    

if __name__ == '__main__':
    main(sys.argv)
