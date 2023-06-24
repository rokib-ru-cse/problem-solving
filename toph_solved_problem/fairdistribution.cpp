#include <bits/stdc++.h>
using namespace std;
int main()
{
    int s,c;
    cin>>s>>c;
    cout<<((c%s==0)?0:(s-(c%s)))<<endl;
    return 0;
}