def main():
    a,b,c,d = map(int,input().split()[:4])
    if(b>c and d>a and (c+d)>(a+b) and c>0 and d>0 and (a%2==0)):
        print("Valores aceitos")
    else:
        print("Valores nao aceitos")

if __name__=="__main__":
    main()