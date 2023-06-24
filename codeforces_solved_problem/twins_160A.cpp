#include <bits/stdc++.h>
using namespace std;
int main()
{
    int n;
    cin>>n;
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        cin>>arr[i];
    }
    sort(arr,arr+n,greater<int>());
    int sum1=0,sum2=0,i;
    for (i = 0; i < n; i++)
    {
        sum1+=arr[i];
        sum2=0;
        for (int j = i+1; j < n; j++)
        {
           sum2+=arr[j];
        }
        if(sum1>sum2){
            break;
        }
    }
    cout<<i+1<<endl;
    return 0;
}