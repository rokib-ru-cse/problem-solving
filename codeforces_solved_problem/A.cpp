#include<bits/stdc++.h>
using namespace  std;

int main(){
    long long n,m;
    cout<<"hi"<<endl; 
        cin>>n;
        while(n--){
            bool flag = false; 
            cin>>m;
            if(m%2!=0){
                cout<<"YES\n";
                continue;
            }
            long i=3;            
                do{
                    if(m%i==0){
                        if(i%2!=0){
                            cout<<"YES\n";
                            flag = true;
                            break;
                        }
                    }
                    i+=2;
                }while(i*i<=m);
                if(!flag){
                    cout<<"NO"<<endl;
                }
        }
    return 0;
}
