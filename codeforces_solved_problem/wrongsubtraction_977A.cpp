#include <bits/stdc++.h>
using namespace std;
int main()
{
    long long n;
    int k;
    cin >> n >> k;
    int a = n % 10;
    while (k)
    {
        if (a == 0 && k != 0)
        {
            n = n / 10;
            a = n % 10;
            k--;
            continue;
        }
        if (a >= k)
        {
            cout << n - k << endl;
            return 0;
        }else{
            n = n-a;
            k = k-a;
            a = n%10;
        }
    }

    cout<<n<<endl;

return 0;
}