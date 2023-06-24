#include <bits/stdc++.h>
using namespace std;
int main()
{
    int n, count = 0;
    cin >> n;
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }
    int minn = 1000000;
    int t = n;
    while (t--)
    {
        for (int i = 0; i < n; i++)
        {
            if (arr[i] != 0 && arr[i] < minn)
            {
                minn = arr[i];
            }
        }
        for (int i = 0; i < n; i++)
        {
            if (arr[i] != 0)
            {
                count++;
            }
        }
        if (count == 0)
        {
            break;
        }
        cout << count << endl;
        if (count == 1)
        {
            break;
        }
        if (count == 2)
        {
            for (int i = 0; i < n; i++)
            {
                if (arr[i] != 0)
                {

                    arr[i] = arr[i] - minn;
                }
            }
            count=0;
            for (int i = 0; i < n; i++)
            {
                if (arr[i] != 0)
                {
                    count++;
                }
            }
            if (count == 0)
            {
                return 0;
            }
            else if (count == 1)
            {
                cout << count << endl;
                return 0;
            }
        }

        for (int i = 0; i < n; i++)
        {
            if (arr[i] != 0)
            {

                arr[i] = arr[i] - minn;
            }
        }
        minn = 1000000;
        count = 0;
    }

    return 0;
}
