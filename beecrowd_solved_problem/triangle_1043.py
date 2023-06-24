
def main():
    a,b,c = map(float,input().split()[:3])
    if(((a+b)>c) and ((a+c)>b) and ((c+b)>a)):
        print("Perimetro =",format(a+b+c,".1f"))
    else:
         print("Area =",format(.5*c*(a+b),".1f"))

if __name__=="__main__":
    main()