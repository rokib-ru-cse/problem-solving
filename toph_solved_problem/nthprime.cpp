#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n, flag = 0,j=3;
    cin >> n;
    if (n == 1)
    {
        cout << 2 << endl;
        return 0;
    }
    for (int i = 1;; j++)
    {
        for (int k = 2; k <= sqrt(j); k++)
        {
            if (j % k == 0)
            {
                flag = 1;
                break;
            }
            else
            {
                flag = 0;
            }
        }
        if (flag == 0)
        {
            i++;
            if (i == n)
            {
                break;
            }
        }
    }
    cout<<j<<endl;
    return 0;
}
