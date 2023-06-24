def main():
    a,b = map(int,input().split()[:2])
    if(a==1):
        print("Total: R$",format(b*4.0,".2f"))
    elif(a==2):
        print("Total: R$",format(b*4.5,".2f"))
    elif(a==3):
        print("Total: R$",format(b*5.0,".2f"))
    elif(a==4):
        print("Total: R$",format(b*2.0,".2f"))
    elif(a==5):
        print("Total: R$",format(b*1.50,".2f"))


if __name__=="__main__":
    main()