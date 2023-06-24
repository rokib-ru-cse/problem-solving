#include <bits/stdc++.h>
using namespace std;
int main()
{
    int a, b, c,d,sum=0;
    cin>>a>>b>>c>>d;
    while (a>0&&c>0&&d>0)
    {
        sum+=256;
        a--,c--,d--;
    }
    while(a>0&&b>0){
        sum+=32;
        a--,b--;
    }
    cout<<sum<<endl;
    return 0;
}