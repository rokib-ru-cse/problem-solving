#include<stdio.h>
int main(){
long long int a,b,flag,tempa,tempb,res,c=0;
scanf("%lld%lld",&a,&b);
while(a!=0&&b!=0){
	if(a/10==0){
		tempa = a;
		a = 0;
	}else{
		tempa = a%10;
		a/=10;
	}if(b/10==0){
	tempb = b;
		b = 0;
		c=1;
	}else{
	tempb = b%10;
		b/=10;
	}

	res = tempa+tempb;
	if(res>9){
		flag = 1;
		break;
	}else{
		flag = 0;
	}
}
if(flag==1){
	printf("Yes\n");
}else{
printf("No\n");
}
return 0;
}

























