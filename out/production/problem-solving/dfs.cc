#include <bits/stdc++.h>
using namespace std;
const int V = 1e5 + 10;
vector<int> graph[V];

bool visited[V];

void dfs(int vertex)
{
    ///
    if (!visited[V])
    {
        visited[V] = true;
    }
    else
    {
        return;
    }
    for (int child : graph[V])
    {
        //
        dfs(child);
        //
    }
}

int main()
{
    int v, e;
    cin >> v >> e;
    for (int i = 0; i < v; i++)
    {
        int v1, v2;
        cin >> v1 >> v2;
        graph[v1].push_back(v2);
        graph[v2].push_back(v1);
        /* code */
    }

    return 0;
}