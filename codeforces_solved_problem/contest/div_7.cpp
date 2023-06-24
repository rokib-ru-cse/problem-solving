#include <bits/stdc++.h>
using namespace std;
int main()
{
    int t, n, b, c;
    cin >> t;
    while (t--)
    {
        cin >> n;
        if (n % 7 == 0)
        {
            cout << n << endl;
        }
        else
        {
            n =n -(n % 10);
            n =n+ 9;
            n =n-(n % 7);
            std::cout << n << "\n";
        }
    }
    return 0;
}