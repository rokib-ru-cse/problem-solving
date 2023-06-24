#include <bits/stdc++.h>
using namespace std;
int main()
{
    int q, x, y, z;
    cin >> q;
    while (q--)
    {
        cin >> x >> y >> z;
        while (true)
        {

            if (x < z)
            {
                x++;
            }
            else
            {
                x--;
            }
            if (y < z)
            {
                y++;
            }
            else
            {
                y--;
            }
            if (x == z && y == z)
            {
                cout << "Mouse C" << endl;
                break;
            }
            if (x == z)
            {
                cout << "Cat A" << endl;
                break;
            }
            if (y == z)
            {
                cout << "Cat B" << endl;
                break;
            }
        }
    }

    return 0;
}
