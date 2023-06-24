#include<bits/stdc++.h>
using namespace std;
int main(){

int n,a;
cin>>n;
int arr[1000]={0},count=0;
for(int i=0;i<n;i++)
{
	cin>>a;
	arr[a]++;
}
for(int i=0;i<1000;i++){
	if(arr[i]>0){
		count += arr[i]/2;
	}
}
cout<<count<<endl;


	return 0;
}
