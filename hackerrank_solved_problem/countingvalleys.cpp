#include<bits/stdc++.h>
using namespace std;
int main()
{
	int a;
	cin>>a;
	string b="";
	char c;
	int count = 0;
	int see = 0;
	int up = 0;
	int down = 0;
	bool flag = false;
	for(int i=0;i<a;i++){
		cin>>c;
		if(c=='U'){
			up++;
			if(down>0){
				down--;
			}
			if(down==0 || up==0){
			down=0;
			up=0;
		}
			if(down==0 && flag==true){
				count++;
				flag=false;
			}
		}
		
		if(c=='D'){
			down++;
			if(up>0){
				up--;
			}
			if(down==0 || up==0){
			down=0;
			up=0;
		}
			if(up==0 && down>0){
				flag = true;
			}
		}
	}


cout<<"count = "<<count<<endl;

	return 0;
}
