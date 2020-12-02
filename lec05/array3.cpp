#include <iostream>
#include<vector>
using namespace std;
void subarray (vector<int>& arr){
    for(int i=0;i<arr.size();i++){
        for(int j=i;j<arr.size();j++){
            for(int k=i;k<=j;k++){
                cout<<arr[k]<<" ";
            }
            cout<<endl;
        }
    }
}
int main(){
    vector<int> arr{3,2,1,4,0};
    subarray(arr);
}
