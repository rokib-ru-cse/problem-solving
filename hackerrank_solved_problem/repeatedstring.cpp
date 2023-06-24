#include <bits/stdc++.h>
using namespace std;
int main()
{
    string s;
    long n;
    cin >> s >> n;
    int len = s.length();
    long mul = n / len;
    int cou = count(s.begin(), s.end(), 'a');
    int mod = n % len;
    long res = cou * mul;
    for (int i = 0; i < mod; i++)
    {
        if (s[i] == 'a')
        {
            res++;
        }
    }
    cout << res << endl;

    return 0;
}
