#include <bits/stdc++.h>
using namespace std;
int main()
{
    int n;
    string s, res = "";
    int count = 0;
    cin>>n;
    while (n--)
    {
        cin >> s;
        res += s;
    }
    for (int i = 0; i < res.length() - 1; i++)
    {
        if ((res[i] == '1' && res[i + 1] == '1') || (res[i] == '0' && res[i + 1] == '0'))
        {
            count++;
        }
    }
    cout << count + 1 << endl;
    return 0;
}