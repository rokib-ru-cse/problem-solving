#include <bits/stdc++.h>
using namespace std;
int main()
{
    string s1,s2,s3,s4;
    cin>>s1>>s2>>s3;
    s4 = s1+s2;
    sort(s3.begin(), s3.end());
    sort(s4.begin(), s4.end());
    bool flag = false;
    int l = s3.length()>s4.length()?s3.length():s4.length();
    for (int i = 0; i < l; i++)
    {
        if(s4[i]!=s3[i]){
            flag = true;
            break;
        }
    }
    if(flag){
        cout<<"NO"<<endl;
    }else{
        cout<<"YES"<<endl;
    }
    

    return 0;
}