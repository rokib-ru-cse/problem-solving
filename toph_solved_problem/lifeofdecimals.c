#include <stdio.h>
#include <math.h>

int main()
{
    int t, n;
    int value;
    double val;
    double fractional, integer;
    scanf("%d", &t);
    while (t--)
    {
        val = 2 * acos(0.0);
        fractional = modf(val, &integer);
        scanf("%d", &n);
        while (n--)
        {
            fractional *= 10;
            value = (int)fractional;
            fractional = modf(fractional, &integer);
        }
        printf("%d\n", value);
    }

    return 0;
}
