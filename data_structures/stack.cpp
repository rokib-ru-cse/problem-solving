#include <bits/stdc++.h>
using namespace std;

int stc[100];
int top = -1;
void push(int a)
{
    if (top == 99)
        return;
    top++;
    stc[top] = a;
}
int pop()
{
    if (top == -1)
        return 0;
    int a = stc[top];
    top--;
    return a;
}
int Top()
{
    if (top == -1)
        return 0;
    return stc[top];
}
bool isEmpty()
{
    return top == -1 ? true : false;
}

struct Node
{
    int data;
    Node *next;
};
Node *stop = NULL;

void spush(int a)
{
    Node *temp = new Node();
    temp->data = a;
    temp->next = stop;
    stop = temp;
}
void print()
{
    Node *temp = stop;
    while (temp != NULL)
    {
        cout << temp->data << " ";
        temp = temp->next;
    }
}
int Stop()
{
    if (stop != NULL)
    {
        return stop->data;
    }
    return 0;
}
bool isSempty()
{
    return stop == NULL ? true : false;
}
int spop()
{
    if (stop != NULL)
    {
        Node *temp = stop;
        int a = temp->data;
        stop = temp->next;
        free(temp);
        return a;
    }
    return 0;
}
int main()
{
    int flag;
    cout << "enter 1 for stack in array , 2 for stack in linked list ";
    cin >> flag;
    if (flag == 1)
    {
        int i, a;
        cout << "how many elements do you want to insert ? ";
        for (cin >> i; i; i--)
        {
            cin >> a;
            push(a);
        }
        cout << pop() << endl;
        cout << Top() << endl;
        cout << isEmpty() << endl;
    }
    else
    {
        int i, a;
        cout << "how many elements do you want to insert ? ";
        for (cin >> i; i; i--)
        {
            cin >> a;
            spush(a);
        }
        print();
        cout << spop() << endl;
        cout << Stop() << endl;
        cout << isSempty() << endl;
    }
    return 0;
}