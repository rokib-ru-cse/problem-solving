#include<bits/stdc++.h>
using namespace std;
int main(){
    double a;
    cin>>a;
    int b= a;
    int c = b/10;
    string  res = "[";
    for (int i = 1; i <= 10; i++)
    {
        if(i<=c){
            res+="+";
        }else{
            res+='.';
        }
    }
	res+="]";
    cout<<res<<" "<<b<<"%"<<endl;
    
    return 0;
}