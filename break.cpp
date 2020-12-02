#include<iostream>

using namespace std;
int main(){
    int n;cin>>n;
    int cnt=0;
    for(int i=1;n/i!=0;i=i*10){
        cnt++;
    }
    // for(;n>0;n/=10){
    //     cout<<n%10<<endl;
    // }
    int k=1;
    for(;cnt!=1;k=k*10){
        cnt--;
    }
    
    
    for(;n>0;k/=10){
        cout<<n/k<<endl;
        n=n%k;
    }
}