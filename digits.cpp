#include<iostream>
using namespace std;
int main(){
    int n;cin>>n;
    int cnt=0;
    for(int i=1;n/i!=0;i=i*10){
        cnt++;
    }
    cout<<cnt;
}