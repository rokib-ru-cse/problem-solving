#include <bits/stdc++.h>
using namespace std;
int main()
{
    int n,flag=0,a;
    cin>>n;
    while (n--)
    {
        cin>>a;
        if(a==1){
            flag=1;
        }
    }
    if(flag==1){
        cout<<"HARD"<<endl;
    }else{
        cout<<"EASY"<<endl;

    }
    return 0;
}