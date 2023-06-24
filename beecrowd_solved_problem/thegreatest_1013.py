def main():
    a,b,c = map(int,input().split()[:3])
    a = int((a+b+abs(a-b))/2)
    b = int((a+c+abs(a-c))/2)
    print(b,"eh o maior")

if __name__=="__main__":
    main()