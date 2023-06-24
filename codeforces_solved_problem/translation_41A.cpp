#include <bits/stdc++.h>
using namespace std;
int main()
{
    string s1,s2;
    cin>>s1>>s2;
    int flag = 1;
    for (int i = 0; i < s1.length(); i++)
    {
        if(s1[i]==s2[s2.length()-i-1]){
            flag=1;
        }else{
            flag=0;
            break;
        }
    }
    if (flag == 1)
    {
        cout << "YES" << endl;
    }
    else
    {
        cout << "NO" << endl;
    }
    return 0;
}