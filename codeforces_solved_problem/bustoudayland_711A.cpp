#include <bits/stdc++.h>
using namespace std;
int main()
{
    int t;
    cin>>t;
    string s[t];
    int flag = 0;
    for (int i = 0; i < t; i++)
    {
        cin>>s[i];
         if(s[i][0]=='O' && s[i][1]=='O' && flag==0){
            s[i][0]=s[i][1]='+';
            flag = 1;
        } else if(s[i][3]=='O' && s[i][4]=='O' && flag==0){
            s[i][3]=s[i][4]='+';
            flag =1;
        }
    }
    if(flag==0){
        cout<<"NO"<<endl;
    }else{
        cout<<"YES"<<endl;
        for (int i = 0; i < t; i++)
        {
            cout<<s[i]<<endl;
        }
        
    }
    
    
    return 0;
}