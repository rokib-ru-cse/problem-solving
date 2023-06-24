#include <bits/stdc++.h>
using namespace std;
int main()
{
    string s;
    cin >> s;
    int c = 0;
    int cnt = s.length();
    for (int i = 0; i < cnt - 2; i++)
    {
        if (s[i] == 'Q')
        {
            for (int j = i + 1; j < cnt - 1; j++)
            {
                if (s[j] == 'A')
                {
                    for (int k = j + 1; k < cnt; k++)
                    {
                        if (s[k] == 'Q')
                        {
                            c++;
                        }
                    }
                }
            }
        }
    }
    cout << c << endl;
    return 0;
}