def main():
    a,b,c = map(float, input().split()[:3])
    print("TRIANGULO:",format(.5*a*c,".3f"))
    print("CIRCULO:",format(3.14159*c*c,".3f"))
    print("TRAPEZIO:",format(.5*c*(a+b),".3f"))
    print("QUADRADO:",format(b*b,".3f"))
    print("RETANGULO:",format(a*b,".3f"))
   
if __name__=="__main__":
    main()