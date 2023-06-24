#include <bits/stdc++.h>
using namespace std;
int main()
{
    string s;
    cin>>s;
    int res=0;
    if(s.length()<=7){
        cout<<"NO"<<endl;
        return 0;
    }
    for (int i = 0; i <= s.length()-7;)
    {
        // cout<<s[i]<<endl;
        for (int j = i+1; j < s.length(); j++)
        {
            if(s[i]==s[j]){
                res++;
                if(res==6){
                    break;
                }
            }
            else{
                res=0;
                i=j;
                break;
            }
        }
        if(res==6){
            break;
        }
        
    }
    if(res==0){
        cout<<"NO"<<endl;
    }else{
        cout<<"YES"<<endl;
    }
    cout << endl;
    return 0;
}