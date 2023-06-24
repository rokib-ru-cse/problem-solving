#include <bits/stdc++.h>
using namespace std;
int main()
{
    int n;
    cin >> n;
    int arr[n], c = 0;
    int a, minn = 1000, maxx = 0, x, y;
    for (int i = 0; i < n; i++)
    {
        cin >> a;
        arr[i] = a;
        if (a > maxx)
        {
            maxx = a;
            x = i + 1;
        }
        if (a <= minn)
        {
            minn = a;
            y = i + 1;
        }
    }
    if (x < y)
    {
        cout << (x - 1) + (n - y) << endl;
    }
    else
    {
        cout << (x - 1) + (n - y)-1 << endl;
    }

    return 0;
}