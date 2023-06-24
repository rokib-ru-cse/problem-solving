#include <bits/stdc++.h>
using namespace std;
int main()
{
    int n;
    cin>>n;
    int a,b,c,d,min1,max1,min2,max2;
    while (n--)
    {
        cin>>a>>b>>c>>d;
        a>b?max1=a:max1=b;
        a<b?min1=a:min1=b;
        c>d?max2=c:max2=d;
        c<d?min2=c:min2=d;
        if(max1>min2 && max2>min1){
            cout<<"YES"<<endl;
        }else{
            cout<<"NO"<<endl;
        }
    }
    return 0;
}