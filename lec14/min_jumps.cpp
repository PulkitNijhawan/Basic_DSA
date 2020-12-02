#include<iostream>
#include<vector>
using namespace std;
int Min(vector<int> arr){
    int m=arr[0];
    for(int i=0;i<arr.size();i++){
        if(arr[i]<m)m=arr[i];
    }
    return m;
}
int min_jumps(vector<int>& arr,int idx){
    if(idx==arr.size()-1){
        return 1;
    }
    vector<int> myAns;
    int recAns;
    for(int i=idx+1;i<=arr[idx]+idx;i++){
        recAns=min_jumps(arr,idx+i);
        myAns.push_back(recAns);
        
    }
    // for(int j=0;j<myAns.size();j++){
    //     cout<<myAns[j]<<" ";
    // }
    return recAns;
}
    

int main(){
    vector<int> arr{1,1,1};
    cout<<min_jumps(arr,0);
}