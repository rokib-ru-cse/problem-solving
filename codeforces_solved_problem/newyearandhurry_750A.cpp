#include <bits/stdc++.h>
using namespace std;
int main()
{
    int n,k;
    int a,c=0,i;
    cin>>n>>k;
    a = 240-k;
    for (i = 1; i <= n; i++)
    {
        c+=(5*i);
        if(c>a){
            break;
        }
    }

    cout<<i-1<<endl;
    return 0;
}