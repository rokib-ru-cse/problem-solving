#include <bits/stdc++.h>
using namespace std;
int main()
{
    int n;
    int a, b;
    cin >> n;
    int count = 0;
    while (n--)
    {
        cin >> a >> b;
        if ((b-a)>=2)
        {
            count++;
        }
    }
    cout << count << endl;
        return 0;
}