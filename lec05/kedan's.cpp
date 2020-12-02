#include<iostream>
#include<vector>
using namespace std;
int kendal(vector<int>& arr){
    int cs=0;int ce=0;int sum=0;int Max=0;
    while(ce<arr.size()){
        if(sum>0){
            sum+=arr[ce];
            if(Max<sum)Max=sum;
        }
        else{
            cs=ce;
            sum=arr[cs];
        }
        
        ce++;
    }
    return Max;
}
int main(){
    vector<int> arr{5,-3,2,-8,1,4,7,-1,6,-8};
    cout<<kendal(arr);
}