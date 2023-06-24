#include <bits/stdc++.h>
using namespace std;
int main()
{
    int k, n, w;
    cin >> k >> n >> w;
    int a = (w*(k+(k*w)))/2;
    if (a<n)
    {
        cout << 0 << endl;
    }
    else
    {
        cout << a - n << endl;
    }
    return 0;
}