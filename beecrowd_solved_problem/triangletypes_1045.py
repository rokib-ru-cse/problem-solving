def main():
    a,b,c = map(float,input().split()[:3])
    list = [a,b,c]
    list.sort(reverse=True)
    a,b,c = list[0],list[1],list[2]
    if(a>=(b+c)):
        print("NAO FORMA TRIANGULO")
    elif((a*a)==((b*b)+(c*c))):
        print("TRIANGULO RETANGULO")
    elif((a*a)>((b*b)+(c*c))):
        print("TRIANGULO OBTUSANGULO")
    elif((a*a)<((b*b)+(c*c))):
        print("TRIANGULO ACUTANGULO")
    if(a==b and a==c):
        print("TRIANGULO EQUILATERO")
    elif(((a==b)and a!=c) or ((c==b)and a!=c) or ((a==c)and a!=b)):
        print("TRIANGULO ISOSCELES")

if __name__=="__main__":
    main()