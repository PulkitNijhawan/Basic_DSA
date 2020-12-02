#include<iostream>
#include<vector>
using namespace std;
int sum_multi(vector<int>& arr){
    int sum=0;
    int Max=sum;
    for(int i=0;i<arr.size();i++){
        for(int j=0;j<arr.size();j++){
            sum=sum+(j*arr[j]);
        }
        for(int k=0;k<arr.size()-1;k++){
            swap(arr[k],arr[k+1]);
        }
        if(Max<sum)Max=sum;
    }
    return Max;
}
int main(){
    vector<int> arr{5,4,8,2,1};
    cout<<sum_multi(arr);
}