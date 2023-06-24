#include <bits/stdc++.h>
using namespace std;
int main()
{
    int n, a;
    double sum = 0.0;
    cin >> n;
    for (int i = 1; i <= n; i++)
    {
        cin >> a;
        sum += a;
        cout << sum / i << endl;
    }
    return 0;
}