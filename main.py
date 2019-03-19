import sys
from antlr4 import *
from DASALexer import DASALexer
from DASAParser import DASAParser

def main(argv):
    input = FileStream(argv[1])
    lexer = DASALexer(input)
    stream = CommonTokenStream(lexer)
    parser = DASAParser(stream)
    tree = parser.programa()

if __name__ == '__main__':
    main(sys.argv)
