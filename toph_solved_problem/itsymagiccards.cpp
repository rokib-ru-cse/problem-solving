#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n;
    int m;
    int count1 = 0,count2 = 0,c;
    cin >> n>>m;
    string s="";
    int max = 0;
    char z;
    for (int i = 0; i < m*2; i++)
    {
        cin>>z;
        s+=z;
    }
    for (int i = 0; i < m*2; i++)
    {
        c = std::count(s.begin(), s.end(), s[i]);
        if(c==1 and s[i]!='0'){
            count1++;
            count2++;
        }else if(c!=1&& s[i]!='0'){
            char x = s[i];
            for (int j = 0; j < m*2; j++)
            {
               if(x==s[j]){
                   s[j]='0';
               }     
            }
            count2++;
        }
    }
    cout<<(n-count2)+count1<<endl;
    return 0;
}
