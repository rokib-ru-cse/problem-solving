#include <bits/stdc++.h>
using namespace std;
int main()
{
    int k,r,i,sum=0;
    cin>>k>>r;
    for (i = 1; ; i++)
    {
        sum=(i*k);
        if(sum%10==0 ||sum%10==r){
            break;
        }
    }
    cout<<i<<endl;
    
    return 0;
}