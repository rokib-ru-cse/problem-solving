#include <bits/stdc++.h>
using namespace std;
int main()
{
    int n;
    cin >> n;
    char c;
    vector<char> v;
    bool flag = false;
    char arr[26] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    for (int i = 0; i < n; i++)
    {
        cin >> c;
        v.push_back(tolower(c));
    }

    for (int i = 0; i < 26; i++)
    {
        if(count(v.begin(),v.end(),arr[i])>0){
            flag = true;
        }else{
            flag = false;
            break;
        }
    }
    if (flag)
    {
        cout << "YES" << endl;
    }
    else
    {
        cout << "NO" << endl;
    }
    return 0;
}