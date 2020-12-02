#include<iostream>
#include<vector>
using namespace std;
bool binary_search(vector<int>& arr,int key){
    int s=0;
    int e=arr.size()-1;
    int mid;
    while(s<=e){
        mid=(s+e)/2;
        if(arr[mid]<key)s=mid+1;
        else if(arr[mid]==key)return true;
        else e=mid-1;
    }
    return false;
}
int main(){
    vector<int> arr{1,2,3,4};
    cout<<binary_search(arr,1);
}