#include <bits/stdc++.h>
using namespace std;
int main()
{
    int n;
    cin >> n;
    int a,b,c;
    int count = 0;
    while (n--)
    {
        cin>>a>>b>>c;
        if((a==1&&b==1)||(a==1&&c==1)||(b==1&&c==1)){
            count++;
        }
    }
    cout<<count<<endl;
    return 0;
}