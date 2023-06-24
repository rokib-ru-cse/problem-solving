#include<bits/stdc++.h>
using namespace std;
int main(){

    int b,k,d;
    cin>>b>>k>>d;
    int key[k],drives[d],res;
    for(int i=0;i<k;i++){
        cin>>key[i];
    }
    for(int i=0;i<d;i++){
        cin>>drives[i];
    }
    int max = 0;
    for(int i=0;i<k;i++){
        if(key[i]>=b){
            continue;
        }
        for(int j=0;j<d;j++){
            if(drives[j]>=b){
                continue;
            }
            res = key[i]+drives[j];
            if(res>max && res<=b){
                max = res;
            }
        }
    }
    if(max==0){

    cout<<-1<<endl;
    }else{
    cout<<max<<endl;
    }
    return 0 ;
}