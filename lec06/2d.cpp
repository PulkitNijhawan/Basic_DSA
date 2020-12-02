#include<iostream>
#include<vector>
using namespace std;
int main(){
    vector<vector<int>> multi(4,vector<int>(4,0));
    for(int i=0;i<multi.size();i++){
        for(int j=0;j<multi[i].size();j++){
            cout<<multi[i][j]<<" ";
        }
        cout<<endl;
    }
    vector<vector<int>> multi2{{1,2,3,4},
                               {5,6,7,8},
                               {9,3,6,7}};
    for(int i=0;i<multi2.size();i++){
        for(int j=0;j<multi2[i].size();j++){
            cout<<multi2[i][j]<<" ";
        }
        cout<<endl;
    }
}