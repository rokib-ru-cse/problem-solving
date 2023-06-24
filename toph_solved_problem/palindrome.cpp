#include<bits/stdc++.h>
using namespace std;
int main()
{
	string s;
	bool flag;
	gets(s);
	for(int i=0;i<s.length();i++){
		if(s[i]==s[s.length()-i-1]){
			flag=true;
		}else{
		flag=false;
		}
	}
if(flag){
	cout<<"Yes"<<endl;
}else{
	cout<<"No"<<endl;
}

	return 0;
}
