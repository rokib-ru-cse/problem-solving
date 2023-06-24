def main():
    a = int(input())
    x = int(a/3600)
    a = a%3600
    y = int(a/60)
    a = a%60
    print(x,":",y,":",a,sep="")

if __name__=="__main__":
    main()