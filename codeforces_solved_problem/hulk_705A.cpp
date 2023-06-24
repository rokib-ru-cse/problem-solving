#include <bits/stdc++.h>
using namespace std;
int main()
{
    int n;
    cin>>n;
    string res="";
    for (int i = 1; i < n; i++)
    {
        if(i%2!=0){
            res +="I hate that ";
        }else{
            res +="I love that ";
        }
    }
    if(n%2!=0){
            res +="I hate it";
        }else{
            res +="I love it";
        }
    cout<<res<<endl;
        return 0;
}