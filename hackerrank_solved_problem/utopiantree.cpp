#include <bits/stdc++.h>
using namespace std;
int main()
{
    int n, res = 1, t;
    cin >> t;
    while (t--)
    {
        /* code */
        cin>>n;
        for (int i = 1; i <= n; i++)
        {
            if (i % 2 != 0)
            {
                res *= 2;
            }
            else
            {
                res++;
            }
        }
        cout <<res<<endl;
        res = 1;
    }

    return 0;
}
