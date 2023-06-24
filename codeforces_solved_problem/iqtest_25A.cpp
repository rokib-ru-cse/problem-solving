#include <bits/stdc++.h>
using namespace std;
int main()
{
    int n;
    int a, i = 0, j = 0, cnt = 0;
    cin>>n;
    int arr[n];
    for (int x = 0; x < n; x++)
    {
        
        cin >> a;
        arr[x] = a;
        if (a % 2 == 0)
        {
            j++;
        }
        else
        {
            i++;
        }
    }
    if(j==1){
        for (int x = 0; x < n; x++)
        {
            if(arr[x]%2==0){
                cnt=x+1;
                break;
            }
        }  
    }else{
        for (int x = 0; x < n; x++)
        {
            if(arr[x]%2!=0){
                cnt=x+1;
                break;
            }
        } 
    }
    cout << cnt << endl;
    return 0;
}