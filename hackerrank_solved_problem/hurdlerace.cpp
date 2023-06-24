#include<bits/stdc++.h>
using namespace std;
int main()
{
    int n,k;
    cin>>n>>k;
    int max = 0,temp;
    while(n--){
        cin>>temp;
        if(temp>max){
            max = temp;
        }
    }
    if(max>k){

    cout<<max-k;
    }else{
    cout<<0;

    }
    return 0;
}
