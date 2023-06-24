#include <bits/stdc++.h>
using namespace std;

int main()
{
    string s;
    int f = 0, ss = 0, t = 0;
    cin >> s;
    string res="";
    res+=s[0];
    for (int i = 1,j=1; i < s.length(); i++)
    {
        if((s[i]== ')' && res[j-1]=='(')||(s[i]== '}' && res[j-1]=='{')||(s[i]== ']' && res[j-1]=='[')){
            // res.erase( res.end()-1 );
            res.pop_back();
            j--;
        }else{
            res+=s[i];
            j++;
        }
    }
    if(res==""){
        cout<<"Yes"<<endl;
    }else{
        cout<<"No"<<endl;
    }
    return 0;
}
