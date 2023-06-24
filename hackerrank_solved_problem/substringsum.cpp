#include <bits/stdc++.h>

using namespace std;

int main(){
    
    int n,arr[1000],x,y,sum=0,count=0;
    cin>>n;
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    cin>>x>>y;
    for(int i=0;i<n;i++){
    	if(n-(i)>=y){
    	for(int z=0,j=i;z<y;z++,j++){
    		sum += arr[j];
    	}}
    	if(sum==x){
            count++;
        }
        sum=0;
    }
    
    cout<<count<<endl;
    
    return 0;
}
