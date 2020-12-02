#include<iostream>
using namespace std;
int main(){
    int n ;cin>>n;
    int hn=(n+1)/2;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            if(i==hn||j==hn||(i+j==n+3))cout<<"*\t";
            else cout<<"\t";
        }
        cout<<endl;
    }
}
//single plural