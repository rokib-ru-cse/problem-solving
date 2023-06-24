#include <bits/stdc++.h>
using namespace std;
int main()
{

    string s;
    cin >> s;
    int count = 0;
    int a;
    string c = "";
    int d;
    for (int i = 0; i < s.length(); i++)
    {
        a = std::count(s.begin(), s.end(), s[i]);
        if (a == 1)
        {
            count++;
        }
        else
        {
            d = std::count(c.begin(), c.end(), s[i]);
            if (d==0){
                count++;
            }
                c += s[i];
            
        }
    }
    if (count % 2 == 0)
    {
        cout << "CHAT WITH HER!" << endl;
    }
    else
    {
        cout << "IGNORE HIM!" << endl;
    }

    return 0;
}