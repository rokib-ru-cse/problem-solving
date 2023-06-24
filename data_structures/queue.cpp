#include <bits/stdc++.h>
using namespace std;
const int N = 3;
int arr[N];
int front = -1, rear = -1;

bool isEmpty()
{
    return (front == -1 && rear == -1) ? true : false;
}
void enqueue(int a)
{
    if ((rear + 1) % N == front)
    {
        return;
    }
    else if (isEmpty())
    {
        front++;
        rear++;
    }
    else
    {
        rear = (rear + 1) % N;
    }
    arr[rear] = a;
}

void print()
{
    for (int i = front;; i = (i + 1) % N)
    {
        cout << arr[i] << " ";
        if (i == rear)
            break;
    }
    cout << endl;
}
int dequeue()
{
    if (isEmpty())
    {
        return front;
    }
    else if (front == rear)
    {
        int a = front;
        front = -1;
        rear = -1;
        return arr[a];
    }
    else
    {
        int a = front;
        front = (front + 1) % N;
        return arr[a];
    }
}

int Front()
{
    if (front != -1)
    {
        return arr[front];
    }
    else
    {
        return front;
    }
}

struct Node
{
    int data;
    Node *next;
};
Node *lfront = NULL;
Node *lrear = NULL;
void lenqueue(int a)
{
    Node *temp = new Node();
    temp->data = a;
    temp->next = NULL;
    if (lfront == NULL)
    {
        lfront = temp;
        lrear = temp;
    }
    else
    {
        lrear->next = temp;
        lrear = temp;
    }
}
int ldequeue(){
    Node *temp = lfront;
    int a = temp->data;
    if(lfront==NULL) return 0;
    if(lfront== lrear) lfront=lrear=NULL;
    else lfront=lfront->next;
    free(temp);
    return a;
}
void lprint(){
    Node *temp = lfront;
    while (temp!=NULL)
    {
        cout<<temp->data<<" ";
        temp = temp->next;
    }
    
}
int main()
{
    int flag;
    cout << "enter 1 for queue using array, 2 for using linked list :";
    cin >> flag;
    if (flag == 1)
    {
        int n, a;
        cout << "how many elements do you want to insert :";
        cin >> n;
        for (int i = 0; i < n; i++)
        {
            cin >> a;
            enqueue(a);
        }
        cout << front << endl;
        cout << rear << endl;
        print();
        cout << dequeue() << endl;
        cout << dequeue() << endl;
        cout << Front() << endl;
        cout << isEmpty() << endl;
        enqueue(8);
        enqueue(9);
        print();
        cout << front << endl;
        cout << rear << endl;
    }
    else
    {
        int n, a;
        cout << "how many elements do you want to insert :";
        cin >> n;
        for (int i = 0; i < n; i++)
        {
            cin >> a;
            lenqueue(a);
        }
        cout<<ldequeue()<<endl;
        lprint();
    }
    return 0;
}