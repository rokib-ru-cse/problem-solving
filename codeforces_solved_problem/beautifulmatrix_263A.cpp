#include <bits/stdc++.h>
using namespace std;
int main()
{
    int arr[6][6];
    int row,col;
    int n;
    for (int i = 1; i <= 5; i++)
    {
        for (int j = 1; j <= 5; j++)
        {
            cin>>n;
            arr[i][j] = n;
            if(n==1){
                row=i;
                col=j;
            }
        }
        
    }
    cout<<abs(row-3)+abs(col-3)<<endl;
    return 0;
}