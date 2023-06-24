
def main():
    a,b = map(float,input().split()[:2])
    if(a==0.0 and b==0.0):
        print("Origem")
    elif(a>0 and b>0):
        print("Q1")
    elif(a<0 and b>0):
        print("Q2")
    elif(a<0 and b<0):
        print("Q3")
    elif(a>0 and b<0):
        print("Q4")
    elif(a==0.0 ):
        print("Eixo Y")
    elif(b==0.0):
        print("Eixo X")
    

if __name__=="__main__":
    main()