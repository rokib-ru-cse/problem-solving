#include <bits/stdc++.h>
using namespace std;
int main()
{
    int x, k, temp = 100, m;
    cin >> x >> k;
    int arr[x];
    for (int i = 0; i < x; i++)
    {
        cin >> arr[i];
    }
    for (int i = 0, j = 0; i < x; i++)
    {
        j = j+k;
        if (j >= x)
        {
            if (arr[0] == 0)
            {
                temp--;
            }
            else
            {
                temp = temp - 1 - 2;
            }
            break;
        }
        if (arr[j] == 0)
        {
            temp--;
        }
        else
        {
            temp = temp - 1 - 2;
        }
    }
    cout << temp;

    return 0;
}
