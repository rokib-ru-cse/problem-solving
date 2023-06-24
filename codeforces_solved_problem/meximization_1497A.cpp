#include <bits/stdc++.h>
using namespace std;

int main()
{
    int t, n, a;
    cin >> t;
    while (t--)
    {
        int arr[101] = {0};
        vector<int> vec;
        int mex = 0;
        cin >> n;
        for (int i = 0; i < n; i++)
        {
            cin >> a;
            arr[a]++;
            if (a > mex)
            {
                mex = a;
            }
        }
        // for (int i = 0; i <=mex ; i++)
        // {
        //     cout<<arr[i]<<" ";
        // }

        for (int i = 0; i <= mex; i++)
        {
            if (arr[i] > 0)
            {
                vec.push_back(i);
                arr[i]--;
            }
        }
        for (int i = 0; i <= mex; i++)
        {
            if (arr[i] > 0)
            {
                for (int j = 0; j < arr[i]; j++)
                {
                    vec.push_back(i);
                }
            }
        }
        for (auto i = vec.begin(); i != vec.end(); ++i)
        {
            cout << *i << " ";
        }
        cout << endl;
    }

    return 0;
}