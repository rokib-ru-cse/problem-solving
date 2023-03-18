#include <bits/stdc++.h>
using namespace std;
int main()
{
    int a[] = {1, 2, 3, 4, 5, 6, 7};
    int b[100];
    b[0] = a[0];
    for (int i = 1; i < sizeof(a) / sizeof(a[0]); i++)
    {
        b[i] = b[i - 1] + a[i];
    }
    cout << b[3] - b[2 - 1];
    return 0;
}