#include <bits/stdc++.h>
using namespace std;
int main()
{
    int x,y,z;
    int count = 0;
    string temp="";
    cin>>x>>y>>z;
    for (int i = x ; i <= y; i++)
    {
        x = i;
        while(x/10>0){
            temp += to_string(x%10);
            x/=10;
        }
        temp +=to_string(x);
        if(abs(i-stoi(temp))%z==0){
            count++;
        }
        temp = "";
    }
    cout<<count<<endl;
    return 0;
}
