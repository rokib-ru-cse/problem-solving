#include <bits/stdc++.h>
using namespace std;
int main()
{
    int n;
    cin >> n;
    int a, b;
    while (n--)
    {
        cin >> a >> b;
        int count = 0;
        while (true)
        {
            if (a / 2 > 0 && b / 2 > 0)
            {
                if (a > b)
                {

                    count += b / 2;
                }
                else
                {
                    count += a / 2;
                }
                a = a % 2;
                b = b % 2;
            }
            else if (a >= 3 && b == 1)
            {
                count++;
                a -= 3;
                b -= 1;
            }
            else if (b >= 3 && a == 1)
            {
                count++;
                b -= 3;
                a -= 1;
            }
            else
            {
                break;
            }
        }
        cout << "a = " << a << " b = " << b << " count = " << count << endl;
        // cout<<count<<endl;
    }
    return 0;
}