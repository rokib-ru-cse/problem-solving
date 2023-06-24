#include <bits/stdc++.h>
using namespace std;

struct Node
{
    int data;
    Node *next;
};

Node *head = NULL;

void insert_at_begining()
{
    cout << "How mant data do you want to insert ? : " << endl;
    int n, a;
    cin >> n;
    while (n--)
    {
        Node *temp = new Node();
        cin >> a;
        temp->data = a;
        temp->next = head;
        head = temp;
    }
}
void delete_at_nthpos()
{
    cout << "Enter the number of position : " << endl;
    int n;
    cin >> n;
    if (n == 1)
    {
        Node *temp = head;
        head = temp->next;
        free(temp);
        return;
    }
    int cnt = 0;
    Node *tempb = head;
    cnt++;
    cnt++;
    while (true)
    {
        if (cnt == n)
            break;
        tempb = tempb->next;
        cnt++;
    }
    Node *tempnth = tempb->next;
    tempb->next = tempnth->next;
    free(tempnth);
}
void insert_at_nthpos()
{
    cout << "Enter the number of position : " << endl;
    int n, a;
    cin >> n;
    cout << "Enter the Value : " << endl;
    cin >> a;
    if (n == 1)
    {
        Node *temp = new Node();
        temp->data = a;
        temp->next = head;
        head = temp;
        return;
    }
    int cnt = 0;
    Node *tempb = head;
    cnt++;
    cnt++;
    while (true)
    {
        if (cnt == n)
            break;
        tempb = tempb->next;
        cnt++;
    }
    Node *temp = new Node();
    temp->data = a;
    temp->next = tempb->next;
    tempb->next = temp;
}
void insert_at_ending()
{
    cout << "How mant data do you want to insert ? : " << endl;
    int n, a;
    cin >> n;
    cin >> a;
    Node *temp = new Node();
    temp->data = a;
    temp->next = NULL;
    head = temp;
    n--;
    while (n--)
    {
        cin >> a;
        Node *temp1 = head;
        while (temp1->next != NULL)
        {
            temp1 = temp1->next;
        }
        Node *temp = new Node();
        temp->data = a;
        temp->next = NULL;
        temp1->next = temp;
    }
}
void traversing()
{
    // traversing linked list
    Node *temp1 = head;
    while (temp1 != NULL)
    {
        cout << temp1->data << " ";
        temp1 = temp1->next;
    }
    //cout << temp1->data << endl;
}
void reverse()
{
    Node *temp = head;
    Node *pre = NULL;
    while (temp != NULL)
    {
        Node *temp1 = temp->next;
        temp->next = pre;
        pre = temp;
        temp = temp1;
    }
    head = pre;
}
void print_recursive(Node *p){
    if(p==NULL) return;
    cout<<p->data<<" ";
    print_recursive(p->next);
}
void print_recursive_reverse(Node *p){
    if(p==NULL) return;
    print_recursive_reverse(p->next);
    cout<<p->data<<" ";
}
void recursive_reverse(Node *p){
    if(p->next==NULL)
    {
        head=p;
        return;
    }
    recursive_reverse(p->next);
    Node *q = p->next;
    q->next = p;
    p->next=NULL;

}
int main()
{
    cout << "where do you want to insert the data 1 for begining 2 for ending 3 for any position ? : " << endl;
    int pos;
    cin >> pos;
    if (pos == 1)
    {
        insert_at_begining();
    }
    if (pos == 2)
    {
        insert_at_ending();
    }
    //insert_at_nthpos();
    //delete_at_nthpos();
    // reverse();
    // print_recursive(head);
    // cout<<endl;
    // print_recursive_reverse(head);
    recursive_reverse(head);
    // traversing();
    print_recursive(head);
    return 0;
}