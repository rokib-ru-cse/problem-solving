#include <bits/stdc++.h>
using namespace std;
int main()
{
    int t, a, b, c, d = 0;
    cin >> t;
    while (t--)
    {
        cin >> a >> b >> c;
        while (true)
        {
            if (a > b)
            {
                b += a;
                d++;
            }
            else
            {

                a += b;
                d++;
            }
            if(a >c || b >c){
                break;
            }
        }
        cout << d << endl;
        d = 0;
    }
    return 0;
}