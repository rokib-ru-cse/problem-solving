#include <bits/stdc++.h>
using namespace std;
int main()
{
    int t;
    cin>>t;
    while (t--)
    {
        int x,y,flag=0,arr[1];
        cin>>x>>y;
        int a[x],b[y];
        for (int i = 0; i < x; i++)
        {
            cin>>a[i];
        }
        for (int i = 0; i < y; i++)
        {
            cin>>b[i];
        }
        for (int i = 0; i < x; i++)
        {
            for (int j = 0; j < y; j++)
            {
                if(a[i]==b[j]){
                    arr[0]=a[i];
                    flag = 1;
                    break;
                }
            }
            if(flag==1)break;
        }   
    if(flag==1){
        cout<<"YES"<<endl;
        cout<<1<<" "<<arr[0]<<endl;
    }else{
        cout<<"NO"<<endl;
    }
    }
    
    
    return 0;
}