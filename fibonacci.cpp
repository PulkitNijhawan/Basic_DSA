#include<iostream>
using namespace std;
int main(){
    int n;cin>>n;
    int a=0;
    int b=1;
    cout<<a<<endl;
    cout<<b<<endl;
    int temp;
    for(int i=0;i<n-2;i++){
        cout<<a+b<<endl;
        temp=a;
        a=b;
        b=b+temp;
    }
}