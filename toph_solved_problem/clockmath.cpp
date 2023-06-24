#include<bits/stdc++.h>
using namespace std;
int main()
{
	int h,m;
	cin>>h>>m;

	double mntdeg = (360.0/60.0)*m; 
	double hourdeg = ((360.0/12)*h)+(((360.0/12.0)/60.0)*m);
	if(abs(mntdeg-hourdeg)>180){
		cout<<360.0-abs(mntdeg-hourdeg)<<endl;
	}else{
		cout<<abs(mntdeg-hourdeg)<<endl;
	}
	return 0;
}
