#include <bits/stdc++.h>
using namespace std;
int main()
{
    long long m, n, a, x, y;
    cin >> m >> n >> a;
    x = m % a == 0 ? m / a : m / a + 1;
    y = n % a == 0 ? n / a : n / a + 1;
    cout << x * y << endl;
    return 0;
}