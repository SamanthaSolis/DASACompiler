from Objetos import Memoria as mem
from Objetos import Cuadruplos as quads
from Objetos import Operadores as ops
import math 

#Definicion de funciones 

def operNot(op1, op2, res):#uses Op1
    value = not getValue(op1)
    setValue(value,res)
    quads.quadCount += 1

def operPos(op1, op2, res):#uses Op1
    value = getValue(op1)
    setValue(value,res)
    quads.quadCount += 1

def operNeg(op1, op2, res):#uses Op1
    value = - getValue(op1)
    setValue(value,res)
    quads.quadCount += 1

def operMult(op1, op2, res):
    value = getValue(op1) * getValue(op2)
    setValue(value,res)
    quads.quadCount += 1

def operDiv(op1, op2, res):
    value = getValue(op1) / getValue(op2)
    if getData(op1,"type")==1 and getData(op2,"type")==1:
        value = math.trunc(value)
    setValue(value,res)
    quads.quadCount += 1

def operMod(op1, op2, res):
    value = getValue(op1) % getValue(op2)
    setValue(value,res)
    quads.quadCount += 1
    
def operSum(op1, op2, res):
    #print("HEHEH",op1,op2,res)
    value = getValue(op1) + getValue(op2)
    setValue(value,res)
    quads.quadCount += 1
        
def operSubs(op1, op2, res):
    value = getValue(op1) - getValue(op2)
    setValue(value,res)
    quads.quadCount += 1
    
def operLess(op1, op2, res):
    value = getValue(op1) < getValue(op2)
    setValue(value,res)
    quads.quadCount += 1
        
def operLessEqual(op1, op2, res):
    value = getValue(op1) <= getValue(op2)
    setValue(value,res)
    quads.quadCount += 1

def operGreater(op1, op2, res):
    value = getValue(op1) > getValue(op2)
    setValue(value,res)
    quads.quadCount += 1
    
def operGreaterEqual(op1, op2, res):
    value = getValue(op1) >= getValue(op2)
    setValue(value,res)
    quads.quadCount += 1

def operEqual(op1, op2, res):
    value = getValue(op1) == getValue(op2)
    setValue(value,res)
    quads.quadCount += 1
    
def operNotEqual(op1, op2, res):
    value = getValue(op1) != getValue(op2)
    setValue(value,res)
    quads.quadCount += 1
    
def operAnd(op1, op2, res):
    value = getValue(op1) and getValue(op2)
    setValue(value,res)
    quads.quadCount += 1

def operOr(op1, op2, res):
    value = getValue(op1) or getValue(op2)
    setValue(value,res)
    quads.quadCount += 1
    
def operAssig(op1, op2, res):
    if (res >= 40000):
        res=getValue(res)
    value = getValue(op1)
    setValue(value,res)
    quads.quadCount += 1

def operGOTO(op1, op2, res):
    quads.quadCount = res

def operGOTOF(op1, op2, res):
    
    quads.quadCount = res 

def operGOSUB(op1, op2, res):
    mem.funcStack.append(quads.quadCount+1)
    for f in mem.funcTable:
        if f["Id"] == op1:
            quads.quadCount = f["StartQuad"]
    
def operEND(op1, op2, res):
    quads.quadCount += 1
    
def operENDPROC(op1, op2, res):
    sig = mem.offsetStack.pop()
    for i in range(1,5):
        sig[i] -= mem.offsetStack[len(mem.offsetStack)-1][i]
    for i in range(1,5):
        for tot in range(sig[i]):
            mem.memStack[1][i].pop()
    quads.quadCount = mem.funcStack.pop()

def operPARAM(op1, op2, res):
    valor = getValue(op1)
    setValue(valor,res)
    quads.quadCount += 1

def operERA(op1, op2, res):
    sig = [0,0,0,0,0]
    scope = 1
    if op1 == 'global':
        scope = 2
    for f in mem.funcTable:
        if f["Id"] == op1:
            for i in range(1,5):
                sig[i] = f["Signature"][i]
    for i in range(1,5):
        for n in range(sig[i]):
            mem.memStack[scope][i].append(None)
        sig[i] += mem.offsetStack[len(mem.offsetStack)-1][i]
    
    if scope != 2:
        mem.offsetStack.append(sig)
    quads.quadCount += 1

def operRETURN(op1, op2, res):
    value = getValue(op1)
    setValue(value,res)
    quads.quadCount += 1

def operPRINT(op1, op2, res):
    if op1 >= 40000:
        op1 = getValue(op1)
    print(getValue(op1))
    quads.quadCount += 1

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
        
    quads.quadCount += 1

def operDESCRIBE(op1, op2, res):
    quads.quadCount += 1

def operPLOT(op1, op2, res):
    quads.quadCount += 1

def operREGRESION(op1, op2, res):
    quads.quadCount += 1

def operVACIO(op1, op2, res):
    quads.quadCount += 1

def operCLUSTER(op1, op2, res):
    quads.quadCount += 1

def operCASTINT(op1, op2, res):
    value = int(getValue(op1))
    setValue(value,res)
    quads.quadCount += 1

def operCASTFLOAT(op1, op2, res):
    value = float(getValue(op1))
    setValue(value,res)
    quads.quadCount += 1

def operCASTSTR(op1, op2, res):
    value = str(getValue(op1))
    setValue(value,res)
    quads.quadCount += 1

def operVER(op1, op2, res):
    quads.quadCount += 1


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
                operCASTSTR,
                operVER]

def run():
    mem.offsetStack.append([0,0,0,0,0])
    OperationsDir[23]("main", None, None)
    OperationsDir[23]("global", None, None)


    # print('\n-----------Memoria------------')
    # for m in mem.memStack:
    #     print(m)
    # print('\n----------Funciones-----------')
    # for x in mem.funcTable:
    #     print("{", x["Id"], x["Params"], x["TiposParams"], x["Return"], x["StartQuad"], x["Signature"], "}")
    #     for y in x["SymTable"]:
    #         print("\t", y)

    # #lee los cuadruplos
    # for q in quads.cuadruplos:
    #     opType=q["Oper"] #Obtiene el tipo de operacion y llama esa funcion
    #     OperationsDir[opType] (q["Op1"], q["Op2"], q["Res"])

    
    print('\n----------Funciones-----------')
    for x in mem.funcTable:
        print("{Id:", x["Id"], ", Params:", x["Params"], ", TiposParams:", x["TiposParams"], ", Return:", x["Return"], ", Address:", x["Address"], ", StartQuad:", x["StartQuad"], ", Signature:", x["Signature"], "}")
        for y in x["SymTable"]:
            print("\t", y)
    # print('\n----------Cuadruplos----------')
    # for ind, q in enumerate(quads.cuadruplos):
    #     res = str(ind) + "- {Oper: "
    #     if "Oper" in q:
    #         res += ops.arrOperations[q["Oper"]]
    #     else:
    #         res += "-"
    #     res += ", Op1: "
    #     if "Op1" in q:
    #         res += str(q["Op1"])
    #     else:
    #         res += "-"
    #     res += ", Op2: "
    #     if "Op2" in q:
    #         res += str(q["Op2"])
    #     else:
    #         res += "-"
    #     res += ", Res: "
    #     if "Res" in q:
    #         res += str(q["Res"])
    #     else:
    #         res += "-"
    #     res += "}"
    #     print(res)

    quads.quadCount = 0
    #print('\n----------Ejecucion----------')
    while not quads.cuadruplos[quads.quadCount]["Oper"] == 20:
       # print('Ejecutando quad', quads.quadCount)
        opType=quads.cuadruplos[quads.quadCount]["Oper"] #Obtiene el tipo de operacion y llama esa funcion
        #print(ops.arrOperations[opType])
        OperationsDir[opType] (quads.cuadruplos[quads.quadCount]["Op1"], quads.cuadruplos[quads.quadCount]["Op2"], quads.cuadruplos[quads.quadCount]["Res"])

    print('\n-----------Memoria------------')
    for m in mem.memStack:
        print(m)

    print('\n----------Offset----------')
    for i in mem.offsetStack:
        print(i)


def setValue(value,address):
    #print("setvalue", address,value)
    if (address < 10000):
        raise Exception("Invalid Address")
    else:
        iUno = int(address/10000) #local(1) global(2) cte(3)
        iDos = int((address-10000*iUno)/1000) #int(1) float(2) bool(3) char(4)
        iTres = int((address-10000*iUno)-(iDos*1000)) 
        mem.memStack[iUno][iDos][iTres]=value #asigna valor en la posición de memoria
        #print ( mem.memStack[iUno][iDos][iTres])


def getValue(address):
    #print("getvalue", address)
    if (address < 10000):
        raise Exception("Invalid Address") 
    else:
        iUno = int(address/10000) #local(1) global(2) cte(3)
        iDos = int((address-10000*iUno)/1000) #int(1) float(2) bool(3) char(4)
        iTres = int((address-10000*iUno)-(iDos*1000)) 
        #print("----->>",iUno,iDos,iTres)
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
    iTres = int((address-10000*iUno)-(iDos*1000)) 
#    + mem.offsetStack[len(mem.offsetStack)-2][iDos]

    switcher = {
        "cxt": iUno,
        "type": iDos,
        "pos": iTres
    }
    return switcher[key]