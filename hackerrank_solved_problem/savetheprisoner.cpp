#include <bits/stdc++.h>
using namespace std;
int main()
{
    long long t, a, b, c, res;
    cin >> t;
    while(t--){
        cin >> a >> b >> c;
        res = ((b + c) % a)==0?(a==1?1:a-1):(((b + c) % a) - 1) == 0 ? a : (((b + c) % a) - 1);
        cout<<res<<endl;
    }
    return 0;
}
