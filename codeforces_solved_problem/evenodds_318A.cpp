#include <bits/stdc++.h>
using namespace std;
int main()
{
   long long a,b;
   cin>>a>>b;
   long long c = a%2==0?a/2:((a/2)+1);
   if(b<=c){
       cout<<(b*2)-1<<endl;
   }else{
       cout<<2*(b-c)<<endl;
   }
   
    return 0;
}