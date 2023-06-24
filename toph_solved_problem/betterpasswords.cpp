#include<bits/stdc++.h>
using namespace std;
int main(){
    string s;
    cin>>s;
    string res = "";
    res += toupper(s[0]);
    for (int i = 1; i < s.length(); i++)
    {
        if(s[i]=='s'){
            res +='$';
            continue;
        }
        if(s[i]=='i'){
            res+='!';
            continue;
        }
        if(s[i]=='o'){
            res+="()";
            continue;
        }
        res+=s[i];
    }
    res+='.';
    cout<<res<<endl;
    return 0;
}