#include<bits/stdc++.h>
using namespace std;

int factorial(int n)
{
    if(n > 1)
        return n * factorial(n - 1);
    else
        return 1;
}

int main()
{
	int n;
	cin>>n;
	long double fac = double(factorial(n));
	int count = 0;
	string temp;
	string res = "";
	cout<<"fact = "<<fac<<endl;
	while(true){
		if(fac/10==0){
			temp = res;
			res = to_string(fac);
			res +=temp;
			break;
		}else{
		temp = res;
		res = to_string(int(fac)%10);
		res +=temp;
		fac/=10;
		count++;
		}
		if(count==4)
		{
			break;
		}
		
		
	}
cout<<res<<endl;
	return 0;
}
