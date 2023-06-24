import math
def main():
    a,b = map(float,input().split()[:2])
    x,y = map(float,input().split()[:2])
    print(format(math.sqrt(((a-x)*(a-x))+((b-y)*(b-y))),".4f"))

if __name__=="__main__":
    main()