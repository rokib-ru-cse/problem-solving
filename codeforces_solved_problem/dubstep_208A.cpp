#include <bits/stdc++.h>
using namespace std;
int main()
{
    string s, res;
    cin >> s;
    bool flag = false;
    for (int i = 0; i < s.length();)
    {
        if (s[i] == 'W' && s[i + 1] == 'U' && s[i + 2] == 'B')
        {
            if(flag){
                res+= " ";
                flag = false;
            }
            i += 3;
            continue;
        }
        else
        {
            res += s[i];
            i++;
            flag= true;
        }
    }
    cout << res << endl;
    return 0;
}