#include <bits/stdc++.h>
using namespace std;
int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        int n;
        cin >> n;
        long long arr[n];
        double max = -99999999999999.0, avg1 = 0.0, avg2 = 0.0, sum1 = 0.0, sum2 = 0.0;
        for (int i = 0; i < n; i++)
        {
            cin >> arr[i];
        }
        sort(arr, arr + n);
        int flag=0;
        for (int i = n - 1, x = 1; i >= 0; i--, x++)
        {
            sum1 += arr[i];
            avg1 = sum1 / x;
            for (int j = i - 1, y = 1; j >= 0; j--, y++)
            {
                sum2 += arr[j];
                avg2 = sum2 / y;
            }
            //cout<<"avg1 = "<<avg1<<" avg2 = "<<avg2<<endl;
            if (avg1+avg2>max)
            {
                max = avg1+avg2;
            }else{
                flag=1;
            }
            if(flag=1){
                break;
            }
            sum2=0.0;
        }
        cout<<fixed<<setprecision(9)<<max<<endl;
        max=-99999999999999.0;
    }

    return 0;
}