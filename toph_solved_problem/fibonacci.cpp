#include<bits/stdc++.h>
using namespace std;
int main(){

int a,b,n;
a=1;
b=1;
cin>>n;
if(n==1){
		cout<<a;
		
	}
	if(n==2){
		cout<<b;
	}
	int temp;
for(int i=3;i<=n;i++){
	temp = a;
	a = a+b;
	b = temp;
}
cout<<a<<endl;



	return 0;
}
