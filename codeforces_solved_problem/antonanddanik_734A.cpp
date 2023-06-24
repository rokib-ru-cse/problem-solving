#include <bits/stdc++.h>
using namespace std;
int main()
{
    string s1;
    int n;
    cin>>n;
    cin>>s1;
    int a=0,d=0;
    for (int i = 0; i < s1.length(); i++)
    {
        if(s1[i]=='A'){
            a++;
        }else{
            d++;
        }
    }
    if (a>d)
    {
        cout << "Anton" << endl;
    }
    else if (a<d)
    {
        cout << "Danik" << endl;
    }
    else{
        cout << "Friendship" << endl;
    }
    return 0;
}