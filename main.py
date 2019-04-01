import sys
from antlr4 import *
from DASALexer import DASALexer
from DASAParser import DASAParser
from DASAListener import DASAListener


def main(argv):
    input = FileStream(argv[1])
    lexer = DASALexer(input)
    stream = CommonTokenStream(lexer)
    parser = DASAParser(stream)
    tree = parser.programa()

    dasa = DASAListener()
    walker = ParseTreeWalker()
    walker.walk(dasa, tree)

if __name__ == '__main__':
    main(sys.argv)
