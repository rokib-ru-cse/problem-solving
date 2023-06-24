#include <bits/stdc++.h>
using namespace std;
int main()
{
    int n;
    cin>>n;
    int max=-1;
    int a,b,exit,in,res=0;
    while(n--){
        cin>>a>>b;
        res += b-a; 
        if(res>=max){
            max=res;
        }
    }
    cout<<max<<endl;
    return 0;
}