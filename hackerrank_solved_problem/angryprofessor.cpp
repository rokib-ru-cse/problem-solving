#include <bits/stdc++.h>
using namespace std;
int main()
{
    int t, m, n, count = 0, temp;
    cin >> t;
    while (t--)
    {
        cin >> m >> n;
        while (m--)
        {
            cin >> temp;
            if (temp <= 0)
            {
                count++;
            }
        }
        if (count < n)
        {
            cout << "YES" << endl;
        }
        else
        {
            cout << "NO" << endl;
        }
        count = 0;
    }
    return 0;
}
