import pandas as pd
import matplotlib.pyplot as plt
import math
import numpy as np
from sklearn.linear_model import LinearRegression
from sklearn.cluster import KMeans

from Objetos import Memoria as mem
from Objetos import Cuadruplos as quads
from Objetos import Operadores as ops


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
    value = getValue(op1)
    setValue(value,res)
    quads.quadCount += 1

def operGOTO(op1, op2, res):
    quads.quadCount = res

def operGOTOF(op1, op2, res):
    value= getValue(op1)
    if value == False:
        quads.quadCount = res
    else:
        quads.quadCount += 1

def operGOSUB(op1, op2, res):
    mem.funcStack.append(quads.quadCount+1)
    if len(mem.funcStack) > 10000:
        raise Exception("Error: Stack overflow.")
    for f in mem.funcTable:
        if f["Id"] == op1:
            quads.quadCount = f["StartQuad"]
    mem.offsetCont += 1

def operEND(op1, op2, res):
    quads.quadCount += 1

def operENDPROC(op1, op2, res):
    mem.memStack[1].pop()
    mem.offsetCont -= 1
    quads.quadCount = mem.funcStack.pop()

def operPARAM(op1, op2, res):
    valor = getValue(op1)
    mem.offsetCont += 1
    setValue(valor,res)
    mem.offsetCont -= 1
    quads.quadCount += 1

def operERA(op1, op2, res):
    sig = [0,0,0,0,0]
    for f in mem.funcTable:
        if f["Id"] == op1:
            sig = f["Signature"]

    func = [0, [], [], [], []]
    for i in range(1,5):
        for n in range(sig[i]):
            func[i].append(None)

    mem.memStack[1].append(func)
    quads.quadCount += 1

def operRETURN(op1, op2, res):
    value = getValue(op1)
    setValue(value,res)
    quads.quadCount += 1

def operPRINT(op1, op2, res):
    if op1 is None:
        print()
    else:
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

    setValue(valor,op1)
    quads.quadCount += 1

def operDESCRIBE(op1, op2, res):
    sizeD1 = getValue(op1)
    sizeD2 = getValue(op2)
    arrData = []
    if sizeD2 == -1:
        for i in range(sizeD1):
            arrData.append(getValue(res + i))
    else:
        tempArr = []
        for i in range(sizeD1):
            tempArr = []
            for j in range(sizeD2):
                tempArr.append(getValue(res + i*sizeD2 + j))
            arrData.append(tempArr)
    dataKey = {}
    for ind,row in enumerate(arrData):
        name = "col" + str(ind+1)
        dataKey[name] = row
    df = pd.DataFrame(dataKey)
    print(df.describe())
    quads.quadCount += 1

def operPLOT(op1, op2, res):
    sizeD2 = getValue(op1)
    title = getValue(op2)
    filepath = title + '.png'
    arrData = []
    tempArr = []
    for i in range(2):
        tempArr = []
        for j in range(sizeD2):
            tempArr.append(getValue(res + i*sizeD2 + j))
        arrData.append(tempArr)
    dataset = pd.DataFrame({"x": arrData[0], "y": arrData[1]})
    dataplot = dataset.plot.scatter(x = 'x', y='y')
    dataplot.set_title(title, weight='bold')
    dataplot.set_xlabel('Independent variable')
    dataplot.set_ylabel('Dependent variable')
    graph = dataplot.get_figure()
    graph.savefig(filepath)
    print("Plot saved to " + filepath)

    quads.quadCount += 1

def operREGRESION(op1, op2, res):
    sizeD1 = getValue(op1)
    sizeD2 = getValue(op2)
    arrData = []
    tempArr = []
    for i in range(sizeD1):
        tempArr = []
        for j in range(sizeD2):
            tempArr.append(getValue(res + i*sizeD2 + j))
        arrData.append(tempArr)

    x = np.array(np.transpose(arrData[0:-1]))
    y = np.array(arrData[-1])
    model = LinearRegression().fit(x, y)
    r_sq =  model.score(x, y)
    intercept = model.intercept_
    slope = model.coef_
    print("Coefficient of determination:", r_sq)
    eq = "y= "
    for i in range(len(slope)):
        eq += "("+str(model.coef_[i])+")*x" + str(i) + " + "
    eq += str(intercept)
    print("Equation:", eq)
    quads.quadCount += 1

def operVACIO(op1, op2, res):
    if (op1 < 10000):
        raise Exception("Error: Invalid address.")
    else:
        iUno = int(op1/10000) #local(1) global(2) cte(3)
        iDos = int((op1-10000*iUno)/1000) #int(1) float(2) bool(3) char(4)
        iTres = int((op1-10000*iUno)-(iDos*1000))
        #print("----->>",iUno,iDos,iTres)
        #obtiene el valor de la posición de memoria
        if iUno == 4:
            ptr = mem.memStack[iUno][iDos][iTres]
            value = getValue(ptr)
        elif iUno != 1:
            value = mem.memStack[iUno][iDos][iTres]
        else:
            value= mem.memStack[iUno][mem.offsetCont][iDos][iTres]

        if value == None:
            setValue(True,res)
        else:
            setValue(False,res)
    quads.quadCount += 1

def operCLUSTER(op1, op2, res):
    sizeD2 = getValue(op1)
    clusterNum = getValue(op2)
    arrData = []
    tempArr = []
    for i in range(2):
        tempArr = []
        for j in range(sizeD2):
            tempArr.append(getValue(res + i*sizeD2 + j))
        arrData.append(tempArr)
    X = np.array(list(zip(arrData[0], arrData[1])))
    kmeans = KMeans(n_clusters=clusterNum)
    kmeans = kmeans.fit(X)
    labels = kmeans.predict(X)
    centroids = kmeans.cluster_centers_
    print("Centroids for " + str(clusterNum) + " clusters:")
    for c in centroids:
        print("\t", c)
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
    if getValue(op1) >= op2 or getValue(op1) < 0:
        raise Exception("Error: Index out of bounds.")
    quads.quadCount += 1

def operSETADD(op1, op2, res):
    iUno = int(res/10000) #local(1) global(2) cte(3)
    iDos = int((res-10000*iUno)/1000) #int(1) float(2) bool(3) char(4)
    iTres = int((res-10000*iUno)-(iDos*1000))
    mem.memStack[iUno][iDos][iTres] = getValue(op1) + getValue(op2)
    quads.quadCount += 1

def operLENGTH(op1, op2, res):
    value = getValue(op1)
    setValue(len(value),res)
    quads.quadCount += 1

def operSIZE(op1, op2, res):
    setValue(op1, res)
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
                operVER,
                operSETADD,
                operLENGTH,
                operSIZE]

def run():
    # Abrir espacios en memoria global
    sig = mem.funcTable[0]["Signature"]
    for i in range(1,5):
        for n in range(sig[i]):
            mem.memStack[2][i].append(None)

    # Agregar main a memoria
    OperationsDir[23]("main", None, None)

    # Imprimir tabla de funciones
    printFunctions()
    # Imprimir variables globales
    printGlobals()
    # Imprimir cuadruplos
    printQuads()

    quads.quadCount = 0
    # Ejecuta los cuadruplos
    while not quads.cuadruplos[quads.quadCount]["Oper"] == 20:
        opType=quads.cuadruplos[quads.quadCount]["Oper"] #Obtiene el tipo de operacion y llama esa funcion
        OperationsDir[opType] (quads.cuadruplos[quads.quadCount]["Op1"], quads.cuadruplos[quads.quadCount]["Op2"], quads.cuadruplos[quads.quadCount]["Res"])

    # Imprimir memoria final
    printMemory()

    

def setValue(value,address):
    if (address < 10000):
        raise Exception("Error: Invalid address.")
    else:
        iUno = int(address/10000) #local(1) global(2) cte(3)
        iDos = int((address-10000*iUno)/1000) #int(1) float(2) bool(3) char(4)
        iTres = int((address-10000*iUno)-(iDos*1000))
        
        # Sobreescribe el valor de memoria
        if iUno == 4: # Caso especial para apuntadores
            ptr = mem.memStack[iUno][iDos][iTres]
            setValue(value, ptr)
        elif iUno != 1:
            mem.memStack[iUno][iDos][iTres]=value
        else:
            mem.memStack[iUno][mem.offsetCont][iDos][iTres]=value

def getValue(address):
    if (address < 10000):
        raise Exception("Error: Invalid address.")
    else:
        iUno = int(address/10000) #local(1) global(2) cte(3)
        iDos = int((address-10000*iUno)/1000) #int(1) float(2) bool(3) char(4)
        iTres = int((address-10000*iUno)-(iDos*1000))

        # Obtiene el valor de la posición de memoria
        if iUno == 4: # Caso especial para apuntadores
            ptr = mem.memStack[iUno][iDos][iTres]
            value = getValue(ptr)
        elif iUno != 1:
            value = mem.memStack[iUno][iDos][iTres]
        else:
            value= mem.memStack[iUno][mem.offsetCont][iDos][iTres]

        if value == None:
            raise Exception("Error: Invalid operation with Null value.")
        return value


#Regresa el contexto, el tipo o la posicion de una variable
def getData(address,key):
    if (address < 10000):
        raise Exception("Error: Invalid address.")
    iUno = int(address/10000) #local(1) global(2) cte(3)
    iDos = int((address-10000*iUno)/1000) #int(1) float(2) bool(3) char(4)
    iTres = int((address-10000*iUno)-(iDos*1000))

    switcher = {
        "ctx": iUno,
        "type": iDos,
        "pos": iTres
    }
    return switcher[key]

def printFunctions():
    print('\n----------Funciones-----------')
    for x in mem.funcTable:
        print("{Id:", x["Id"], ", Params:", x["Params"], ", TiposParams:", x["TiposParams"], ", Return:", x["Return"], ", Address:", x["Address"], ", StartQuad:", x["StartQuad"], ", Signature:", x["Signature"], "}")

def printGlobals():
    print('\n---------Vars. Glob-----------')
    for v in mem.globalVars:
        print(v)

def printQuads():
    print('\n----------Cuadruplos----------')
    for ind, q in enumerate(quads.cuadruplos):
        res = str(ind) + "- {Oper: "
        if q["Oper"]:
            res += ops.arrOperations[q["Oper"]]
        else:
            res += "-"
        res += ", Op1: "
        if q["Op1"]:
            res += str(q["Op1"])
        else:
            res += "-"
        res += ", Op2: "
        if ["Op2"]:
            res += str(q["Op2"])
        else:
            res += "-"
        res += ", Res: "
        if q["Res"]:
            res += str(q["Res"])
        else:
            res += "-"
        res += "}"
        print(res)

def printMemory():
    print('\n-----------Memoria------------')
    for m in mem.memStack:
        print(m)