#include <bits/stdc++.h>
using namespace std;
int main()
{
    int n,a,max=0;
    cin>>n;
    for (int i = 0; i < n; i++)
    {
        cin>>a;
        if(a>max){
            max=a;
        }
    }
    cout<<max<<endl;
    return 0;
}