#include <bits/stdc++.h>
using namespace std;
int main()
{
    string s;
    int t;
    cin >> t;
    map<string, int> ss;
    while (t--)
    {
        cin >> s;
        if (ss.count(s) == 0)
        {
            cout << "OK" << endl;
            ss[s] = 1;
        }
        else
        {
            cout << s << ss[s] << endl;
            ss[s] += 1;
        }
    }
    return 0;
}