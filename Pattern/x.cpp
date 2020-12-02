#include<iostream>
using namespace std;
int main(){
    int n;cin>>n;
    int hn=(n+1)/2;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            if((i+j>=n+1&&j<i)||(j<=n&&i==1)||i==n||i==j||i+j==n+1)cout<<"*\t";
            else cout<<"\t";
        }
        cout<<endl;
    }
}