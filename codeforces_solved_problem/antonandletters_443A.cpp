#include <bits/stdc++.h>
using namespace std;
int main()
{
    string s;
    getline(cin,s);
    vector<char> v;
    for (int i = 0; i < s.length(); i++)
    {
        if (isalpha(s[i]))
        {
            int c = count(v.begin(), v.end(), s[i]);
            if (c == 0)
            {
                v.push_back(s[i]);
            }
        }
    }
    cout << v.size() << endl;
    return 0;
}