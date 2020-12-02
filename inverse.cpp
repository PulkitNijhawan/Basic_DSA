#include<iostream>
#include<cmath>
using namespace std;
int main(){
    int n;cin>>n;
    int result=0;
    int digit=0;
    for(int i=1;n>0;i++){
        digit=n%10;
        result+=i*pow(10,digit-1);
        n=n/10;
    }
    cout<<result;
}