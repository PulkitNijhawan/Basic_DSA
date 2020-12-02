#include<iostream>
using namespace std;
int main(){
    int n;cin>>n;
    int a=0;
    int b=1;
    cout<<a<<endl;
    cout<<b<<"\t"<<a+b<<endl;
    a=1;
    b=1;
    for(int i=0;i<n;i++){
        if(i==0||i==1)continue;
        
        for(int j=0;j<=i;j++){
            
            int temp=a;
            cout<<a+b<<"\t";
            a=b;
            b=b+temp;

        }
        cout<<endl;
    }
}