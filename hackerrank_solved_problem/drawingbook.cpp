#include<bits/stdc++.h>
using namespace std;
int main(){

    int n,p;
    cin>>n>>p;

    int start = p/2;
    int end = n%2==0 ? (n+1-p)/2 : (n-p)/2;
    if(start<end){
        cout<<start<<endl;
    }else{
        cout<<end<<endl;
    }
    return 0 ;
}