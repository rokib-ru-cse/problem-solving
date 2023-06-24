#include <bits/stdc++.h>
using namespace std;

int main()
{
    int r, c;
    cin >> r >> c;
    char s[r][c];
    string res = "";
    for (int i = 0; i < r; i++)
    {
        for (int j = 0; j < c; j++)
        {
            cin >> s[i][j];
        }
    }
    int count = 0;
    for (int i = 0; i < r; i++)
    {
        for (int j = 0; j < c; j++)
        {
            if(s[i][j]=='*'){
                res+="*";
                continue;
            }
            for (int k = (i - 1)<1?0:(i - 1); k < i + 2; k++)
            {
                for (int l = (j - 1)<1?0:(j - 1); l < j + 2; l++)
                {
                    if (s[k][l] == '*')
                    {
                        count++;
                    }
                }
            }
            if (count > 0)
            {
                res += to_string(count);
            }
            else
            {
                res += ".";
            }
            count = 0;
        }
    }
    for (int i = 0; i < r * c; i++)
    {
        cout << res[i];
        if ((i + 1) % c == 0)
        {
            cout << endl;
        }
    }

    return 0;
}
