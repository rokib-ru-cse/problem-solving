#include <bits/stdc++.h>
using namespace std;
int main()
{
    string s;
    int t, a;
    cin >> t;
    vector<int> one;
    vector<int> two;
    vector<int> three;
    for (int i = 0; i < t; i++)
    {
        cin >> a;
        one.push_back(a);
        
    }
    sort(one.begin(),one.end());
    for (int i = 0; i < t - 1; i++)
    {
        cin >> a;
        two.push_back(a);
    }
    sort(two.begin(),two.end());
    for (int i = 0; i < one.size(); i++)
    {
        if(one[i]!=two[i]){
            cout<<one[i]<<endl;
            break;
        }
    }
    for (int i = 0; i < t - 2; i++)
    {
       cin >> a;
        three.push_back(a);
        
    }
    sort(three.begin(),three.end());

    for (int i = 0; i < two.size(); i++)
    {
        if(three[i]!=two[i]){
            cout<<two[i]<<endl;
            break;
        }
    }
    return 0;
}