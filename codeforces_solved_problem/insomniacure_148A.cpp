#include <bits/stdc++.h>
using namespace std;
int main()
{
    int a, b, c, d, e;
    cin >> a >> b >> c >> d >> e;
    int arr[e + 1] = {0};
    int arr1[4] = {a, b, c, d};
    int sum=0;
    for (int j = 0; j < 4; j++)
    {
        for (int i = 1; i <= e; i++)
        {
            if(i%arr1[j]==0){
                arr[i]=1;
            }
        }
    }
    for (int i = 1; i <= e; i++)
    {
        if(arr[i]==0){
            sum++;
        }
    }
    cout<<e-sum<<endl;

    return 0;
}