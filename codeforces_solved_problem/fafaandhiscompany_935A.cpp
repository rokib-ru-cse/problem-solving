#include <bits/stdc++.h>
using namespace std;
int main()
{
    int n,sum=0,b;
    cin>>n;
    for (int i = 1; i < n; i++)
    {
        b = n-i;
        if(b%i==0){
            sum++;
        }
    }
    cout<<sum<<endl;
    return 0;
}