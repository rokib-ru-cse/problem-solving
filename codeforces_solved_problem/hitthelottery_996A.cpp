#include <bits/stdc++.h>
using namespace std;
int main()
{
    long long n;
    cin>>n;
    int sum=0;
    while(n>0){
        if(n>=100){
            sum += n/100;
            n = n%100;
        }else if (n>=20)
        {
            sum += n/20;
            n = n%20;
        }else if (n>=10)
        {
            sum += n/10;
            n = n%10;
        }else if (n>=5)
        {
            sum += n/5;
            n = n%5;
        }else{
            sum += n/1;
            n = n%1;
        }
    }
    cout<<sum<<endl;
    return 0;
}