#include<bits/stdc++.h>
using namespace std;
int main(){
    string s;
    int n;
    cin>>n;
    string res = "";
    cin.ignore(256, '\n');
    getline(cin, s, '\n');
    for (int i = 0; i < s.length(); i++)
    {
        if(isalpha(s[i])){
            if(int(s[i]-n<97)){
                res += char(int(s[i]-n)+26) ;
            }else{
                res += char(int(s[i]-n));
            }
        }
        else{
            res+=s[i];
        }

    }
    cout<<res<<endl;
    return 0;
}