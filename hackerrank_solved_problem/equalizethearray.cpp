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
    int maxx = *max_element(arr, arr + n);
    int newarr[maxx + 1] = {0};
    for (int i = 0; i < n; i++)
    {
        newarr[arr[i]]++;
    }
    int value = distance(newarr, max_element(newarr, newarr + (sizeof(newarr) / sizeof(int))));
    int count = 0;
    for (int i = 0; i < n; i++)
    {
        if (arr[i] != value)
        {
            count++;
        }
    }
    cout << count << endl;
    return 0;
}
