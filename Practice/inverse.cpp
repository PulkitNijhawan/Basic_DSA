#include<iostream>
#include<vector>
using namespace std;
void inverse(vector<int>& arr){
    vector<int> temp(arr.size(),0);
    for(int i=0;i<arr.size();i++){
        temp[arr[i]]=i;
    }
    arr=temp;
}
int main(){
    vector<int> arr{3,2,1,4,0};
    inverse(arr);
    for(int i=0;i<arr.size();i++){
        cout<<arr[i]<<" ";
    }
}