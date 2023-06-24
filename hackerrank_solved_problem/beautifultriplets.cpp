#include <bits/stdc++.h>
using namespace std;
int main()
{
    int n,d;
    cin >> n>>d;
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }
    int count=0;
    for (int i = 0; i < n-2; i++)
    {
        for (int j = i+1; j < n-1; j++)
        {
            for (int k = j+1; k < n; k++)
            {
                if((arr[j]-arr[i]==d)&&(arr[k]-arr[j]==d)){
                    count++;
                }
            }
            
        }
        
    }
    cout<<count<<endl;
    
    return 0;
}
