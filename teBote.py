# Generated from DASA.g4 by ANTLR 4.7.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .DASAParser import DASAParser
else:
    from DASAParser import DASAParser

from Objetos import Dictionaries as dicc
from Objetos import Semantics as sem
from Objetos import Memory as mem
from Objetos import Quadruples as quads

# This class defines a complete listener for a parse tree produced by DASAParser.
class DASAListener(ParseTreeListener):

    def __init__(self):
        self.currType = 0
        self.currScope = 0
        self.ongoingFunc = 0
        self.ongoingVar = -1
        self.paramCounter = 0

        self.inBody = False

        self.stackPJ = [] #Brincos pendientes
        self.stackOP = []  # Operandos numeros
        self.stackTypes = []
        self.stackOper = [] # Operaciones simbolo
        # self.stackMem = []

        self.contCuadruplos = 0
        self.contTemp = [0, 0, 0, 0, 0]


    # Enter a parse tree produced by DASAParser#programa.
    def enterPrograma(self, ctx:DASAParser.ProgramaContext):
        self.currScope= 2
        function = {
            "Id" : "Global",
            "Params" : 0,
            "ParamTypes" : [],
            "StartQuad" : 0,
            "Return" : 0,
            "Signature" : [0, 0, 0, 0, 0],
            "SymTable" : []
        }
        mem.dirFunctions.append(function)
        self.ongoingFunc = 0
        self.ongoingVar = -1

        quad = {
            "Oper" : "GOTO"
        }
        quads.stack.append(quad)
        self.contCuadruplos += 1

    # Exit a parse tree produced by DASAParser#programa.
    def exitPrograma(self, ctx:DASAParser.ProgramaContext):
        for x in mem.dirFunctions:
            print("{function:", x["Id"], "Parameters:", x["Params"], "Param types:", x["ParamTypes"], "Return type:", x["Return"], "Start quad:", x["StartQuad"], "}")
            for y in x["SymTable"]:
                print("\t", y)
        #print("Memoria local:", mem.memLocal)
        #print("Memoria global:", mem.memGlobal)
        print("Stack Operaciones", self.stackOper)
        print("Stack Types", self.stackTypes)
        print("Stack OP", self.stackOP)
        print("Stack Saltos", self.stackPJ)
        print("Cuadruplos Table:")
        for q in quads.stack:
            res = str(quads.stack.index(q)) + "- {Oper: "
            if "Oper" in q:
                res += str(q["Oper"])
            else:
                res += "-"
            res += ", Op1: "
            if "Op1" in q:
                res += str(q["Op1"])
            else:
                res += "-"
            res += ", Op2: "
            if "Op2" in q:
                res += str(q["Op2"])
            else:
                res += "-"
            res += ", Res: "
            if "Res" in q:
                res += str(q["Res"])
            else:
                res += "-"
            res += "}"
            print(res)

    # Enter a parse tree produced by DASAParser#prog1.
    def enterProg1(self, ctx:DASAParser.Prog1Context):
        pass

    # Exit a parse tree produced by DASAParser#prog1.
    def exitProg1(self, ctx:DASAParser.Prog1Context):
        pass

    # Enter a parse tree produced by DASAParser#prog2.
    def enterProg2(self, ctx:DASAParser.Prog2Context):
        pass

    # Exit a parse tree produced by DASAParser#prog2.
    def exitProg2(self, ctx:DASAParser.Prog2Context):
        pass

    # Enter a parse tree produced by DASAParser#main.
    def enterMain(self, ctx:DASAParser.MainContext):
        function = {
            "Id" : "main",
            "Params" : 0,
            "ParamTypes" : [],
            "Return" : 0,
            "StartQuad" : self.contCuadruplos,
            "Signature" : [0, 0, 0, 0, 0],
            "SymTable" : []
        }
        self.currScope= 1
        # self.currFunction= "main"
        mem.dirFunctions.append(function)
        self.ongoingFunc += 1
        self.ongoingVar = -1
        quads.stack[0]["Res"] = self.contCuadruplos

    # Exit a parse tree produced by DASAParser#main.
    def exitMain(self, ctx:DASAParser.MainContext):
        quad = {
            "Oper" : "END"
        }
        quads.stack.append(quad)
        self.contCuadruplos += 1

    # Enter a parse tree produced by DASAParser#main1.
    def enterMain1(self, ctx:DASAParser.Main1Context):
        self.inBody = False

    # Exit a parse tree produced by DASAParser#main1.
    def exitMain1(self, ctx:DASAParser.Main1Context):
        #mem.dirFunctions[len(mem.dirFunctions)-1]["SymTable"] = self.varsTable
        pass

    # Enter a parse tree produced by DASAParser#main2.
    def enterMain2(self, ctx:DASAParser.Main2Context):
        self.inBody = True

    # Exit a parse tree produced by DASAParser#main2.
    def exitMain2(self, ctx:DASAParser.Main2Context):
        pass


    # Enter a parse tree produced by DASAParser#metodos.
    def enterMetodos(self, ctx:DASAParser.MetodosContext):
        function = {
            "Id" : ctx.ID().getText(),
            "Params" : 0,
            "ParamTypes" : [],
            "Return" : 0,
            "StartQuad" : self.contCuadruplos,
            "Signature" : [0, 0, 0, 0, 0],
            "SymTable" : []
        }
        self.currScope= 1
        mem.dirFunctions.append(function)
        self.ongoingFunc += 1
        self.ongoingVar = -1

    # Exit a parse tree produced by DASAParser#metodos.
    def exitMetodos(self, ctx:DASAParser.MetodosContext):
        quad = {
            "Oper" : "ENDPROC",
            "Op1" : None,
            "Op2" : None,
            "Res" : None
        }
        quads.stack.append(quad)
        self.contCuadruplos += 1

    # Enter a parse tree produced by DASAParser#met1.
    def enterMet1(self, ctx:DASAParser.Met1Context):
        self.inBody = False

    # Exit a parse tree produced by DASAParser#met1.
    def exitMet1(self, ctx:DASAParser.Met1Context):
        pass


    # Enter a parse tree produced by DASAParser#met2.
    def enterMet2(self, ctx:DASAParser.Met2Context):
        if ctx.getChildCount() > 0:
            mem.dirFunctions[self.ongoingFunc]["Return"] = dicc.types[ctx.tipo().getText()]

    # Exit a parse tree produced by DASAParser#met2.
    def exitMet2(self, ctx:DASAParser.Met2Context):
        pass


    # Enter a parse tree produced by DASAParser#met3.
    def enterMet3(self, ctx:DASAParser.Met3Context):
        self.inBody = False
        # mem.dirFunctions[ongoingFunc]["SymTable"] = self.varsTable

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
        mem.dirFunctions[self.ongoingFunc]["Params"] += 1
        tmpType = dicc.types[ctx.tipo().getText()]
        mem.dirFunctions[self.ongoingFunc]["ParamTypes"].append(dicc.types[ctx.tipo().getText()])
        var = {
            "Id" : ctx.ID().getText(),
            "Type" : tmpType,
            "Dims" : 0,
            "SizeD1" : -1,
            "SizeD2" : -1,
            "HasValue" : False,
            "Scope" : self.currScope,
            "Address" : "param"# genAddress(self.currScope, tmpType,len(self.function["Signature"][self.currType]))
        }
        mem.dirFunctions[self.ongoingFunc]["Signature"][tmpType] += 1
        mem.dirFunctions[self.ongoingFunc]["SymTable"].append(var)
        self.ongoingVar += 1


    # Exit a parse tree produced by DASAParser#params.
    def exitParams(self, ctx:DASAParser.ParamsContext):
        pass


    # Enter a parse tree produced by DASAParser#vars_st.
    def enterVars_st(self, ctx:DASAParser.Vars_stContext):
        self.currType = dicc.types[ctx.tipo().getText()]
       # print(type(self.currType))
        var = {
            "Id" : "",
            "Type" : self.currType,
            "Dims" : 0,
            "SizeD1" : -1,
            "SizeD2" : -1,
            "HasValue" : False,
            "Scope" : self.currScope,
            "Address" : "var" # genAddress(self.currScope,self.currType,len(self.function["Signature"][self.currType]))
        }
        mem.dirFunctions[self.ongoingFunc]["Signature"][self.currType] += 1
        mem.dirFunctions[self.ongoingFunc]["SymTable"].append(var)
        self.ongoingVar += 1


    # Exit a parse tree produced by DASAParser#vars_st.
    def exitVars_st(self, ctx:DASAParser.Vars_stContext):
        pass


    # Enter a parse tree produced by DASAParser#vars1.
    def enterVars1(self, ctx:DASAParser.Vars1Context):
        pass

    # Exit a parse tree produced by DASAParser#vars1.
    def exitVars1(self, ctx:DASAParser.Vars1Context):
        if ctx.getChildCount() > 0:
            mem.dirFunctions[self.ongoingFunc]["SymTable"][self.ongoingVar]["Dims"] += 1
            mem.dirFunctions[self.ongoingFunc]["SymTable"][self.ongoingVar]["SizeD1"] = int(ctx.CINT().getText())


    # Enter a parse tree produced by DASAParser#vars2.
    def enterVars2(self, ctx:DASAParser.Vars2Context):
        if ctx.getChildCount() > 0:
            mem.dirFunctions[self.ongoingFunc]["SymTable"][self.ongoingVar]["Dims"] += 1
            mem.dirFunctions[self.ongoingFunc]["SymTable"][self.ongoingVar]["SizeD2"] = int(ctx.CINT().getText())

    # Exit a parse tree produced by DASAParser#vars2.
    def exitVars2(self, ctx:DASAParser.Vars2Context):
        pass


    # Enter a parse tree produced by DASAParser#vars3.
    def enterVars3(self, ctx:DASAParser.Vars3Context):
        mem.dirFunctions[self.ongoingFunc]["SymTable"][self.ongoingVar]["Id"] = ctx.ID().getText()
        # tempname = ctx.ID().getText()
        # print("tempname:", tempname)
        # for v in self.varsTable:
        #     print("nameeee", v["Name"])
        #     if v["Name"] == tempname:
        #         raise Exception("Variable already defined")
        #     else:
        #         self.var["Name"] = tempname

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
        val = ctx.cte().getText()
        mem.dirFunctions[self.ongoingFunc]["SymTable"][self.ongoingVar]["Value"] = val
        #mem.memStack[dScope.dicScopes[self.currScope][dTypes.dicTypes[self.currType]] = val
        if(val != "Null"):
            mem.dirFunctions[self.ongoingFunc]["SymTable"][self.ongoingVar]["HasValue"] = True

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
        print(ctx.getText())
        print(self.stackOP)
        print(self.stackOper)
        print(self.stackTypes)

    # Exit a parse tree produced by DASAParser#estatuto.
    def exitEstatuto(self, ctx:DASAParser.EstatutoContext):
        pass


    # Enter a parse tree produced by DASAParser#asignacion.
    def enterAsignacion(self, ctx:DASAParser.AsignacionContext):
        var = ctx.getChild(0).getText()
        exists = False
        address = 0
        tmpType = 0
        for v in mem.dirFunctions[self.ongoingFunc]["SymTable"]:
            if v["Id"] == var:
                exists = True
                address = v["Address"]
                tmpType = v["Type"]
        if exists:
            self.stackTypes.append(tmpType)
            self.stackOP.append(address)
            self.stackOper.append(var) # Hacer append de la memoria
            self.stackOper.append(dicc.operators['='])
        else:
            for v in mem.dirFunctions[0]["SymTable"]:
                if v["Id"] == var:
                    exists = True
                    address = v["Address"]
                    tmpType = v["Type"]
            if exists:
                self.stackTypes.append(tmpType)
                self.stackOper.append(var) # Hacer append de la memoria
                self.stackOP.append(address)
                self.stackOper.append(dicc.operators['='])
            else:
                raise Exception("Error: Variable " + var + " hasn't been defined.")

    # Exit a parse tree produced by DASAParser#asignacion.
    def exitAsignacion(self, ctx:DASAParser.AsignacionContext):
        type1 = self.stackTypes.pop()
        type2 = self.stackTypes.pop()
        typeRes = sem.cube[type1][type2][16]
        print(typeRes)
        if(typeRes != -1):
            op1 = self.stackOP.pop()
            res = self.stackOP.pop()
            quad = {
                "Oper" : self.stackOper.pop(),
                "Op1"  : op1,
                "Res"  : res
            }
            quads.stack.append(quad)
            self.contCuadruplos += 1
        else:
            raise Exception("Error: Type mismatch in assign operation (" + str(type1) + ", " + str(type1) + ")")

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
        self.stackPJ.append(self.contCuadruplos)

    # Exit a parse tree produced by DASAParser#durante.
    def exitDurante(self, ctx:DASAParser.DuranteContext):
        end = self.stackPJ.pop()
        quad = {
            "Oper" : "GOTO",
            "Res"  : "quad(" + str(self.stackPJ.pop()) + ")"
        }
        quads.stack.append(quad)
        self.contCuadruplos = self.contCuadruplos + 1
        quads.stack[end]["Res"] = "quad(" + str(self.contCuadruplos) + ")"

    # Enter a parse tree produced by DASAParser#duro1.
    def enterDuro1(self, ctx:DASAParser.Duro1Context):
        tmpType = self.stackTypes.pop()
        if tmpType != 3:
            raise Exception("Error: Expected Boolean expression in while condition.")
        else:
            quad = {
                "Oper" : "GOTOF",
                "Op1"  : self.stackOP.pop()
            }
            quads.stack.append(quad)
            self.contCuadruplos = self.contCuadruplos + 1
            self.stackPJ.append(self.contCuadruplos-1)

    # Exit a parse tree produced by DASAParser#duro1.
    def exitDuro1(self, ctx:DASAParser.Duro1Context):
        pass

    # Enter a parse tree produced by DASAParser#condicion.
    def enterCondicion(self, ctx:DASAParser.CondicionContext):
        pass

    # Exit a parse tree produced by DASAParser#condicion.
    def exitCondicion(self, ctx:DASAParser.CondicionContext):
        pos = self.stackPJ.pop()
        quads.stack[pos]["Res"] = "quad(" + str(self.contCuadruplos) + ")"

    # Enter a parse tree produced by DASAParser#con1.
    def enterCon1(self, ctx:DASAParser.Con1Context):
        tmpType = self.stackTypes.pop()
        if tmpType != 3:
            raise Exception("Error: Expected Boolean expression in if condition")
        else:
            quad = {
            "Oper" : "GOTOF",
            "Op1"  : self.stackOP.pop()
            }
            quads.stack.append(quad)
            self.contCuadruplos = self.contCuadruplos + 1
            self.stackPJ.append(self.contCuadruplos-1)

    # Exit a parse tree produced by DASAParser#con1.
    def exitCon1(self, ctx:DASAParser.Con1Context):
        pass

    # Enter a parse tree produced by DASAParser#con2.
    def enterCon2(self, ctx:DASAParser.Con2Context):
        if ctx.getChildCount():
            quad = {"Oper" : "GOTO"}
            quads.stack.append(quad)
            self.contCuadruplos = self.contCuadruplos + 1
            pos = self.stackPJ.pop()
            self.stackPJ.append(self.contCuadruplos-1)
            quads.stack[pos]["Res"] = "quad(" + str(self.contCuadruplos) + ")"

    # Exit a parse tree produced by DASAParser#con2.
    def exitCon2(self, ctx:DASAParser.Con2Context):
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
            self.stackOP.append(ctx.getChild(0).getText()) #Cambiar a direccion
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
        exists = False
        id = ctx.getChild(0).getText()
        index = 0
        for f in mem.dirFunctions:
            if f["Id"] == id:
                exists = True
                self.ongoingFunc = index
            index += 1
        if not exists:
            raise Exception("Error: Method called does not exist.")
        else:
            quad = {
                "Oper" : "ERA",
                "Op1" : id
            }
            quads.stack.append(quad)
            self.contCuadruplos += 1
            self.paramCounter = 0


    # Exit a parse tree produced by DASAParser#funcion.
    def exitFuncion(self, ctx:DASAParser.FuncionContext):
        quad = {
            "Oper" : "GOSUB",
            "Op1" : mem.dirFunctions[self.ongoingFunc]["Id"],
            "Res" : mem.dirFunctions[self.ongoingFunc]["StartQuad"]
        }
        quads.stack.append(quad)
        self.contCuadruplos += 1


    # Enter a parse tree produced by DASAParser#func1.
    def enterFunc1(self, ctx:DASAParser.Func1Context):
        pass


    # Exit a parse tree produced by DASAParser#func1.
    def exitFunc1(self, ctx:DASAParser.Func1Context):
        pass


    # Enter a parse tree produced by DASAParser#func2.
    def enterFunc2(self, ctx:DASAParser.Func2Context):
        tipoParam = mem.dirFunctions[self.ongoingFunc]["ParamTypes"][self.paramCounter]
        if self.paramCounter >= mem.dirFunctions[self.ongoingFunc]["Params"]:
            raise Exception("Error: Method was given more parameters than expected.")
        else:
            if self.stackTypes.pop() != tipoParam:
                raise Exception("Error: Parameter not of expected type.")
            else:
                quad = {
                    "Oper" : "PARAM",
                    "Op1" : self.stackOP.pop(),
                    "Res" : "param" + str(self.paramCounter)
                }
                quads.stack.append(quad)
                self.quad = {}
                self.contCuadruplos += 1
                self.paramCounter +=1

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
                op2 = self.stackOP.pop()
                op1 = self.stackOP.pop()
                type2 = self.stackTypes.pop()
                type1 = self.stackTypes.pop()
                typeRes = sem.cube[type1][type2][top]
                if(typeRes != -1):
                    res = "temp" # genAddress(self.currScope,typeRes,len(mem.dirFunctions[self.ongoingFunc]["Signature"][typeRes]))
                    quad = {
                        "Oper" : self.stackOper.pop(),
                        "Op1"  : op1,
                        "Op2"  : op2,
                        "Res"  : res
                    }
                    mem.dirFunctions[self.ongoingFunc]["Signature"][typeRes] += 1
                    self.stackOP.append(res)
                    self.stackTypes.append(typeRes)
                    quads.stack.append(quad)
                    self.contCuadruplos += 1
                else:
                    raise Exception("Error:Type mismatch in logical operation.")

    # Enter a parse tree produced by DASAParser#expres2.
    def enterExpres2(self, ctx:DASAParser.Expres2Context):
        pass

    # Exit a parse tree produced by DASAParser#expres2.
    def exitExpres2(self, ctx:DASAParser.Expres2Context):
        self.stackOper.append(dicc.operators[ctx.getChild(0).getText()])

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
                type2 = self.stackTypes.pop()
                type1 = self.stackTypes.pop()
                typeRes = sem.cube[type1][type2][top]
                if(typeRes != -1):
                    op1 = self.stackOP.pop()
                    op2 = self.stackOP.pop()
                    res = "temp" # genAddress(self.currScope,typeRes,len(mem.dirFunctions[self.ongoingFunc]["Signature"][typeRes]))
                    quad = {
                        "Oper" : self.stackOper.pop(),
                        "Op1"  : op1,
                        "Op2"  : op2,
                        "Res"  : res
                    }
                    self.stackOP.append(res)
                    self.stackTypes.append(typeRes)
                    quads.stack.append(quad)
                    self.contCuadruplos += 1
                else:
                    raise Exception("error: not possible")

    # Enter a parse tree produced by DASAParser#comp2.
    def enterComp2(self, ctx:DASAParser.Comp2Context):
        pass

    # Exit a parse tree produced by DASAParser#comp2.
    def exitComp2(self, ctx:DASAParser.Comp2Context):
        opttemp= ctx.getChild(0).getText()
        self.stackOper.append(dicc.operators[opttemp])

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
                type2 = self.stackTypes.pop()
                type1 = self.stackTypes.pop()
                typeRes = sem.cube[type1][type2][top]
                if(typeRes != -1):
                    op2 = self.stackOP.pop()
                    op1 = self.stackOP.pop()
                    res = "temp" # genAddress(self.currScope,typeRes,len(mem.dirFunctions[self.ongoingFunc]["Signature"][typeRes]))
                    quad = {
                        "Oper" : self.stackOper.pop(),
                        "Op1"  : op1,
                        "Op2"  : op2,
                        "Res"  : res
                    }
                    self.stackOP.append(res)
                    self.stackTypes.append(typeRes)
                    quads.stack.append(quad)
                    self.contCuadruplos += 1
                else:
                    raise Exception("error: not possible")

    # Enter a parse tree produced by DASAParser#exp2.
    def enterExp2(self, ctx:DASAParser.Exp2Context):
        pass

    # Exit a parse tree produced by DASAParser#exp2.
    def exitExp2(self, ctx:DASAParser.Exp2Context):
        opttemp= ctx.getChild(0).getText()
        self.stackOper.append(dicc.operators[opttemp])

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
                type2 = self.stackTypes.pop()
                type1 = self.stackTypes.pop()
                typeRes = sem.cube[type1][type2][top]
                if(typeRes != -1):
                    op2 = self.stackOP.pop()
                    op1 = self.stackOP.pop()
                    res = "temp" # genAddress(self.currScope,typeRes,len(mem.dirFunctions[self.ongoingFunc]["Signature"][typeRes]))
                    quad = {
                        "Oper" : self.stackOper.pop(),
                        "Op1"  : op1,
                        "Op2"  : op2,
                        "Res"  : res
                    }
                    self.stackOP.append(res)
                    self.stackTypes.append(typeRes)
                    quads.stack.append(quad)
                    self.contCuadruplos += 1
                else:
                    raise Exception("error: not possible")

    # Enter a parse tree produced by DASAParser#term2.
    def enterTerm2(self, ctx:DASAParser.Term2Context):
        pass

    # Exit a parse tree produced by DASAParser#term2.
    def exitTerm2(self, ctx:DASAParser.Term2Context):
        tmpOper= ctx.getChild(0).getText()
        self.stackOper.append(dicc.operators[tmpOper])

    # Enter a parse tree produced by DASAParser#factor.
    def enterFactor(self, ctx:DASAParser.FactorContext):
        pass

    # Exit a parse tree produced by DASAParser#factor.
    def exitFactor(self, ctx:DASAParser.FactorContext):
        if self.stackOper:
            top = self.stackOper[len(self.stackOper)-1]
            if top == 0 or top == 1 or top == 2:
                type1 = self.stackTypes.pop()
                typeRes = sem.square[type1][top]
                if(typeRes != -1):
                    res = "temp" # genAddress(self.currScope,typeRes,len(mem.dirFunctions[self.ongoingFunc]["Signature"][typeRes]))
                    quad = {
                        "Oper" : self.stackOper.pop(),
                        "Op1"  : self.stackOP.pop(),
                        "Res"  : res
                    }
                    self.stackOP.append(res)
                    self.stackTypes.append(typeRes)
                    quads.stack.append(quad)
                    self.contCuadruplos += 1
                else:
                    raise Exception("error: not possible")

    # Enter a parse tree produced by DASAParser#fact1.
    def enterFact1(self, ctx:DASAParser.Fact1Context):
        pass

    # Exit a parse tree produced by DASAParser#fact1.
    def exitFact1(self, ctx:DASAParser.Fact1Context):
        if ctx.getChildCount():
            tmpOper= ctx.getChild(0).getText()
            self.stackOper.append(dicc.operators[tmpOper])

    # Enter a parse tree produced by DASAParser#fact2.
    def enterFact2(self, ctx:DASAParser.Fact2Context):
        pass

    # Exit a parse tree produced by DASAParser#fact2.
    def exitFact2(self, ctx:DASAParser.Fact2Context):
        pass


    # Enter a parse tree produced by DASAParser#fact3.
    def enterFact3(self, ctx:DASAParser.Fact3Context):
        if ctx.getChildCount():
            tmpOper = ctx.getChild(0).getText() + "u"
            self.stackOper.append(dicc.operators[tmpOper])

    # Exit a parse tree produced by DASAParser#fact3.
    def exitFact3(self, ctx:DASAParser.Fact3Context):
        pass

    # Enter a parse tree produced by DASAParser#valor.
    def enterValor(self, ctx:DASAParser.ValorContext):
        pass

    # Exit a parse tree produced by DASAParser#valor.
    def exitValor(self, ctx:DASAParser.ValorContext):
        if ctx.getChildCount() == 2:
            #print("leyendo id:", ctx.getChild(0).getText())
            self.stackOP.append(ctx.getChild(0).getText())
            tmpType = 0
            for v in mem.dirFunctions[self.ongoingFunc]["SymTable"]:
                if v["Id"] == ctx.getChild(0).getText():
                    tmpType = v["Type"]
            self.stackTypes.append(tmpType)


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

    def genAddress(scope, type, pos):
        return scope*10000 + type*1000 + pos

    def printQuads():
        for q in quads.stack:
            res = "{Oper: "
            if "Oper" in q:
                res += str(q["Oper"])
            else:
                res += "-"
            res += ", Op1: "
            if "Op1" in q:
                res += str(q["Op1"])
            else:
                res += "-"
            res += ", Op2: "
            if "Op2" in q:
                res += str(q["Op2"])
            else:
                res += "-"
            res += ", Res: "
            if "Res" in q:
                res += str(q["Res"])
            else:
                res += "-"
            res += "}"
