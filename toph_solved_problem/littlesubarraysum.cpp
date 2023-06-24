#include<bits/stdc++.h>
using namespace std;
int main(){
    int a,b,c,temp,sum=0;
    cin>>a>>b>>c;
    for (int i = 0; i < a; i++)
    {
        cin>>temp;
        if(i>=b&&i<=c){
            sum+=temp;
        }
    }
    cout<<sum<<endl;
    return 0;
}