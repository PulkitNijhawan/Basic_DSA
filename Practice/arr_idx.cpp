#include<iostream>
#include<vector>
using namespace std;
void arr_idx(vector<int>& arr,vector<int>& idx){
    for(int i=0;i<arr.size();i++){
        if(i!=arr[i]){
            swap(arr[i],arr[idx[i]]);
            swap(idx[i],idx[idx[i]]);
        }
        else continue;
    }
}
int main(){
    vector<int> arr{50,40,70,60,90};
    vector<int> idx{3,0,4,1,2};
    arr_idx(arr,idx);
    for(int i=0;i<arr.size();i++){
        cout<<arr[i]<<" ";
    }
}