#include<iostream>
using namespace std;

int main(){
    int n; cin>>n;
    int hn=(n+1)/2;
    for (int i=1;i<=n;i=i+1){
        for (int j=1; j<=n;j=j+1){
            if (i==hn||j==hn||(i==1&&j<=hn)||(j>=hn&&i==n)||(j==n&&i<=hn)||(j==1&&i>=hn))
                cout<<"*"; else cout<<" ";
        }
        cout<<endl;
    }
}
