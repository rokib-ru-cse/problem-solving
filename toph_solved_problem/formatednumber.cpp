#include <iostream>
#include<string>
using namespace std;

int main() {
	int A;
	int count = 0;
	cin >> A;
	string s,temp;
	while(true){
		if(A/10!=0){
			count++;
			temp = s;
			s = to_string(A%10);
			s+=temp;
			A/=10;
			if(count==3){
				temp = s;
				s=",";
				s+=temp;
				count=0;
			}
			
		}
		else{
			temp = s;			
			s=to_string(A);
			s+=temp;
			break;
		}
	}
	cout<<s<<endl;
	
	return 0;
}

