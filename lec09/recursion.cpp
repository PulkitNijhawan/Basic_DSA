#include<iostream>
#include<vector>
using namespace std;
void print_dec(int arr[],int n){
    if(n==0)return;
    cout<<arr[0]<<" ";
    print_dec(arr+1,n-1);
}
void print_inc(int arr[],int n){
    if(n==0)return;
    cout<<arr[n-1]<<" ";
    print_inc(arr,n-1);
}
int max_idx(int arr[],int n,int cnt,int i){
    if(n==0){return i;}
    
    if(arr[0]>arr[1]){
        max_idx(arr+1,n-1,cnt+1,cnt);
    }
    else max_idx(arr+1,n-1,cnt+1,i);
    
}
int min_idx(int arr[],int n,int cnt,int i,int Min){
    if(n==0){return i;}
    
    if(arr[0]<Min){
        min_idx(arr+1,n-1,cnt+1,cnt,arr[0]);
    }
    else min_idx(arr+1,n-1,cnt+1,i,Min);
}
void selection_sort(int arr[],int n){
    if(n==0)return;
    int Min_idx=0;
    for(int i=0;i<n;i++){
        if(arr[i]<arr[Min_idx])Min_idx=i;
    }
    swap(arr[0],arr[Min_idx]);
    selection_sort(arr+1,n-1);
}

int main(){
    int arr[8]={3,2,1,5,6,7,8,4};
    // cout<<min_idx(arr,8,0,0,arr[0]);
    selection_sort(arr,8);
    for(int i=0;i<8;i++)cout<<arr[i]<<" ";
}