#include<bits/stdc++.h>
using namespace std;
int main()
{
    int n,a,sum=0,x,z;
    cin>>n>>a;
    for(int i=0;i<n;i++){
            cin>>x;
        if(i!=a){
            sum+=x;
        }
    }
    cin>>z;
    int result = sum/2;
    if(result-z==0){
        cout<<"Bon Appetit"<<endl;
    }
    else{
        cout<<z-result<<endl;
    }
    
    
    
    
    return 0;
}
