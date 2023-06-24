#include<stdio.h>
int main()
{
	int a,b,count=0;
	scanf("%d%d",&a,&b);
	char arr[a+1][b+1];
	for(int i=0;i<a;i++){
		for(int j=0;j<b;j++){
			scanf(" %c",&arr[i][j]);
		}
	}
	for(int i=0;i<a;i++){
	
		for(int j=0;j<b;j++){
		
			if(arr[i][j]!='*'&&arr[i][j-1]!='*'&&arr[i][j+1]!='*'&&arr[i-1][j]!='*'&&arr[i+1][j]!='*'){
			count++;
			
			}
		}
	}
	printf("%d\n",count);
	return 0;
}
