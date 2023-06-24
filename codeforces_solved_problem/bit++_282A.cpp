#include <bits/stdc++.h>
using namespace std;
int main()
{
    int n;
    int k=0;
    cin>>n;
    string s;
    while (n--)
    {
        cin>>s;
        if((s[0]=='+')||(s[1]=='+')||(s[2]=='+')){
            k++;
        }else{
            k--;
        }
    }
    cout<<k<<endl;
    return 0;
}