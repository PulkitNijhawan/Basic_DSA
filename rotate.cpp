#include<iostream>
using namespace std;
int power(int a,int b) 
{ 
    int result=1;
    for(int i=0;i<b;i++){
        result*=a;
    }
    return result;
} 
int main(){
    int n;cin>>n;
    int k;cin>>k;
    int cnt=0;
        for(int i=1;n/i!=0;i=i*10){
            cnt++;
        }
        k=k%cnt;
    if(k>0){
        
        k=k%cnt;
        int slice=n%power(10,k);
        
        cout<<n/power(10,k) + slice*power(10,cnt-k);
    }
    else if(k==0)cout<<n;
    else{
        k=k%cnt;     
        int slice=n/power(10,cnt+k);
        cout<<(n%power(10,cnt+k)) *power(10,-k)  + slice;
        
    }
}