#include <bits/stdc++.h>
using namespace std;
int main()
{
    string a, b;
    int n, i;
    cin >> a >> b >> n;

    for (i = 0; i < b.length(); i++)
    {
        if (a[i] != b[i])
        {
            break;
        }
    }

    int res = n - ((a.length() - i) + (b.length() - i))==0?1:((a.length() - i) + (b.length() - i));
    //cout << res;
    if (res % 2 == 0)
    {
        cout << "Yes" << endl;
    }
    else
    {
        cout << "No" << endl;
    }
    // if(((a.length()-i)+(b.length()-i))<=n||((b.length()-i==0)&&(a.length()-i<=n))){
    //     cout<<"Yes"<<endl;
    // }else{
    //     cout<<"No"<<endl;
    // }
    return 0;
}
