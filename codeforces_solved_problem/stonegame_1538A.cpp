#include <bits/stdc++.h>
using namespace std;
int main()
{
    int t, n;
    cin >> t;
    while (t--)
    {
        cin >> n;
        int mini, min = 99999999, max = 0, maxi, a;
        for (int i = 1; i <= n; i++)
        {
            cin >> a;
            if (a > max)
            {
                max = a;
                maxi = i;
            }
            if (a < min)
            {
                min = a;
                mini = i;
            }
        }
        int arr[4];
        //cout<<"min = "<<mini<<" max = "<<maxi<<endl;
        arr[0] = mini + (n - maxi + 1);
        arr[1] = (n - mini + 1) + maxi;
        arr[2] = maxi>mini?maxi:mini;
        arr[3] = maxi>mini?(n-mini+1):(n - maxi + 1);
        // for (int i = 0; i < 4; i++)
        // {
        //     cout<<arr[i]<<" ";
        // }
        
        cout << *min_element(arr, arr + 4) << endl;
    }

    return 0;
}