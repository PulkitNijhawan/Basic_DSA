#include<iostream>
#include<vector>
using namespace std;
void subarray(vector<int>& arr){
    for(int i=0;i<arr.size();i++){
        for(int j=0;j<arr.size();j++){
            for(int k=i;k<=j;k++){
                cout<<arr[k]<<" ";
            }
            cout<<endl;
        }
        cout<<endl;
    }
}
int main(){
    vector<int> arr{1,2,3,4};
    subarray(arr);
}