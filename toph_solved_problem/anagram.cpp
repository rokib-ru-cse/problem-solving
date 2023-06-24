#include<bits/stdc++.h>
using namespace std;

int main()
{
	string a,b;
	bool flag = true;
	cin>>a;
	cin>>b;
	for(int i=0;i<a.length();i++){
		for(int j=0;j<b.length();j++){
			if(a[i]==b[j]){
				flag = true;
				break;
			}else{
				flag = false;
			}
		}
		if(flag==false){
			break;
		}
	
	}
if(flag==true){
cout<<"Yes"<<endl;
}else{
cout<<"No"<<endl;
}




	return 0;
}
