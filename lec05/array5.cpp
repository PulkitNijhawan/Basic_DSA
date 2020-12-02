#include<iostream>
#include<vector>
using namespace std;
bool binary_search(vector<int>& arr,int key){
    
    int cs=0;int ce=arr.size()-1;
    
    
    while(cs<=ce){
        int mid=(ce+cs)/2;
        if(arr[mid]<key){
            cs=mid+1;
        }
        else if(arr[mid]==key){
            return true;
        }
        else ce=mid-1;

    }
    return false;
}
int main(){
    vector<int> arr{5,10,12,18,22,99,101,102};
    cout<<binary_search(arr,12);
}