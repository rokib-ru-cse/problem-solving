#include<bits/stdc++.h>
using namespace std;
int main(){

int a;
cin>>a;
int b = sqrt(a);
for(int i=2;i<=b;i++){
	if(a==2 || a==3){
	cout<<"Yes"<<endl;
	return 0;
	}
	if(a%i==0){
		cout<<"No"<<endl;
		return 0;
	}
}
cout<<"Yes"<<endl;


	return 0;
}
