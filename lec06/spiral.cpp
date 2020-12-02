#include<iostream>
#include<vector>
using namespace std;
void clock(vector<vector<int>>& arr,int r,int c){
    int cnt=0;
    int cmin=0;int cmax=c-1;int rmin=0;int rmax=r-1;
    while(cnt<r*c){
        for(int k=cmin;k<=cmax;k++){
            cout<<arr[rmin][k]<<" ";
            cnt++;
        }
        rmin++;
        for(int l=rmin;l<=rmax;l++){
            cout<<arr[l][cmax]<<" ";
            cnt++;
        }
        cmax--;
        for(int m=cmax;m>=cmin;m--){
            cout<<arr[rmax][m]<<" ";
            cnt++;
        }
        rmax--;
        for(int n=rmax;n>=rmin;n--){
            cout<<arr[n][cmin]<<" ";
            cnt++;
        }
        cmin++;
    }
}
void anti(vector<vector<int>>& arr,int c,int r){
    int cnt=0;
    int cmin=0;int cmax=c-1;int rmin=0;int rmax=r-1;
    while(cnt<r*c){
        for(int k=rmin;k<=rmax;k++){
            cout<<arr[k][cmin]<<" ";
            cnt++;
        }
        cmin++;
        for(int l=cmin;l<=cmax;l++){
            cout<<arr[rmax][l]<<" ";
            cnt++;
        }
        rmax--;
        for(int m=rmax;m>=rmin;m--){
            cout<<arr[m][cmax]<<" ";
            cnt++;
        }
        cmax--;
        for(int n=cmax;n>=cmin;n--){
            cout<<arr[rmin][n]<<" ";
            cnt++;
        }
        rmin++;
    }
}
int main(){
    int r;cin>>r;
    int c;cin>>c;
    vector<vector<int>> arr(r,vector<int>(c,0));
    int n;
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            cin>>n;
            arr[i][j]=n;
        }
    }
    clock(arr,r,c);
    cout<<endl;
    anti(arr,r,c);
    
}