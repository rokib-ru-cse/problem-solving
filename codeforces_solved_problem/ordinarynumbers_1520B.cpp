#include <bits/stdc++.h>
using namespace std;
int main()
{
    int t, n, a, b, sum = 0;
    cin >> t;
    while (t--)
    {
        cin >> n;
        a = n / 11;
        while (n / 11 > 10)
        {
            sum = sum + 9;
            n /= 11;
        }
        sum = sum + n / 11;
        if (sum == 0)
        {
            cout << n << endl;
        }
        else
        {

            cout << sum + 9 << endl;
        }
        sum=0;
    }
    return 0;
}