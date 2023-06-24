#include <bits/stdc++.h>
using namespace std;
int main()
{
    int x;
    cin>>x;
    int count = 0,res=5;
    if(x==1){
        cout<<2<<endl;
        return 0;
    }
    for (int i = 1; i < x; i++)
    {
        res = (res/2)*3;
        count += res/2;
    }
    cout<<count+2;
    return 0;
}
