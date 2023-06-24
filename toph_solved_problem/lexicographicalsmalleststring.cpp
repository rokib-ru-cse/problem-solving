#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n, k, c, d;
    string s;
    cin >> n >> k;
    string arr[11];
    cin >> s;
    for (int i = 0; i < n; i++)
    {
        c = std::count(s.begin(), s.end(), s[i]);
        d = std::count(arr[c].begin(), arr[c].end(), s[i]);
        if (d == 0 && c == k)
        {
            arr[c] += s[i];
        }
    }
    int e = arr[k].length();
    string res = s;
    string s1, s2;

    for (int i = 0; i < e; i++)
    {
        s1 = s;
        s2 = s;
        for (int j = s1.length() - 1, x = 0; j >= 0;)
        {
            if (s1[j] == arr[k][i])
            {
                s1 = s1.substr(0, j) + s1.substr(j + 1, s1.length());
                x++;
                if (x == k - 1)
                {
                    break;
                }
            }
            else
            {
                j--;
            }
        }
        for (int j = 0, x = 0; j < n;)
        {
            if (s2[j] == arr[k][i])
            {
                s2 = s2.substr(0, j) + s2.substr(j + 1, s2.length());
                x++;
                if (x == k - 1)
                {
                    break;
                }
            }
            else
            {
                j++;
            }
        }
        if (i == 0)
        {
            if (s1 < s2)
            {

                res = s1;
            }
            else
            {
                res = s2;
            }
        }
        else
        {
            if (s1 < s2 && s1 < res)
            {

                res = s1;
            }
            else if (s2 < res)
            {
                res = s2;
            }
        }
    }
    cout << res << endl;
    return 0;
}
