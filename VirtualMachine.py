from Objetos import Memoria as mem
from Objetos import Cuadruplos as quads

#Definicion de funciones 

def operNot(op1, op2, res):#uses Op1
    print("HE",op1, op2, res)

def operPos(op1, op2, res):#uses Op1
    print("HE",op1, op2, res)

def operNeg(op1, op2, res):#uses Op1
    print("HE",op1, op2, res)

def operMult(op1, op2, res):
    print("HE",op1, op2, res)

def operDiv(op1, op2, res):
    print("HE",op1, op2, res)

def operMod(op1, op2, res):
    print("HE",op1, op2, res)
    
def operSum(op1, op2, res):
    print("HE",op1, op2, res)
        
def operSubs(op1, op2, res):
    print("HE",op1, op2, res)
    
def operLess(op1, op2, res):
    print("HE",op1, op2, res)
        
def operLessEqual(op1, op2, res):
    print("HE",op1, op2, res)
    
def operGreater(op1, op2, res):
    print("HE",op1, op2, res)
    
def operGreaterEqual(op1, op2, res):
    print("HE",op1, op2, res)
    
def operEqual(op1, op2, res):
    print("HE",op1, op2, res)
    
def operNotEqual(op1, op2, res):
    print("HE",op1, op2, res)
    
def operAnd(op1, op2, res):
    print("HE",op1, op2, res)
    
def operOr(op1, op2, res):
    print("HE",op1, op2, res)
    
def operAssig(op1, op2, res):
    print("HE",op1, op2, res)

def operGOTO(op1, op2, res):
    print("HE",op1, op2, res)

def operGOTOF(op1, op2, res):
    print("HE",op1, op2, res)    

def operGOSUB(op1, op2, res):
    print("HE",op1, op2, res)
    
def operEND(op1, op2, res):
    print("HE",op1, op2, res)
    
def operENDPROC(op1, op2, res):
    print("HE",op1, op2, res)

def operPARAM(op1, op2, res):
    print("HE",op1, op2, res)

def operERA(op1, op2, res):
    print("HE",op1, op2, res)

def operRETURN(op1, op2, res):
    print("HE",op1, op2, res)

def operPRINT(op1, op2, res):
    print("HE",op1, op2, res)

OperationsDir = [operNot,
                operPos,
                operNeg,
                operMult,
                operDiv,
                operMod,
                operSum,
                operSubs,
                operLess,
                operLessEqual,
                operGreater,
                operGreaterEqual,
                operEqual,
                operNotEqual,
                operAnd,
                operOr,
                operAssig,
                operGOTO,
                operGOTOF,
                operGOSUB,
                operEND,
                operENDPROC,
                operPARAM,
                operERA,
                operRETURN,
                operPRINT]

def run():
    for q in quads.cuadruplos:
        opType=q["Oper"] #Obtiene el tipo de operacion y llama esa funcion
        OperationsDir[opType] (q["Op1"], q["Op2"], q["Res"])

    print('-----------Memoria------------')
    print(mem.memStack)
    print('----------Funciones-----------')
    for x in mem.funcTable:
        print("{", x["Id"], x["Params"], x["TiposParams"], x["Return"], x["StartQuad"], x["Signature"], "}")
        for y in x["SymTable"]:
            print("\t", y)
    print('----------Cuadruplos----------')
    for ind, q in enumerate(quads.cuadruplos):
        res = str(ind) + "- {Oper: "
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

def setValor(res,adress):
    if (adress < 10000):
        raise Exception("Invalid Address")
    iUno = int(adress/10000) #local(1) global(2) cte(3)
    iDos = int((adress-10000*iUno)/1000) #int(1) float(2) bool(3) char(4)
    iTres = int(int((adress-10000*iUno)-(iDos*1000)))
    mem.memStack[iUno][iDos][iTres]=res #asigna valor en la posición de memoria



