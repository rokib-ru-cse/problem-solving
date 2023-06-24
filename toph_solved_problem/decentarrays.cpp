#include<bits/stdc++.h>
using namespace std;
int main(){
    int n;
    cin>>n;
    int arr[n];
    int flag1 = 0,flag2=0,temp=0,a;
    for (int i = 0; i < n; i++)
    {
        cin>>a;
        if(flag1==0 && a>=temp){
            flag2 = 1;
            temp = a;
        }
        if(flag1==0 &&a<temp){
            flag2=0;
            flag1=1;
        }
        
    }
    if(flag2==1){
cout<<"Yes"<<endl;
    }else{
cout<<"No"<<endl;
    }
    



    return 0;
}