#include <bits/stdc++.h>
using namespace std;
int main()
{
    int n;
    cin >> n;
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }
    int max = 0;
    int count = 1;
    for (int i = 0; i < n - 1; i++)
    {
        for (int j = i + 1; j < n; j++)
        {
            if (abs(arr[i] - arr[j]) <= 1)
            {
                count++;
            }
        }
        if (count >= max)
        {
            max = count;
        }
        count = 1;
    }
    cout << max << endl;
    return 0;
}
