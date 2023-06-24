
import imp


import math
def main():
    a,b,c = map(float,input().split()[:3])
    if(a==0 or ((b*b)-(4*a*c))<0):
        print("Impossivel calcular")
    else:
        print("R1 =",format((-b+math.sqrt((b*b)-(4*a*c)))/(2*a),".5f"))
        print("R2 =",format((-b-math.sqrt((b*b)-(4*a*c)))/(2*a),".5f"))

if __name__=="__main__":
    main()