#include<bits/stdc++.h>
using namespace std;
int main(){
    cout<<max(1,2)<<endl;
    int a[10];
    int b=100000;
    int cnt=0;
    while (b>0)
    {
        b/=2;
        cnt++;
    }
    cout<<cnt<<endl;
        
    return 0;
}

