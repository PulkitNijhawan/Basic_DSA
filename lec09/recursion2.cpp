#include<iostream>
#include<vector>
using namespace std;
int min_max_idx(vector<int>& arr,int i,int data){
    if(i==arr.size())return -1;
    int prev_occ=min_max_idx(arr,i+1,data);
    if(arr[i]==data){
        if(prev_occ!=-1)return prev_occ;
        else return i;
    }
}
vector<int> all_occ(vector<int>& arr,int data,int i,int cnt){
    if(i==arr.size()){
        vector<int> baseRes(cnt,0);
        return baseRes;
    }
    if(arr[i]==data)cnt++;
    vector<int> recAns=all_occ(arr,data,i+1,cnt);
    if(arr[i]==data)recAns[cnt-1]=i;
    return recAns;
}
int main(){
    vector<int> arr={3,5,6,7,8,5,1};
    vector<int>temp=all_occ(arr,5,0,0);
    for(int i=0;i<temp.size();i++)cout<<temp[i]<<" ";
    
    }
}


