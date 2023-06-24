#include<bits/stdc++.h>
using namespace std;
int main()
{
    int arr[26];
    string s;
    for(int i=0;i<26;i++){
            cin>>arr[i];
    }
    cin>>s;
    int temp ; 
    int max = 0;
    for (int i = 0; i < s.length(); i++)
    {
        temp = int(s[i])%97;
        if(arr[temp]>max){
            max = arr[temp];
        }
    }
    cout<<max*s.length();
        
    
    
    
    return 0;
}
