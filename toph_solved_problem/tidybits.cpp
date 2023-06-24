#include <bits/stdc++.h>
using namespace std;
int main()
{
    int n, a, b;
    cin >> n;
    string res = bitset<32>(n).to_string();
    int c = count(res.begin(), res.end(), '1');
    int min = 100000000;
    for (int i = 1; i <= n; i++)
    {
        string res = bitset<8>(i).to_string();
        a = count(res.begin(), res.end(), '1');
        if (a == c && i < min)
        {
            min = i;
        }
    }
    cout << min << endl;
    return 0;
}