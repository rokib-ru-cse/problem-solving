#include <bits/stdc++.h>
using namespace std;
int main()
{
    int n, count=0;
    string s;
    cin >> n;
    while (n--)
    {
        cin >> s;
        for (int i = 0; i < s.length(); i++)
        {
            if (isalpha(s[i]) && s[i] != 'O')
            {
                continue;
            }
            else
            {
                count++;
            }
        }
        int over = count / 6;
        int ball = count - (over * 6);
        if (over > 1 && ball > 1)
        {
            cout << over << " OVERS " << ball << " BALLS " << endl;
        }
        else if (over == 1 && ball == 1)
        {
            cout << over << " OVER " << ball << " BALL " << endl;
        }
        else if (over > 1 && ball == 1)
        {
            cout << over << " OVERS " << ball << " BALL " << endl;
        }
        else if (over == 1 && ball > 1)
        {
            cout << over << " OVER " << ball << " BALLS " << endl;
        }
        else if (over == 1 && ball == 0)
        {
            cout << over << " OVER " << endl;
        }
        else if (over > 1 && ball == 0)
        {
            cout << over << " OVERS " << endl;
        }
        else if (over == 0 && ball == 1)
        {
            cout << ball << " BALL " << endl;
        }
        else if (over == 0 && ball > 1)
        {
            cout << ball << " BALLS " << endl;
        }
        count = 0;
    }

    return 0;
}