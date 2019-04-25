from Objetos import Memoria as mem
from Objetos import Cuadruplos as quads

def run():
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
    
    for ind, q in enumerate(quads.cuadruplos):

def operNot(op1, op2, res):

def operSum(op1, op2, res):
    
def operSubs(op1, op2, res):

def operMult(op1, op2, res):

def operDiv(op1, op2, res):







    OperationsDir = [not,
                        ,
                        ,
                        ]

                        

def Operacion(arregloCuadruplos):
	global FuncionActiva
	op = arregloCuadruplos[0]
	op1 = arregloCuadruplos[1]
	op2 = arregloCuadruplos[2]
	res = arregloCuadruplos[3]
	if(op == 0):
		Suma(op1,op2,res)
	elif(op == 1):
		Resta(op1,op2,res)
	elif(op == 2):
		Multiplicacion(op1,op2,res)
	elif(op == 3):
		Division(op1,op2,res)
	elif(op == 4):
		MenorQue(op1,op2,res)
	elif(op == 5):
		MayorQue(op1,op2,res)
	elif(op == 6):
		Asignacion(op1,res)
	elif(op == 7):
		Diferente(op1,op2,res)
	elif(op == 8):
		IgualQue(op1,op2,res)
	elif(op == 9):
		And(op1,op2,res)
	elif(op == 10):
		Or(op1,op2,res)
	elif(op == 11):
		MenorIgual(op1,op2,res)
	elif(op == 12):
		MayorIgual(op1,op2,res)
	elif(op == 13):
		Print(op1)
	elif(op == 14):
		Read(op1)
	elif(op == 15):
		End()
	elif(op == 16):
		Goto(op1)
	elif(op == 17):
		GotoF(op1,res)
	elif(op == 18):
		Era(op1)
	elif(op == 19):
		Gosub(op1)
	elif(op == 20):
		Param(op1,res)
	elif(op == 21):
		Ver(op1,op2,res)
	elif(op == 22):
		Ret()
	elif(op == 23):
		Return(op1)
	elif(op == 24):
		move()
	elif(op == 25):
		checkwall()
	elif(op == 26):
		turnRight()
	elif(op == 27):
		turnLeft()
	elif(op == 28):
		pickBeeper()
	elif(op == 29):
		putBeeper()
	elif(op == 30):
		SumVer(op1,op2,res)