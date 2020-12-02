#include<iostream>
using namespace std;
int main(){
    int n;cin>>n;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            cout<<j<<"\t";
        }
        for(int k=2*n-3;k<=2;k=k+2){
            cout<<"\t";
        }
        for(int l=1;l<i;l++){
            cout<<n-l<<"\t";
        }
        cout<<endl;
    }
}