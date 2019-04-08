# Generated from DASA.g4 by ANTLR 4.7.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .DASAParser import DASAParser
else:
    from DASAParser import DASAParser

from Objetos import CuadroSemantico
from Objetos import CuboSemantico
from Objetos import Tipos as dTypes
from Objetos import Operadores as dOper
from Objetos import Memoria as mem

# This class defines a complete listener for a parse tree produced by DASAParser.
class DASAListener(ParseTreeListener):

    types = {
        'Char'  : 4,
        'Bool'  : 3,
        'Float' : 2,
        'Int'   : 1
    }

    def __init__(self):
        self.functionsTable = []
        self.function = {}
        self.contFunc = 0
        
        self.globVars = []
        self.varsTable = []
        self.var = {}
        self.contVars = 0
        
        self.currType = ""
        self.currScope = ""
        self.currFunction = ""
        
        self.inBody = False
 
        self.stackPJ = [] #Brincos pendientes
        self.stackOP = []  # Operandos
        self.stackTypes = []
        self.stackOper = [] # Operaciones
        self.stackMem = []

        self.cuadruplos = []
        self.quad = {} # {Oper, Op1, Op2, Res}
        self.contCuadruplos = 0
        self.contTemp = 0


    # Enter a parse tree produced by DASAParser#programa.
    def enterPrograma(self, ctx:DASAParser.ProgramaContext):
        self.currScope= "Global"

    # Exit a parse tree produced by DASAParser#programa.
    def exitPrograma(self, ctx:DASAParser.ProgramaContext):
        self.function = {"Id" : "Global",
                         "Params" : 0,
                         "TiposParams" : [],
                         "Return" : "Void",
                         "SymTable" : self.globVars
                         }
        self.functionsTable.append(self.function)
        for x in self.functionsTable:
            print("{", x["Id"], x["Params"], x["TiposParams"], x["Return"], "}")
            for y in x["SymTable"]:
                print("\t", y)
        #print("Memoria local:", mem.memLocal)
        #print("Memoria global:", mem.memGlobal)
        print("Stack Operaciones", self.stackOper)
        print("Stack Types", self.stackTypes)
        print("Stack OP", self.stackOP)
        print("Stack Saltos", self.stackPJ)
        print("Cuadruplos Table:")
        for y in self.cuadruplos:
            print("\t", y)

    # Enter a parse tree produced by DASAParser#prog1.
    def enterProg1(self, ctx:DASAParser.Prog1Context):
        pass

    # Exit a parse tree produced by DASAParser#prog1.
    def exitProg1(self, ctx:DASAParser.Prog1Context):
        self.globVars = self.varsTable

    # Enter a parse tree produced by DASAParser#prog2.
    def enterProg2(self, ctx:DASAParser.Prog2Context):
        pass

    # Exit a parse tree produced by DASAParser#prog2.
    def exitProg2(self, ctx:DASAParser.Prog2Context):
        pass

    # Enter a parse tree produced by DASAParser#main.
    def enterMain(self, ctx:DASAParser.MainContext):
        self.varsTable = []
        self.function = {"Id" : "main",
                         "Params" : 0,
                         "TiposParams" : [],
                         "Return" : "Void",
                         "SymTable" : []}
        self.currScope= "Local"
        self.currFunction= "main"
        self.functionsTable.append(self.function)


    # Exit a parse tree produced by DASAParser#main.
    def exitMain(self, ctx:DASAParser.MainContext):
        pass

    # Enter a parse tree produced by DASAParser#main1.
    def enterMain1(self, ctx:DASAParser.Main1Context):
        self.inBody = False

    # Exit a parse tree produced by DASAParser#main1.
    def exitMain1(self, ctx:DASAParser.Main1Context):
        self.functionsTable[len(self.functionsTable)-1]["SymTable"] = self.varsTable


    # Enter a parse tree produced by DASAParser#main2.
    def enterMain2(self, ctx:DASAParser.Main2Context):
        self.inBody = True

    # Exit a parse tree produced by DASAParser#main2.
    def exitMain2(self, ctx:DASAParser.Main2Context):
        pass


    # Enter a parse tree produced by DASAParser#metodos.
    def enterMetodos(self, ctx:DASAParser.MetodosContext):
        self.varsTable = []
        self.function = {"Id" : "",
                         "Params" : 0,
                         "TiposParams" : [],
                         "Return" : "Void",
                         "SymTable" : []}
        self.currScope= "Local"
        self.currFunction= ctx.ID().getText()
        self.function["Id"] = ctx.ID().getText()
        self.functionsTable.append(self.function)

    # Exit a parse tree produced by DASAParser#metodos.
    def exitMetodos(self, ctx:DASAParser.MetodosContext):
        pass
        # print(self.function)

    # Enter a parse tree produced by DASAParser#met1.
    def enterMet1(self, ctx:DASAParser.Met1Context):
        self.inBody = False

    # Exit a parse tree produced by DASAParser#met1.
    def exitMet1(self, ctx:DASAParser.Met1Context):
        pass


    # Enter a parse tree produced by DASAParser#met2.
    def enterMet2(self, ctx:DASAParser.Met2Context):
        if ctx.getChildCount() > 0:
            self.function["Return"] = ctx.tipo().getText()

    # Exit a parse tree produced by DASAParser#met2.
    def exitMet2(self, ctx:DASAParser.Met2Context):
        pass


    # Enter a parse tree produced by DASAParser#met3.
    def enterMet3(self, ctx:DASAParser.Met3Context):
        self.inBody = False
        self.functionsTable[len(self.functionsTable)-1]["SymTable"] = self.varsTable

    # Exit a parse tree produced by DASAParser#met3.
    def exitMet3(self, ctx:DASAParser.Met3Context):
        pass


    # Enter a parse tree produced by DASAParser#met4.
    def enterMet4(self, ctx:DASAParser.Met4Context):
        self.inBody = True

    # Exit a parse tree produced by DASAParser#met4.
    def exitMet4(self, ctx:DASAParser.Met4Context):
        pass


    # Enter a parse tree produced by DASAParser#met5.
    def enterMet5(self, ctx:DASAParser.Met5Context):
        pass

    # Exit a parse tree produced by DASAParser#met5.
    def exitMet5(self, ctx:DASAParser.Met5Context):
        pass


    # Enter a parse tree produced by DASAParser#params.
    def enterParams(self, ctx:DASAParser.ParamsContext):
        self.function["Params"] += 1
        self.function["TiposParams"].append(ctx.tipo().getText())
        self.var = {"Name" : ctx.ID().getText(),
                    "Type" : ctx.tipo().getText(),
                    "Dims" : 0,
                    "SizeD1" : -1,
                    "SizeD2" : -1,
                    "HasValue" : False,
                    "Scope" : self.currScope,
                    # "Weight" :
                    "Address" : len(mem.memLocal[self.types[ctx.tipo().getText()]])
        }
        mem.memLocal[self.types[ctx.tipo().getText()]].append(None)
        self.varsTable.append(self.var)
        

    # Exit a parse tree produced by DASAParser#params.
    def exitParams(self, ctx:DASAParser.ParamsContext):
        pass


    # Enter a parse tree produced by DASAParser#vars_st.
    def enterVars_st(self, ctx:DASAParser.Vars_stContext):
        self.currType = ctx.tipo().getText()
       # print(type(self.currType))
        if(self.currScope == "Local"):
            addr = len(mem.memLocal[self.types[self.currType]])
            mem.memLocal[self.types[self.currType]].append(None)
        else:
            addr = len(mem.memGlobal[self.types[self.currType]])
            mem.memGlobal[self.types[self.currType]].append(None)
        self.var = {"Name" : "",
                    "Type" : self.currType,
                    "Dims" : 0,
                    "SizeD1" : -1,
                    "SizeD2" : -1,
                    "HasValue" : False,
                    "Scope" : self.currScope,
                    # "Weight" :
                    "Address" : addr
                    }


    # Exit a parse tree produced by DASAParser#vars_st.
    def exitVars_st(self, ctx:DASAParser.Vars_stContext):
        self.varsTable.append(self.var)


    # Enter a parse tree produced by DASAParser#vars1.
    def enterVars1(self, ctx:DASAParser.Vars1Context):
        pass

    # Exit a parse tree produced by DASAParser#vars1.
    def exitVars1(self, ctx:DASAParser.Vars1Context):
        if ctx.getChildCount() > 0:
            self.var["Dims"] += 1
            self.var["SizeD1"] = int(ctx.CINT().getText())


    # Enter a parse tree produced by DASAParser#vars2.
    def enterVars2(self, ctx:DASAParser.Vars2Context):
        if ctx.getChildCount() > 0:
            self.var["Dims"] += 1
            self.var["SizeD2"] = int(ctx.CINT().getText())

    # Exit a parse tree produced by DASAParser#vars2.
    def exitVars2(self, ctx:DASAParser.Vars2Context):
        pass


    # Enter a parse tree produced by DASAParser#vars3.
    def enterVars3(self, ctx:DASAParser.Vars3Context):
        self.var["Name"] = ctx.ID().getText()

    # Exit a parse tree produced by DASAParser#vars3.
    def exitVars3(self, ctx:DASAParser.Vars3Context):
        pass


    # Enter a parse tree produced by DASAParser#vars4.
    def enterVars4(self, ctx:DASAParser.Vars4Context):
        pass

    # Exit a parse tree produced by DASAParser#vars4.
    def exitVars4(self, ctx:DASAParser.Vars4Context):
        pass


    # Enter a parse tree produced by DASAParser#vars5.
    def enterVars5(self, ctx:DASAParser.Vars5Context):
        #  print("")
        #   print(self.currScope)
        val = ctx.cte().getText()
        #     print("val", type(val))
        #    print("type", type(self.currType))

        # if self.currScope == "Local":
        #     #print(self.currType)
        #     if(self.currType == "Bool"):
        #         if(val == "True"):
        #             mem.memLocal[3][len(mem.memLocal[3])-1] = True
        #         else:
        #             mem.memLocal[3][len(mem.memLocal[3])-1] = False
        #     if(self.currType == "Char"):
        #         mem.memLocal[4][len(mem.memLocal[4])-1] = val.replace("'","")
        #     if(self.currType == "Float"):
        #         mem.memLocal[2][len(mem.memLocal[2])-1] = float(val)
        #     if(self.currType == "Int"):
        #         mem.memLocal[1][len(mem.memLocal[1])-1] = int(val)
        # else:
        #     if(self.currType == "Bool"):
        #         if(val == "True"):
        #             mem.memGlobal[3][len(mem.memGlobal[3])-1] = True
        #         else:
        #             mem.memGlobal[3][len(mem.memGlobal[3])-1] = False
        #     if(self.currType == "Char"):
        #         mem.memGlobal[4][len(mem.memGlobal[4])-1] = val.replace("'","")
        #     if(self.currType == "Float"):
        #         mem.memGlobal[2][len(mem.memGlobal[2])-1] = float(val)
        #     if(self.currType == "Int"):
        #         mem.memGlobal[1][len(mem.memGlobal[1])-1] = int(val)
        # if(ctx.cte().getText() != "Null"):
        #     self.var["HasValue"] = True

    # Exit a parse tree produced by DASAParser#vars5.
    def exitVars5(self, ctx:DASAParser.Vars5Context):
        pass      

    # Enter a parse tree produced by DASAParser#vars6.
    def enterVars6(self, ctx:DASAParser.Vars6Context):
        pass

    # Exit a parse tree produced by DASAParser#vars6.
    def exitVars6(self, ctx:DASAParser.Vars6Context):
        pass


    # Enter a parse tree produced by DASAParser#estatuto.
    def enterEstatuto(self, ctx:DASAParser.EstatutoContext):
        pass

    # Exit a parse tree produced by DASAParser#estatuto.
    def exitEstatuto(self, ctx:DASAParser.EstatutoContext):
        pass


    # Enter a parse tree produced by DASAParser#asignacion.
    def enterAsignacion(self, ctx:DASAParser.AsignacionContext):
        self.stackOP.append(ctx.getChild(0).getText())
        tempvalType = ""
        for f in self.functionsTable:
            if f["Id"] == self.currFunction:
                for v in f["SymTable"]:
                    if v["Name"] == ctx.getChild(0).getText():
                        tempvalType = v["Type"]
        self.stackTypes.append(self.types[tempvalType])
        self.stackOper.append(dOper.dicOperations['='])

    # Exit a parse tree produced by DASAParser#asignacion.
    def exitAsignacion(self, ctx:DASAParser.AsignacionContext):
        self.quad["Oper"] = self.stackOper.pop()
        self.quad["Op1"] = self.stackOP.pop()
        self.quad["Res"] = self.stackOP.pop()
        type1 = self.stackTypes.pop()
        res = self.stackTypes.pop()
        typeRes = CuboSemantico.semCube[type1][res][16]
        if(typeRes != -1):
            self.cuadruplos.append(self.quad)
            self.quad = {}
            self.contCuadruplos += 1
        else:
            raise Exception("you cannot assign those different types")

        


    # Enter a parse tree produced by DASAParser#asig1.
    def enterAsig1(self, ctx:DASAParser.Asig1Context):
        pass

    # Exit a parse tree produced by DASAParser#asig1.
    def exitAsig1(self, ctx:DASAParser.Asig1Context):
        pass


    # Enter a parse tree produced by DASAParser#asig2.
    def enterAsig2(self, ctx:DASAParser.Asig2Context):
        pass

    # Exit a parse tree produced by DASAParser#asig2.
    def exitAsig2(self, ctx:DASAParser.Asig2Context):
        pass


    # Enter a parse tree produced by DASAParser#durante.
    def enterDurante(self, ctx:DASAParser.DuranteContext):
        pass

    # Exit a parse tree produced by DASAParser#durante.
    def exitDurante(self, ctx:DASAParser.DuranteContext):
        pass


    # Enter a parse tree produced by DASAParser#condicion.
    def enterCondicion(self, ctx:DASAParser.CondicionContext):
        pass

    # Exit a parse tree produced by DASAParser#condicion.
    def exitCondicion(self, ctx:DASAParser.CondicionContext):
        pass


    # Enter a parse tree produced by DASAParser#con1.
    def enterCon1(self, ctx:DASAParser.Con1Context):
        pass

    # Exit a parse tree produced by DASAParser#con1.
    def exitCon1(self, ctx:DASAParser.Con1Context):
        pass


    # Enter a parse tree produced by DASAParser#lectura.
    def enterLectura(self, ctx:DASAParser.LecturaContext):
        pass

    # Exit a parse tree produced by DASAParser#lectura.
    def exitLectura(self, ctx:DASAParser.LecturaContext):
        pass


    # Entera parse tree produced by DASAParser#lec1.
    def enterLec1(self, ctx:DASAParser.Lec1Context):
        pass

    # Exit a parse tree produced by DASAParser#lec1.
    def exitLec1(self, ctx:DASAParser.Lec1Context):
        pass


    # Enter a parse tree produced by DASAParser#lec2.
    def enterLec2(self, ctx:DASAParser.Lec2Context):
        pass

    # Exit a parse tree produced by DASAParser#lec2.
    def exitLec2(self, ctx:DASAParser.Lec2Context):
        pass


    # Enter a parse tree produced by DASAParser#arreglo.
    def enterArreglo(self, ctx:DASAParser.ArregloContext):
        pass

    # Exit a parse tree produced by DASAParser#arreglo.
    def exitArreglo(self, ctx:DASAParser.ArregloContext):
        pass


    # Enter a parse tree produced by DASAParser#arr1.
    def enterArr1(self, ctx:DASAParser.Arr1Context):
        pass

    # Exit a parse tree produced by DASAParser#arr1.
    def exitArr1(self, ctx:DASAParser.Arr1Context):
        pass


    # Enter a parse tree produced by DASAParser#arr2.
    def enterArr2(self, ctx:DASAParser.Arr2Context):
        pass

    # Exit a parse tree produced by DASAParser#arr2.
    def exitArr2(self, ctx:DASAParser.Arr2Context):
        pass


    # Enter a parse tree produced by DASAParser#arr3.
    def enterArr3(self, ctx:DASAParser.Arr3Context):
        pass

    # Exit a parse tree produced by DASAParser#arr3.
    def exitArr3(self, ctx:DASAParser.Arr3Context):
        pass


    # Enter a parse tree produced by DASAParser#arr4.
    def enterArr4(self, ctx:DASAParser.Arr4Context):
        pass

    # Exit a parse tree produced by DASAParser#arr4.
    def exitArr4(self, ctx:DASAParser.Arr4Context):
        pass


    # Enter a parse tree produced by DASAParser#arr5.
    def enterArr5(self, ctx:DASAParser.Arr5Context):
        pass

    # Exit a parse tree produced by DASAParser#arr5.
    def exitArr5(self, ctx:DASAParser.Arr5Context):
        pass


    # Enter a parse tree produced by DASAParser#arr6.
    def enterArr6(self, ctx:DASAParser.Arr6Context):
        pass

    # Exit a parse tree produced by DASAParser#arr6.
    def exitArr6(self, ctx:DASAParser.Arr6Context):
        pass


    # Enter a parse tree produced by DASAParser#arr7.
    def enterArr7(self, ctx:DASAParser.Arr7Context):
        pass

    # Exit a parse tree produced by DASAParser#arr7.
    def exitArr7(self, ctx:DASAParser.Arr7Context):
        pass


    # Enter a parse tree produced by DASAParser#cte.
    def enterCte(self, ctx:DASAParser.CteContext):
        if self.inBody:
            self.stackOP.append(ctx.getChild(0).getText())
            ctetemp = ctx.getChild(0).getText()
            tmpType = -1
            
            if ctetemp.find('"') >= 0:
                tmpType = 8
            elif ctetemp.find("'") >= 0:
                tmpType = 4
            elif ctetemp == "True" or ctetemp == "False":
                tmpType = 3
            elif ctetemp.find('.') >= 0:
                tmpType = 2
            elif ctetemp == "Null":
                tmpType = 0
            else:
                tmpType = 1
            self.stackTypes.append(tmpType)
            
    # Exit a parse tree produced by DASAParser#cte.
    def exitCte(self, ctx:DASAParser.CteContext):
        pass


    # Enter a parse tree produced by DASAParser#tipo.
    def enterTipo(self, ctx:DASAParser.TipoContext):
        pass

    # Exit a parse tree produced by DASAParser#tipo.
    def exitTipo(self, ctx:DASAParser.TipoContext):
        pass

    # Enter a parse tree produced by DASAParser#bloque.
    def enterBloque(self, ctx:DASAParser.BloqueContext):
        pass

    # Exit a parse tree produced by DASAParser#bloque.
    def exitBloque(self, ctx:DASAParser.BloqueContext):
        pass


    # Enter a parse tree produced by DASAParser#bloque1.
    def enterBloque1(self, ctx:DASAParser.Bloque1Context):
        pass

    # Exit a parse tree produced by DASAParser#bloque1.
    def exitBloque1(self, ctx:DASAParser.Bloque1Context):
        pass


    # Enter a parse tree produced by DASAParser#escritura.
    def enterEscritura(self, ctx:DASAParser.EscrituraContext):
        pass

    # Exit a parse tree produced by DASAParser#escritura.
    def exitEscritura(self, ctx:DASAParser.EscrituraContext):
        pass


    # Enter a parse tree produced by DASAParser#estdesc.
    def enterEstdesc(self, ctx:DASAParser.EstdescContext):
        pass

    # Exit a parse tree produced by DASAParser#estdesc.
    def exitEstdesc(self, ctx:DASAParser.EstdescContext):
        pass


    # Enter a parse tree produced by DASAParser#dibujar.
    def enterDibujar(self, ctx:DASAParser.DibujarContext):
        pass

    # Exit a parse tree produced by DASAParser#dibujar.
    def exitDibujar(self, ctx:DASAParser.DibujarContext):
        pass


    # Enter a parse tree produced by DASAParser#regresion.
    def enterRegresion(self, ctx:DASAParser.RegresionContext):
        pass

    # Exit a parse tree produced by DASAParser#regresion.
    def exitRegresion(self, ctx:DASAParser.RegresionContext):
        pass


    # Enter a parse tree produced by DASAParser#reg1.
    def enterReg1(self, ctx:DASAParser.Reg1Context):
        pass

    # Exit a parse tree produced by DASAParser#reg1.
    def exitReg1(self, ctx:DASAParser.Reg1Context):
        pass


    # Enter a parse tree produced by DASAParser#clustering.
    def enterClustering(self, ctx:DASAParser.ClusteringContext):
        pass

    # Exit a parse tree produced by DASAParser#clustering.
    def exitClustering(self, ctx:DASAParser.ClusteringContext):
        pass


    # Enter a parse tree produced by DASAParser#funcion.
    def enterFuncion(self, ctx:DASAParser.FuncionContext):
        pass

    # Exit a parse tree produced by DASAParser#funcion.
    def exitFuncion(self, ctx:DASAParser.FuncionContext):
        pass


    # Enter a parse tree produced by DASAParser#func1.
    def enterFunc1(self, ctx:DASAParser.Func1Context):
        pass

    # Exit a parse tree produced by DASAParser#func1.
    def exitFunc1(self, ctx:DASAParser.Func1Context):
        pass


    # Enter a parse tree produced by DASAParser#func2.
    def enterFunc2(self, ctx:DASAParser.Func2Context):
        pass

    # Exit a parse tree produced by DASAParser#func2.
    def exitFunc2(self, ctx:DASAParser.Func2Context):
        pass


    # Enter a parse tree produced by DASAParser#regresa.
    def enterRegresa(self, ctx:DASAParser.RegresaContext):
        pass

    # Exit a parse tree produced by DASAParser#regresa.
    def exitRegresa(self, ctx:DASAParser.RegresaContext):
        pass


    # Enter a parse tree produced by DASAParser#expresion.
    def enterExpresion(self, ctx:DASAParser.ExpresionContext):
        pass

    # Exit a parse tree produced by DASAParser#expresion.
    def exitExpresion(self, ctx:DASAParser.ExpresionContext):
        pass


    # Enter a parse tree produced by DASAParser#expres1.
    def enterExpres1(self, ctx:DASAParser.Expres1Context):
        pass

    # Exit a parse tree produced by DASAParser#expres1.
    def exitExpres1(self, ctx:DASAParser.Expres1Context):
        if self.stackOper:
            top = self.stackOper[len(self.stackOper)-1]
            if top == 14 or top == 15:
                self.quad["Op2"]=self.stackOP.pop()
                self.quad["Op1"]=self.stackOP.pop()
                self.quad["Oper"]= self.stackOper.pop()
                type2 = self.stackTypes.pop()
                type1 = self.stackTypes.pop()
                typeRes = CuboSemantico.semCube[type1][type2][top]
                if(typeRes != -1):
                    temp = mem.memTemp[self.contTemp]
                    self.quad["Res"] = temp
                    self.contTemp += 1
                    self.stackOP.append(temp)
                    self.stackTypes.append(typeRes)
                    self.cuadruplos.append(self.quad)
                    print("temp cuad", self.quad)
                    self.quad = {}
                    self.contCuadruplos += 1
                else:
                    raise Exception("error: not possible") 
                


    # Enter a parse tree produced by DASAParser#expres2.
    def enterExpres2(self, ctx:DASAParser.Expres2Context):
        pass

    # Exit a parse tree produced by DASAParser#expres2.
    def exitExpres2(self, ctx:DASAParser.Expres2Context):
        opttemp= ctx.getChild(0).getText()
        self.stackOper.append(dOper.dicOperations[opttemp])


    # Enter a parse tree produced by DASAParser#comp.
    def enterComp(self, ctx:DASAParser.CompContext):
        pass

    # Exit a parse tree produced by DASAParser#comp.
    def exitComp(self, ctx:DASAParser.CompContext):
        pass


    # Enter a parse tree produced by DASAParser#comp1.
    def enterComp1(self, ctx:DASAParser.Comp1Context):
        pass

    # Exit a parse tree produced by DASAParser#comp1.
    def exitComp1(self, ctx:DASAParser.Comp1Context):
        if self.stackOper:
            top = self.stackOper[len(self.stackOper)-1]
            if top == 8 or top == 9 or top == 10 or top == 11 or top == 12 or top == 13:
                self.quad["Op2"]=self.stackOP.pop()
                self.quad["Op1"]=self.stackOP.pop()
                self.quad["Oper"]= self.stackOper.pop()
                type2 = self.stackTypes.pop()
                type1 = self.stackTypes.pop()
                typeRes = CuboSemantico.semCube[type1][type2][top]
                if(typeRes != -1):
                    temp = mem.memTemp[self.contTemp]
                    self.quad["Res"] = temp
                    self.contTemp += 1
                    self.stackOP.append(temp)
                    self.stackTypes.append(typeRes)
                    self.cuadruplos.append(self.quad)
                    print("temp cuad", self.quad)
                    self.quad = {}
                    self.contCuadruplos += 1
                else:
                    raise Exception("error: not possible") 
                    


    # Enter a parse tree produced by DASAParser#comp2.
    def enterComp2(self, ctx:DASAParser.Comp2Context):
        pass

    # Exit a parse tree produced by DASAParser#comp2.
    def exitComp2(self, ctx:DASAParser.Comp2Context):
        opttemp= ctx.getChild(0).getText()
        self.stackOper.append(dOper.dicOperations[opttemp])


    # Enter a parse tree produced by DASAParser#exp.
    def enterExp(self, ctx:DASAParser.ExpContext):
        pass

    # Exit a parse tree produced by DASAParser#exp.
    def exitExp(self, ctx:DASAParser.ExpContext):
        pass


    # Enter a parse tree produced by DASAParser#exp1.
    def enterExp1(self, ctx:DASAParser.Exp1Context):
        pass

    # Exit a parse tree produced by DASAParser#exp1.
    def exitExp1(self, ctx:DASAParser.Exp1Context):
        if self.stackOper:
            top = self.stackOper[len(self.stackOper)-1]
            if top == 6 or top == 7:
                self.quad["Op2"]=self.stackOP.pop()
                self.quad["Op1"]=self.stackOP.pop()
                self.quad["Oper"]= self.stackOper.pop()
                type2 = self.stackTypes.pop()
                type1 = self.stackTypes.pop()
                typeRes = CuboSemantico.semCube[type1][type2][top]
                if(typeRes != -1):
                    temp = mem.memTemp[self.contTemp]
                    self.quad["Res"] = temp
                    self.contTemp += 1
                    self.stackOP.append(temp)
                    self.stackTypes.append(typeRes)
                    self.cuadruplos.append(self.quad)
                    print("temp cuad", self.quad)                   
                    self.quad = {}
                    self.contCuadruplos += 1

                else:
                    raise Exception("error: not possible") 
                    

    # Enter a parse tree produced by DASAParser#exp2.
    def enterExp2(self, ctx:DASAParser.Exp2Context):
        pass

    # Exit a parse tree produced by DASAParser#exp2.
    def exitExp2(self, ctx:DASAParser.Exp2Context):
        opttemp= ctx.getChild(0).getText()
        self.stackOper.append(dOper.dicOperations[opttemp])

    # Enter a parse tree produced by DASAParser#termino.
    def enterTermino(self, ctx:DASAParser.TerminoContext):
        pass

    # Exit a parse tree produced by DASAParser#termino.
    def exitTermino(self, ctx:DASAParser.TerminoContext):
        pass


    # Enter a parse tree produced by DASAParser#term1.
    def enterTerm1(self, ctx:DASAParser.Term1Context):
        pass

    # Exit a parse tree produced by DASAParser#term1.
    def exitTerm1(self, ctx:DASAParser.Term1Context):
        if self.stackOper:
            top = self.stackOper[len(self.stackOper)-1]
            if top == 3 or top == 4 or top == 5:
                self.quad["Op2"]=self.stackOP.pop()
                self.quad["Op1"]=self.stackOP.pop()
                self.quad["Oper"]= self.stackOper.pop()
                type2 = self.stackTypes.pop()
                type1 = self.stackTypes.pop()
                typeRes = CuboSemantico.semCube[type1][type2][top]
                if(typeRes != -1):
                    temp = mem.memTemp[self.contTemp]
                    self.quad["Res"] = temp
                    self.contTemp += 1
                    self.stackOP.append(temp)
                    self.stackTypes.append(typeRes)
                    self.cuadruplos.append(self.quad)
                    print("temp cuad", self.quad)
                    self.quad = {}
                    self.contCuadruplos += 1

                else:
                    raise Exception("error: not possible") 
                


    # Enter a parse tree produced by DASAParser#term2.
    def enterTerm2(self, ctx:DASAParser.Term2Context):
        pass

    # Exit a parse tree produced by DASAParser#term2.
    def exitTerm2(self, ctx:DASAParser.Term2Context):
        opttemp= ctx.getChild(0).getText()
        self.stackOper.append(dOper.dicOperations[opttemp])


    # Enter a parse tree produced by DASAParser#factor.
    def enterFactor(self, ctx:DASAParser.FactorContext):
        pass

    # Exit a parse tree produced by DASAParser#factor.
    def exitFactor(self, ctx:DASAParser.FactorContext):
        if self.stackOper:
            top = self.stackOper[len(self.stackOper)-1]
            if top == 0 or top == 1 or top == 2:
                self.quad["Op1"]=self.stackOP.pop()
                self.quad["Oper"]= self.stackOper.pop()
                type1 = self.stackTypes.pop()
                typeRes = CuadroSemantico.semSquare[type1][top]
                if(typeRes != -1):
                    temp = mem.memTemp[self.contTemp]
                    self.quad["Res"] = temp
                    self.contTemp += 1
                    self.stackOP.append(temp)
                    self.stackTypes.append(typeRes)
                    self.cuadruplos.append(self.quad)
                    print("temp cuad", self.quad)
                    self.quad = {}
                    self.contCuadruplos += 1
                else:
                    raise Exception("error: not possible")
        pass


    # Enter a parse tree produced by DASAParser#fact1.
    def enterFact1(self, ctx:DASAParser.Fact1Context):
        pass 

    # Exit a parse tree produced by DASAParser#fact1.
    def exitFact1(self, ctx:DASAParser.Fact1Context):
        if ctx.getChildCount():
            opttemp= ctx.getChild(0).getText()
            self.stackOper.append(dOper.dicOperations[opttemp])


    # Enter a parse tree produced by DASAParser#fact2.
    def enterFact2(self, ctx:DASAParser.Fact2Context):
        pass

    # Exit a parse tree produced by DASAParser#fact2.
    def exitFact2(self, ctx:DASAParser.Fact2Context):
        pass


    # Enter a parse tree produced by DASAParser#fact3.
    def enterFact3(self, ctx:DASAParser.Fact3Context):
        pass

    # Exit a parse tree produced by DASAParser#fact3.
    def exitFact3(self, ctx:DASAParser.Fact3Context):
        pass


    # Enter a parse tree produced by DASAParser#valor.
    def enterValor(self, ctx:DASAParser.ValorContext):
        pass

    # Exit a parse tree produced by DASAParser#valor.
    def exitValor(self, ctx:DASAParser.ValorContext):
        if ctx.getChildCount() == 2:
            print("leyendo id:", ctx.getChild(0).getText())
            self.stackOP.append(ctx.getChild(0).getText())
            tempvalType = ""
            for f in self.functionsTable:
                if f["Id"] == self.currFunction:
                    for v in f["SymTable"]:
                        if v["Name"] == ctx.getChild(0).getText():
                            tempvalType = v["Type"]
            self.stackTypes.append(self.types[tempvalType])


    # Enter a parse tree produced by DASAParser#valor1.
    def enterValor1(self, ctx:DASAParser.Valor1Context):
        pass

    # Exit a parse tree produced by DASAParser#valor1.
    def exitValor1(self, ctx:DASAParser.Valor1Context):
        pass


    # Enter a parse tree produced by DASAParser#valor2.
    def enterValor2(self, ctx:DASAParser.Valor2Context):
        pass

    # Exit a parse tree produced by DASAParser#valor2.
    def exitValor2(self, ctx:DASAParser.Valor2Context):
        pass


    # Enter a parse tree produced by DASAParser#vacio.
    def enterVacio(self, ctx:DASAParser.VacioContext):
        pass

    # Exit a parse tree produced by DASAParser#vacio.
    def exitVacio(self, ctx:DASAParser.VacioContext):
        pass


    # Enter a parse tree produced by DASAParser#castint.
    def enterCastint(self, ctx:DASAParser.CastintContext):
        pass

    # Exit a parse tree produced by DASAParser#castint.
    def exitCastint(self, ctx:DASAParser.CastintContext):
        pass


    # Enter a parse tree produced by DASAParser#castfloat.
    def enterCastfloat(self, ctx:DASAParser.CastfloatContext):
        pass

    # Exit a parse tree produced by DASAParser#castfloat.
    def exitCastfloat(self, ctx:DASAParser.CastfloatContext):
        pass


    # Enter a parse tree produced by DASAParser#castarrchar.
    def enterCastarrchar(self, ctx:DASAParser.CastarrcharContext):
        pass

    # Exit a parse tree produced by DASAParser#castarrchar.
    def exitCastarrchar(self, ctx:DASAParser.CastarrcharContext):
        pass



