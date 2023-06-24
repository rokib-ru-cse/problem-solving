#include <bits/stdc++.h>
using namespace std;
int main()
{
    int x,temp;
    cin>>x;
    int arr[x+1],res[x+1];
    for (int i = 1; i <= x; i++)
    {   
        cin>>arr[i];
    }
    for (int i = 1; i <= x; i++)
    {   
        for (int j = 1; j <= x; j++)
        {
            temp = arr[j];
            if(arr[temp]==i){
                cout<<j<<endl;
                break;
            }
        }

    }
    
    return 0;
}
