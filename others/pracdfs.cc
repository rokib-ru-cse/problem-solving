#include <bits/stdc++.h>
using namespace std;

const int V = 1e5 + 10;
vector<int> graph[V];
bool visited[V];

void dfs(int vertex)
{
    if (visited[vertex])
    {
        return;
    }
    visited[vertex] = true;
    for (int child : graph[vertex])
    {
        cout << " parent => " << vertex << " child => " << child << endl;
        dfs(child);
    }
}

int main()
{
    int v, e;
    cin >> v >> e;
    for (int i = 0; i < v; i++)
    {
        int v1, v2, wt;
        cin >> v1 >> v2 >> wt;
        graph[v1].push_back(v2);
        graph[v2].push_back(v1);
    }
    dfs(1);

    return 0;
}