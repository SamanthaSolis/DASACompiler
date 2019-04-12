        size = len(self.stackOper)
        if size > 0 :
            if (self.stackOper[size-1] == 6) or (self.stackOper[size-1] == 7) :
                self.quad["Op2"]=self.stackOP.pop()
                self.quad["Op1"]=self.stackOP.pop()
                self.quad["Oper"]= self.stackOper[size-1]
                type2 = self.stackTypes.pop()
                type1 = self.stackTypes.pop() 
                mem2 = self.stackMem.pop()
                mem1 = self.stackMem.pop()

                typeRes = sCube.semCube[type1][type2][self.stackOper[size-1]]
                if(typeRes != -1):
                    if typeRes == 1 :
                        mem.memTemp[1].append(None)
                        self.stackTypes.append(1)
                        self.stackOP.append(len(mem.memTemp[1])-1)
                        self.stackMem.append(12)
                        self.quad["Res"] = (12,len(mem.memTemp[1])-1)
                    else:
                        mem.memTemp[2].append(None)
                        self.stackTypes.append(2)
                        self.stackOP.append(len(mem.memTemp[2])-1)
                        self.stackMem.append(13)
                        self.quad["Res"] = (13,len(mem.memTemp[2])-1)
                else:
                    print("error: not possible")


# Memoria
if(self.currType == "Bool"):
                if(val == "True"):
                    mem.memLocal[3][len(mem.memLocal[3])-1] = True
                else:
                    mem.memLocal[3][len(mem.memLocal[3])-1] = False
            if(self.currType == "Char"):
                mem.memLocal[4][len(mem.memLocal[4])-1] = val.replace("'","")
            if(self.currType == "Float"):
                mem.memLocal[2][len(mem.memLocal[2])-1] = float(val)
            if(self.currType == "Int"):
                mem.memLocal[1][len(mem.memLocal[1])-1] = int(val)