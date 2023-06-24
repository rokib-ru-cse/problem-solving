
def main():
    a,b,c = map(int,input().split()[:3])
    list = [a,b,c]
    list.sort()
    for i in list:
        print(i)
    print(f"\n{a}\n{b}\n{c}")

if __name__=="__main__":
    main()