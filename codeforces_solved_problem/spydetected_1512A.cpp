#include <bits/stdc++.h>
using namespace std;
int main()
{
    int t,n,a;
    cin>>t;
    while (t--)
    {
        cin>>n;
        vector<int> data;
        for (int i = 0; i < n; i++)
        {
            cin>>a;
            data.push_back(a);
        }
        int i;
        a = data[0];
        for (i = 1; i < n; i++)
        {
            if(a!=data[i]){
                break;
            }
        }
        if(i==1){
            if(data[1]==data[2]){
                cout<<i<<endl;
            }else{
                cout<<i+1<<endl;
            }
        }else{

        cout<<i+1<<endl;
        }

    }
    
    
    return 0;
}