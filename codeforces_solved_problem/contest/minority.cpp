#include <bits/stdc++.h>
using namespace std;
int main()
{
    int t;
    string s;
    char c;
    cin >> t;
    while (t--)
    {
        cin >> s;
        int a = count(s.begin(), s.end(), '0');
        int b = count(s.begin(), s.end(), '1');
        if (a < b)
        {
            cout << a << endl;
        }
        else if (a > b)
        {
            cout << b << endl;
        }
        else
        {
            cout << 0 << endl;
        }
    }
    return 0;
}