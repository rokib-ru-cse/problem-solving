#include<bits/stdc++.h>
using namespace std;
int main()
{
   int arr[3][3];
   int res=0,count=0;
    for(int i=0;i<3;i++){
        
        for (int j = 0; j < 3; j++)
        {
            cin>>arr[i][j];
        }
        res += arr[0][i];
    }
    res =15;
    int temp=0;
    for(int i=0;i<3;i++){
        
        for (int j = 0; j < 3; j++)
        {
            temp += arr[i][j];
        }
        cout<<"res = "<<res<<" temp = "<<temp<<endl;
        if(temp!=res){
            if(temp>res){
                count += temp-res;
                arr[i][2] = temp - count-arr[i][1];
            }else{
                count += res-temp;
                arr[i][2] = res - temp +arr[i][2];
            }
        }
        temp = 0;
        
    }
for(int i=0;i<3;i++){
        
        for (int j = 0; j < 3; j++)
        {
            cout<<arr[i][j]<<" ";
        }
        cout<<endl;
    }

    cout<<count;
    
    return 0;
}
