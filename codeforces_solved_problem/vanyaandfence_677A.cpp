#include <bits/stdc++.h>
using namespace std;
int main()
{
    int a,b,sum=0;
    cin>>a>>b;
    int x;
    for (int i = 0; i < a; i++)
    {
        cin>>x;
        if(x<=b){
            sum+=1;
        }else{
            sum+=2;
        }
    }
    cout<<sum<<endl;
    
    return 0;
}