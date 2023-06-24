def main():
    a,b = map(int,input().split()[:2])
    if(a%b==0 or b%a==0):
        print("Sao Multiplos")
    else:
        print("Nao sao Multiplos") 

if __name__=="__main__":
    main()