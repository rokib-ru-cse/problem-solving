#include <bits/stdc++.h>
using namespace std;

int main()
{
    int c;
    int n;
    cin >> n;
    string s[n];
    int max = 0;
    for (int i = 0; i < n; i++)
    {
        cin >> s[i];
        if (s[i].length() > max)
        {
            max = s[i].length();
        }
    }
    int space=1;
    for (int i = 0; i < n; i++)
    {
        c = std::count(s[i].begin(), s[i].end(), 'a');
        if (c == 1)
        {
            space = 3+((max - (c+2))/2);
            cout << setw(space) << s[i] + 'a' << endl;
        }
        else if (c % 2 != 0)
        {
            s[i].pop_back();
            space = s[i].length()+((max - c)/2);
            cout << setw(space) << s[i] << endl;
        }
        else
        {
            space = s[i].length()+((max - (c+1))/2);
            cout << setw(space) << s[i] << endl;
        }
    }

    return 0;
}
