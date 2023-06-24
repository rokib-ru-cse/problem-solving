#include<bits/stdc++.h>
using namespace std;
int main(){
int n;
cin>>n;
if(n%400==0){
cout<<"Yes"<<endl;
}else if(n%100==0){
cout<<"No"<<endl;
}else if(n%4==0){
cout<<"Yes"<<endl;
}else{
	cout<<"No"<<endl;
}
	return 0;
}
