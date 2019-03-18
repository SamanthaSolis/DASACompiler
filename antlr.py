import sys
from antlr4 import *
from DASA import DASALexer
from DASAParser import DASAParser
from HtmlDASAListener import HtmlDASAListener

def main(argv):
    input = FileStream(argv[1])
    lexer = DASALexer(input)
    stream = CommonTokenStream(lexer)
    parser = DASAParser(stream)
    tree = parser.DASA()

    output = open("output.html","w")

    htmlDASA = HtmlDASAListener(output)
    walker = ParseTreeWalker()
    walker.walk(htmlDASA, tree)

    output.close()

if __name__ == '__main__':
    main(sys.argv)
