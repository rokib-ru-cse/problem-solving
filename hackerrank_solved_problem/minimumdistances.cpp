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
    int min = 1000000;
    int dis;
    for (int i = 0; i < n-1; i++)
    {
        for (int j = i+1; j < n; j++)
        {
            if(arr[i]==arr[j]){
                dis = abs(i-j);
                if(dis<=min){
                    min =dis;
                }
            }
        }
        
    }
    if(min==1000000){
    cout << -1 << endl;

    }else{

    cout << min << endl;
    }
    return 0;
}
