#include <bits/stdc++.h>
using namespace std;
int main()
{
    int t, x, count = 0;
    cin >> t;
    while (t--)
    {
        cin >> x;
        int y = x;
        while (y / 10 > 0)
        {
            /* code */
            if (y % 10 != 0 && x % (y % 10) == 0)
            {
                count++;
            }
            y /= 10;
        }
        if (y % 10 != 0 && x % (y % 10) == 0)
        {
            count++;
        }
        cout << count << endl;
        count = 0;
    }

    return 0;
}
