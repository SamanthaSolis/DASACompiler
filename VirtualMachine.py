from Objetos import Memoria as mem
from Objetos import Cuadruplos as quads

#Definicion de funciones 

def operNot(op1, op2, res):#uses Op1
    value = not getValue(op1)
    setValue(value,res)

def operPos(op1, op2, res):#uses Op1
    print("HEHE",op1, op2, res)

def operNeg(op1, op2, res):#uses Op1
    print("HEHE",op1, op2, res)

def operMult(op1, op2, res):
    value = getValue(op1) * getValue(op2)
    setValue(value,res)

def operDiv(op1, op2, res):
    value = getValue(op1) / getValue(op2)
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
    print("HEHE",op1, op2, res)

def operGOTOF(op1, op2, res):
    print("HEHE",op1, op2, res)    

def operGOSUB(op1, op2, res):
    print("HEHE",op1, op2, res)
    
def operEND(op1, op2, res):
    print("HEHE",op1, op2, res)
    
def operENDPROC(op1, op2, res):
    print("HEHE",op1, op2, res)

def operPARAM(op1, op2, res):
    print("HEHE",op1, op2, res)

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
    print("HEHE",op1, op2, res)

def operPRINT(op1, op2, res):
    print (op1)
    print(getValue(op1))

def operINPUT(op1, op2, res):
    print("HEHE",op1, op2, res)
    # valor = input("Enter your input: ")
    # itype = -1

    # if ctetemp.find('"') >= 0:
    #     itype = 8
    # elif ctetemp.find("'") >= 0:
    #     itype = 4
    # elif ctetemp == "True":
    #     itype = 3
    # elif ctetemp == "False":
    #     itype = 3
    # elif ctetemp.find('.') >= 0:
    #     itype = 2
    # elif ctetemp == "Null":
    #     itype = 0
    # else:
    #     itype = 1

    # if getType(op1) != itype:
    #     raise Exception("Incompatible data types")
    # else:
    #     setValue(valor,op1)

def operDESCRIBE(op1, op2, res):
    print("HEHE",op1, op2, res)

def operPLOT(op1, op2, res):
    print("HEHE",op1, op2, res)

def operREGRESION(op1, op2, res):
    print("HEHE",op1, op2, res)

def operVACIO(op1, op2, res):
    print("HEHE",op1, op2, res)

def operCLUSTER(op1, op2, res):
    print("HEHE",op1, op2, res)

def operCASTINT(op1, op2, res):
    print("HEHE",op1, op2, res)

def operCASTFLOAT(op1, op2, res):
    print("HEHE",op1, op2, res)

def operCASTSTR(op1, op2, res):
    print("HEHE",op1, op2, res)


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

    print('-----------Memoria------------')
    for m in mem.memStack:
        print(m)
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

def setValue(value,address):
    print("setvalue", value, address)
    if (address < 10000):
        raise Exception("Invalid Address")
    iUno = int(address/10000) #local(1) global(2) cte(3)
    iDos = int((address-10000*iUno)/1000) #int(1) float(2) bool(3) char(4)
    iTres = int((address-10000*iUno)-(iDos*1000)) + mem.offsetStack[len(mem.offsetStack)-2][iDos]
    mem.memStack[iUno][iDos][iTres]=value #asigna valor en la posición de memoria
    print("setvalue--->", value)

def getValue(address):
    print(mem.offsetStack)
    print("getvalue", address)
    if (address < 10000):
        raise Exception("Invalid Address")
    iUno = int(address/10000) #local(1) global(2) cte(3)
    iDos = int((address-10000*iUno)/1000) #int(1) float(2) bool(3) char(4)
    iTres = int((address-10000*iUno)-(iDos*1000)) + mem.offsetStack[len(mem.offsetStack)-2][iDos]
    print(iUno,iDos,iTres)
    value = mem.memStack[iUno][iDos][iTres] #obtiene el valor de la posición de memoria
    print("getvalue--->", value)
    return value

def getType(address):
    if (address < 10000):
        raise Exception("Invalid Address")
    iUno = int(address/10000) #local(1) global(2) cte(3)
    iDos = int((address-10000*iUno)/1000) #int(1) float(2) bool(3) char(4)
    iTres = int((address-10000*iUno)-(iDos*1000)) + mem.offsetStack[len(mem.offsetStack)-2][iDos]
    return iTres
