#include <bits/stdc++.h>
using namespace std;
int main()
{
    int n,c=0;
    cin>>n;
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        cin>>arr[i];
    }
    int min,max;
    min=max=arr[0];
    for (int i = 1; i < n; i++)
    {
        if(arr[i]>max){
            c++;
            max = arr[i];
        }else if(arr[i]<min){
            c++;
            min = arr[i];
        }
    }
    cout<<c<<endl;
    return 0;
}