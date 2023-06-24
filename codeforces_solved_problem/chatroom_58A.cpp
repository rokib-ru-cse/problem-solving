#include <bits/stdc++.h>
using namespace std;
int main()
{
    string s,s1="hello";
    cin>>s;
    int j,i;
    for (i = 0,j=0; i < s.length(); i++)
    {
        if(s[i]==s1[j]){
            j++;
        }
        if(j==5){
            break;
        }
    }
    if(j==5){
        cout<<"YES"<<endl;
    }else{
        cout<<"NO"<<endl;
    }
    
    

return 0;
}