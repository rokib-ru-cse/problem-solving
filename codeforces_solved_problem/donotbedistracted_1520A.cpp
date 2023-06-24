#include <bits/stdc++.h>
using namespace std;
int main()
{
    int t,n;
    cin>>t;
    while (t--)
    {
        cin>>n;
        string s="";
        char a;
        int d,flag=1;
        for (int i = 0; i < n; i++)
        {
            cin>>a;
            d = std::count(s.begin(), s.end(), a);
            if(a!=s[i-1]&&d>0){
                flag = 0;
            }
            s+=a;
        }
        if(flag==1){
            cout<<"YES"<<endl;
        }else{
            cout<<"NO"<<endl;
        }
        
    }
    

}