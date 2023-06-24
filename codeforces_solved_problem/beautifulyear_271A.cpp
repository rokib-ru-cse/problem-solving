#include <bits/stdc++.h>
using namespace std;
int main()
{
    int n;
    cin>>n;
    int a,b,c,d;
    for (int i = n+1;; i++)
    {
        a = i%10;
        i/=10;
        b=i%10;
        i/=10;
        c=i%10;
        i/=10;
        d = i;
        if((a!=b)&&(a!=c)&&(a!=d)&&(b!=c)&&(b!=d)&&(c!=d)){
            break;
        }
        i=n++;
    }
    cout<<d<<c<<b<<a<<endl;
    return 0;
}