#include<iostream>
#include<vector>
using namespace std;
vector<int> array2(vector<int>& arr,vector<int>& idx){
    
    for(int i=0;i<arr.size();i++){
        if(i!=idx[i]){
            swap(arr[i],arr[idx[i]]);
            swap(idx[idx[i]],idx[i]);
        }
        else continue;
    }
    return arr;
}

int main(){
    vector<int> arr{50,40,70,60,90};
    vector<int> idx{3,0,4,1,2};
    arr=array2(arr,idx);
    for(int i=0;i<arr.size();i++){
        cout<<arr[i]<<" ";
    }

}