#include <bits/stdc++.h>
using namespace std;
int main()
{
    unsigned long long n,c=0;
    int flag = 1;
    cin >> n;
    while (n / 10 > 0)
    {
        if (n % 10 == 4 || n % 10 == 7)
        {
            c++;
        }
        n /= 10;
    }
    if (n == 4 || n == 7)
    {
        c++;
    }
    while (c / 10 > 0)
    {
        if (c % 10 == 4 || c % 10 == 7)
        {
            flag = 1;
            c /= 10;
        }
        else
        {
            flag = 0;
            break;
        }
    }
    if ((c == 4 || c == 7)&&flag==1)
    {
        flag = 1;
    }
    else
    {
        flag = 0;
    }

    if (flag == 1)
    {
        cout << "YES" << endl;
    }
    else
    {
        cout << "NO" << endl;
    }
    return 0;
}