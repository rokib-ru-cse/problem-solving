#include <bits/stdc++.h>
using namespace std;

int main()
{
    stack<char> ss;
    string s;
    cin >> s;
    for (int i = 0; i < s.size(); i++)
    {
        if (s[i] == '(' || s[i] == '{' || s[i] == '[')
        {
            ss.push(s[i]);
        }
        else if (s[i] == ')' || s[i] == '}' || s[i] == ']')
        {
            if (ss.empty() || (ss.top()=='('&&s[i]!=')')||(ss.top()=='{'&&s[i]!='}')||(ss.top()=='['&&s[i]!=']'))
            {
                cout << "Wrong" << endl;
                return 0;
            }
            else
            {
                ss.pop();
            }
        }
    }
    if (ss.empty())
    {
        cout << "right" << endl;
    }
    else
    {
        cout << "Wrong" << endl;
    }
    return 0;
}