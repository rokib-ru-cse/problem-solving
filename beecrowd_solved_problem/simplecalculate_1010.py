
def main():
    a, b, c = input().split()
    x, y, z = input().split()
    a = int(a)
    b = int(b)
    c = float(c)
    x = int(x)
    y = int(y)
    z = float(z)
    print("VALOR A PAGAR: R$", format((b*c)+(y*z), ".2f"))


if __name__ == "__main__":
    main()
