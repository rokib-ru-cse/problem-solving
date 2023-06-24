#include <bits/stdc++.h>
using namespace std;
int main()
{
    int n,a,b;
    vector<pair<int,int>> data;
    cin>>n;
    while (n--)
    {
        cin>>a>>b;
        data.push_back(make_pair(a,b));
    }
    int count = 0;
    for (int i = 0; i < data.size(); i++)
    {
        for (int j = 0; j < data.size(); j++)
        {
            if(data[i].first==data[j].second){
                count++;
            }
        }
    }
    cout<<count<<endl;
    return 0;
}