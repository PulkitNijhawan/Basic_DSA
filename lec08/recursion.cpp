#include<iostream>
using namespace std;
void print(int n){
    if(n==0)return;
    cout<<n<<endl;
    print(n-1);
}
void print_inc(int n){
    if(n==0)return;
    print_inc(n-1);
    cout<<n<<endl;
}
void print_inc_dec(int n){
    if(n==1){
        cout<<n<<endl;
        return;
    }
    cout<<n<<endl;
    print_inc_dec(n-1);
    cout<<n<<endl;
    
}
int fact(int n){
    if(n==0)return 1;
    return n*fact(n-1);
}
void print_odd_eve(int n){
    if(n==0){
        cout<<0<<" ";
        return;
    }
    if(n%2!=0)cout<<n<<" ";
    print_odd_eve(n-1);
    if(n%2==0)cout<<n<<" ";
}
int sum(int n,int ans){
    if(n==0)return 1;
    ans+=sum(n-1,0);
    
    return ans;
}
int main(){
    int n=5;
    cout<<sum(3,0);
}