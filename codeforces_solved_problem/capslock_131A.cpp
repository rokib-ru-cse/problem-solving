#include <bits/stdc++.h>
using namespace std;
int main()
{
    string s;
    bool flag = false;
    cin >> s;
    if(s.length()==1){
        if(isupper(s[0])){
            s[0] = tolower(s[0]);
            cout<<s<<endl;
        }else{
            s[0] = toupper(s[0]);
            cout<<s<<endl;
        }
        return 0;
    }
    for (int i = 1; i < s.length(); i++)
    {
        if (isupper(s[i]))
        {
            flag = true;
        }
        else
        {
            flag = false;
            break;
        }
    }
    if (flag)
    {
        for (int i = 0; i < s.length(); i++)
        {
            if (isupper(s[i]))
            {

                s[i] = tolower(s[i]);
            }
            else
            {
                s[i] = toupper(s[i]);
            }
        }
    }
    cout << s << endl;
    return 0;
}