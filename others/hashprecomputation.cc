#include <bits/stdc++.h>
using namespace std;
const int N = 1e5 + 10;
int precomputation[N];
int main()
{
    int a[] = {
        1,
        2,
        3,
        4,
        3,
        4,
        3,
        4,
        21,
        12,
        1,
        21,
        2,
        1,
        21,
        2,
        1,
        22,
        3,
        23,
        23,
        2,
        3,
        23,
        2,
        32,
        3,
        2,
        3,
        23,
        2,
        32,
        3,
        23,
        23,
        23,
        2,
        1,
        21,
        2,
        1,
        21,
        2,
        1,
        1,
        1,
        1,
        1,
        1,
        1,
        1,
        1,
        43444,
        4,
        4,
        4,
        4,
        4,
        4,
        4,
        4,
        44,
        4,
        3,
        3,
        3,
    };
    for (int i = 0; i < sizeof(a) / sizeof(a[0]); i++)
    {
        /* code */
        precomputation[a[i]]++;
    }
    for (int i = 0; i < 100; i++)
    {
        cout << i << " " << precomputation[i] << endl;
    }

    return 0;
}