#include<iostream>
#include<vector>
using namespace std;
int element(vector<vector<int>>& multi,vector<vector<int>>& multi2,int i,int j){
    int k=0;
    int ans=0;
    while(k<multi[i].size()){
        ans+=multi[i][k]*multi2[k][j];
        k++;
    }
    return ans;
}
int main(){
    int r,c;
    cin>>r>>c;
    vector<vector<int>> multi(r,vector<int>(c));
    for(int i=0;i<multi.size();i++){
        for(int j=0;j<multi[i].size();j++){
            cin>>multi[i][j];
        }
    }
    vector<vector<int>> multi2(r,vector<int>(c));
    vector<vector<int>> prod(r,vector<int>(c));
    for(int i=0;i<multi2.size();i++){
        for(int j=0;j<multi2[i].size();j++){
            cin>>multi2[i][j];
        }
    }
    for(int i=0;i<prod.size();i++){
        for(int j=0;j<prod[i].size();j++){
            prod[i][j]=element(multi,multi2,i,j);
        }
    }
    for(int i=0;i<prod.size();i++){
        for(int j=0;j<prod[i].size();j++){
            cout<<prod[i][j]<<" ";
        }
        cout<<endl;
    }
    
}