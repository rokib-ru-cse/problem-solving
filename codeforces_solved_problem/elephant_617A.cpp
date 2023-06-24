#include <bits/stdc++.h>
using namespace std;
int main()
{
    int n;
    cin>>n;
    int a = (n%5)==0?n/5:(n/5)+1;
    cout<<a<<endl;
    return 0;
}