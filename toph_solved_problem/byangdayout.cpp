#include <bits/stdc++.h>
using namespace std;

int main()
{
    int a,b,c,n;
    cin>>n;
    while (n--)
    {
        cin>>a>>b>>c;
        if((a+b>=c)&&(a+c>=b)&&(b+c>=a)){
            cout<<"Yes"<<endl;
        }else{
            cout<<"No"<<endl;
        }
    }
    
    return 0;
}
