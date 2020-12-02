#include<iostream>
#include<vector>
using namespace std;
void anti_rot(vector<vector<int>>& arr){
    for(int i=0;i<arr.size();i++){
        for(int j=0;j<arr[i].size();j++){
            if(i>j)swap(arr[i][j],arr[j][i]);
        }
    }
    for(int l=0;l<arr.size()/2;l++){
        for(int m=0;m<arr[l].size();m++){
            swap(arr[l][m],arr[arr[l].size()-1-l][m]);
        }
    }
}
int main(){
    vector<vector<int>> arr{{1,2,3},{4,5,6},{7,8,9}};
    anti_rot(arr);
    for(int i=0;i<arr.size();i++){
        for(int j=0;j<arr[i].size();j++){
            cout<<arr[i][j]<<" ";
        }
        cout<<endl;
    }
}