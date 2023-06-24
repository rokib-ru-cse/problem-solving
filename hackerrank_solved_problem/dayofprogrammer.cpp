#include <bits/stdc++.h>

using namespace std;

int main(){
    
    int n,day,month,sum=0;
    cin>>n;
    for(int i=1;i<13;i++){
        if(i%2!=0){
            sum+=31;
        }else if(i==2){
            if((n%400==0)||(n%4==0 && n!=100)){
            sum+=29;
            }else{
            	sum+=28;
            }
        }else{
            sum += 30;
        }
        if(256-sum<30){
        	day = 256-sum;
        	month = i;
        	break;
        }
    }
    
    cout<<day<<".0"<<month<<"."<<n;
    return 0;
}
