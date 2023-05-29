#include <bits/stdc++.h>
using namespace std;

const int A = 1e5 + 10;
const int B = 1e5 + 10;
const int C = 1e5 + 10;
const int D = 1e5 + 10;
const int E = 1e5 + 10;

long long fact[A];
long long fact2[A];
long long fact3[A];
long long fact4[A];

int main()
{
    fact[0] = fact[1] = 1;
    fact[0] = fact[1] = 1;
    fact[0] = fact[1] = 1;
    fact[0] = fact[1] = 1;
    for (int i = 2; i < A; i++)
    {
        /* code */
        fact[i] = fact[i - 1] * i;
        fact[i] = fact[i - 1] * i;
        fact[i] = fact[i - 1] * i;
        fact[i] = fact[i - 1] * i;
        fact[i] = fact[i - 1] * i;
    }

    return 0;
}