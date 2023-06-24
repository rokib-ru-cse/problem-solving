#include <bits/stdc++.h>
using namespace std;
int main()
{
    int a, b;
    cin >> a >> b;
    for (int j = 2; j * j <= b; j++)
    {
        if (b % j == 0)
        {
            cout << "NO" << endl;
            return 0;
        }
    }
    int flag = 0;
    for (int i = a + 1; i <= b; i++)
    {
        for (int j = 2; j * j <= i; j++)
        {
            if (i % j == 0)
            {
                flag = 1;
            }
        }
        if (flag == 0)
        {
            if (i == b)
            {
                cout << "YES" << endl;
                return 0;
            }
            else
            {
                cout << "NO" << endl;
                return 0;
            }
        }
        flag = 0;
    }
    return 0;
}