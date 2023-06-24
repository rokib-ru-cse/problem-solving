#include <bits/stdc++.h>
using namespace std;
int main()
{
    string a,b;
    cin>>a>>b;
    string res = "";
    for (int i = 0; i < b.length(); i++)
    {
        if (((int)a[i]-48) +((int)b[i]-48)== 1)
        {
            res += "1";
        }
        else
        {
            res += "0";
        }

    }
    cout << res << endl;
    return 0;
}