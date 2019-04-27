from Objetos import Memoria as mem
from Objetos import Cuadruplos as quads
import math 

#Definicion de funciones 

def operNot(op1, op2, res):#uses Op1
    value = not getValue(op1)
    setValue(value,res)

def operPos(op1, op2, res):#uses Op1
    value = getValue(op1)
    setValue(value,res)

def operNeg(op1, op2, res):#uses Op1
    value = - getValue(op1)
    setValue(value,res)

def operMult(op1, op2, res):
    value = getValue(op1) * getValue(op2)
    setValue(value,res)

def operDiv(op1, op2, res):
    value = getValue(op1) / getValue(op2)
    if getData(op1,"type")==1 and getData(op2,"type")==1:
        value = math.trunc(value)
    setValue(value,res)

def operMod(op1, op2, res):
    value = getValue(op1) % getValue(op2)
    setValue(value,res)
    
def operSum(op1, op2, res):
    value = getValue(op1) + getValue(op2)
    setValue(value,res)
        
def operSubs(op1, op2, res):
    value = getValue(op1) - getValue(op2)
    setValue(value,res)
    
def operLess(op1, op2, res):
    value = getValue(op1) < getValue(op2)
    setValue(value,res)
        
def operLessEqual(op1, op2, res):
    value = getValue(op1) <= getValue(op2)
    setValue(value,res)

def operGreater(op1, op2, res):
    value = getValue(op1) > getValue(op2)
    setValue(value,res)
    
def operGreaterEqual(op1, op2, res):
    value = getValue(op1) >= getValue(op2)
    setValue(value,res)

def operEqual(op1, op2, res):
    value = getValue(op1) == getValue(op2)
    setValue(value,res)
    
def operNotEqual(op1, op2, res):
    value = getValue(op1) != getValue(op2)
    setValue(value,res)
    
def operAnd(op1, op2, res):
    value = getValue(op1) and getValue(op2)
    setValue(value,res)
    
def operOr(op1, op2, res):
    value = getValue(op1) or getValue(op2)
    setValue(value,res)
    
def operAssig(op1, op2, res):
    value = getValue(op1)
    setValue(value,res)

def operGOTO(op1, op2, res):
    pass

def operGOTOF(op1, op2, res):
    pass    

def operGOSUB(op1, op2, res):
    pass
    
def operEND(op1, op2, res):
    pass
    
def operENDPROC(op1, op2, res):
    pass

def operPARAM(op1, op2, res):
    pass

def operERA(op1, op2, res):
    sig = [0,0,0,0,0]
    for f in mem.funcTable:
        if f["Id"] == op1:
            for i in range(1,5):
                sig[i] = f["Signature"][i]

    for i in range(1,5):
        for n in range(sig[i]):
            mem.memStack[1][i].append(None)
        sig[i] += mem.offsetStack[len(mem.offsetStack)-1][i]
    mem.offsetStack.append(sig)

def operRETURN(op1, op2, res):
    pass

def operPRINT(op1, op2, res):
    print(getValue(op1))

def operINPUT(op1, op2, res):
    valor = input("Enter your input: ")
    itype = -1
    tipo = getData(op1,"type") 

    if tipo == 4:
        itype = 4
        if valor.find('"') >= 0: 
            valor = valor[1:len(valor)-1]
    elif valor == "True":
        itype = 3
        valor = True
    elif valor == "False":
        itype = 3
        valor = False
    elif valor.find('.') >= 0:
        itype = 2
        valor = float(valor)
    elif valor == "Null":
        itype = 0
        valor = None
    else:
        itype = 1
        valor = int(valor)
    


    if (tipo-itype) == 1  or tipo == itype:
        setValue(valor,op1)
    else:
        raise Exception("Mismatch in assign types")

def operDESCRIBE(op1, op2, res):
    pass

def operPLOT(op1, op2, res):
    pass

def operREGRESION(op1, op2, res):
    pass

def operVACIO(op1, op2, res):
    pass

def operCLUSTER(op1, op2, res):
    pass

def operCASTINT(op1, op2, res):
    value = int(getValue(op1))
    setValue(value,res)

def operCASTFLOAT(op1, op2, res):
    value = float(getValue(op1))
    setValue(value,res)

def operCASTSTR(op1, op2, res):
    value = str(getValue(op1))
    setValue(value,res)


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
                operPRINT,
                operINPUT,
                operDESCRIBE,
                operPLOT,
                operREGRESION,
                operVACIO,
                operCLUSTER,
                operCASTINT,
                operCASTFLOAT,
                operCASTSTR]

def run():
    mem.offsetStack.append([0,0,0,0,0])
    OperationsDir[23]("main", None, None)

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


    #lee los cuadruplos
    for q in quads.cuadruplos:
        opType=q["Oper"] #Obtiene el tipo de operacion y llama esa funcion
        OperationsDir[opType] (q["Op1"], q["Op2"], q["Res"])

    print('\n-----------Memoria------------')
    for m in mem.memStack:
        print(m)
    print('\n----------Funciones-----------')
    for x in mem.funcTable:
        print("{", x["Id"], x["Params"], x["TiposParams"], x["Return"], x["StartQuad"], x["Signature"], "}")
        for y in x["SymTable"]:
            print("\t", y)
    print('\n----------Cuadruplos----------')
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

def setValue(value,address):
    #print("setvalue", value, address)
    if (address < 10000):
        raise Exception("Invalid Address")
    iUno = int(address/10000) #local(1) global(2) cte(3)
    iDos = int((address-10000*iUno)/1000) #int(1) float(2) bool(3) char(4)
    iTres = int((address-10000*iUno)-(iDos*1000)) + mem.offsetStack[len(mem.offsetStack)-2][iDos]
    mem.memStack[iUno][iDos][iTres]=value #asigna valor en la posición de memoria
    #print("setvalue--->", value)

def getValue(address):
    #print(mem.offsetStack)
    #print("getvalue", address)
    if (address < 10000):
        raise Exception("Invalid Address")
    iUno = int(address/10000) #local(1) global(2) cte(3)
    iDos = int((address-10000*iUno)/1000) #int(1) float(2) bool(3) char(4)
    iTres = int((address-10000*iUno)-(iDos*1000)) + mem.offsetStack[len(mem.offsetStack)-2][iDos]
    #print(iUno,iDos,iTres)
    value = mem.memStack[iUno][iDos][iTres] #obtiene el valor de la posición de memoria
    #print("getvalue--->", value)
    if value == None:
        raise Exception("You can't make operations with a Null variable")
    return value

#Regresa el contexto, el tipo o la posicion de una variable
def getData(address,key):
    if (address < 10000):
        raise Exception("Invalid Address")
    iUno = int(address/10000) #local(1) global(2) cte(3)
    iDos = int((address-10000*iUno)/1000) #int(1) float(2) bool(3) char(4)
    iTres = int((address-10000*iUno)-(iDos*1000)) + mem.offsetStack[len(mem.offsetStack)-2][iDos]

    switcher = {
        "cxt": iUno,
        "type": iDos,
        "pos": iTres
    }
    return switcher[key]