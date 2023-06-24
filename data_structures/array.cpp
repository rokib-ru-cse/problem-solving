#include<bits/stdc++.h>
using namespace std;
int main(){
    int arr[10] = {1,10,7,3,2,9,4,5,6,8};
    // array traversing
    cout<<"array traversing"<<endl;
    for(int i=0;i<10;i++){
        cout<<arr[i]<<" ";
    }
    // sorting accending
    int temp;
    for(int i=0;i<10-1;i++){
        for(int j=i+1;j<10;j++){
            if(arr[i]>arr[j]){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    } 
    cout<<endl<<"array sorting accending"<<endl;
    for(int i=0;i<10;i++){
        cout<<arr[i]<<" ";
    }
    // sorting decending
    for(int i=0;i<10-1;i++){
        for(int j=i+1;j<10;j++){
            if(arr[i]<arr[j]){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    } 
    cout<<endl<<"array sorting decending"<<endl;
    for(int i=0;i<10;i++){
        cout<<arr[i]<<" ";
    }




    cout<<endl;
    return 0;
}