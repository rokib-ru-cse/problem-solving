#include <bits/stdc++.h>
using namespace std;

const int V = 1e3;
int graph[V + 1][V + 1];

vector<pair<int,int>> graphvec[V];

int main()
{
    int v, e;
    cin >> v >> e;
    for (int i = 0; i < e; i++)
    {
        int v1, v2,wt;
        cin >> v1 >> v2;
        graph[v1][v2] = wt;
        graph[v2][v1] = wt;

        graphvec[v1].push_back({v2,wt});
        graphvec[v2].push_back({v1,wt});
    }



    return 0;
}