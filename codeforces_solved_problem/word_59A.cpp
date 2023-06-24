#include <bits/stdc++.h>
using namespace std;
int main()
{
    string s;
    int u = 0, l = 0;
    string res = "";
    cin>>s;
    for (int i = 0; i < s.length(); i++)
    {
        if (isupper(s[i]))
        {
            u++;
        }
        else
        {
            l++;
        }
    }
    if (u > l)
    {
        for (int i = 0; i < s.length(); i++)
        {
            res+=toupper(s[i]);
        }
    }
    else
    {
        for (int i = 0; i < s.length(); i++)
        {
            res+=tolower(s[i]);
        }
    }
    cout<<res<<endl;
    return 0;
}