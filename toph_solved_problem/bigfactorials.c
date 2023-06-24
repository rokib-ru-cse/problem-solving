#include<stdio.h>

int facto(int n){
	if(n==1){
		return n;
	}
	return n*facto(n-1);
}

int main()
{
	int n;
	int fact,temp;
	scanf("%d",&n);
	fact = facto(n);
	char arr[4];
	while(true){
		if(fact/10>0){
			temp = char(fact%10);
			
			fact/=10;
		}
		else{
		
			break;
		}
	}
	printf("%d",fact);



	return 0;
}
