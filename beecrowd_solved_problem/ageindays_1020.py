def main():
    a = int(input())
    print(int(a/365),"ano(s)")
    a = a%365
    print(int(a/30),"mes(es)")
    a = a%30
    print(a,"dia(s)")
    

if __name__=="__main__":
    main()