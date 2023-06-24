#include <bits/stdc++.h>
using namespace std;
int main()
{
    int a,b,c;
    cin>>a>>b>>c;
    int arr[4];
    arr[0] = a+b+c;
    arr[1] = a*(b+c);
    arr[2] = a*b*c;
    arr[3] = (a+b)*c;
    int z = *max_element(arr,arr+4);
    cout<<z<<endl;
    return 0;
}