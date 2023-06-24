#include<bits/stdc++.h>
using namespace std;
int main(){

int n;
cin>>n;
int arr[n]={0},newarr[n]={0};
for(int i=0;i<n;i++){
cin>>arr[i];
}
for(int i=0;i<n;i++){
	newarr[arr[i]]++;
}
int max = newarr[0];
int id = 0;
for(int i=0;i<n;i++){
	if(newarr[i]>max){
		max = newarr[i];
		id = i;
	}
}

cout<<id;











return 0;
}
