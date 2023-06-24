#include <bits/stdc++.h>
using namespace std;
int main()
{
    int t;
    int hc, dc, hm, dm;
    int k, w, a;
    cin >> t;
    while (t--)
    {
        cin >> hc >> dc;
        cin >> hm >> dm;
        cin >> k >> w >> a;
        int flag1 = 0, flag2 = 0;
        int x,y;
        x = dc,y=hc;
        for (int i = 0; i <= k; i++)
        {
            dc += i * w;
            hc += (k - i) * a;
            while (true)
            {
                hm -= dc;
                if (hm <= 0)
                {
                    flag1 = 1;
                    break;
                }
                hc -= dm;
                if (hc <= 0)
                {
                    flag2 = 1;
                    break;
                }
            }
            if(flag1==1||flag2==1){
                break;
            }
            dc = x;
            hc = y;
        }

        if (flag1 == 1)
        {
            cout << "YES" << endl;
        }
        if (flag2 == 1)
        {
            cout << "NO" << endl;
        }
    }

    return 0;
}