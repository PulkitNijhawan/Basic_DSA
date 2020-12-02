#include<iostream>
using namespace std;
void selection_sort(int arr[],int n){
    for(int i=0;i<n-1;i++){
        int min_idx=i;
        for(int j=i;j<n;j++){
            if(arr[j]<arr[min_idx])min_idx=j;
        }
        swap(arr[i],arr[min_idx]);
    }
    
}
void bubble_sort(int arr[],int n){
    for(int i=0;i<n-1;i++){
        for(int j=0;j<n-i-1;j++){
            if(arr[j]>arr[j+1])swap(arr[j],arr[j+1]);
        }
    }
}
void insertion_sort(int arr[],int n){
    for(int i=0;i<n;i++){
        if(arr[i+1]<arr[i]){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1])swap(arr[j],arr[j-1]);
            }
        }
    }
}
void bubble(int arr[],int i,int j,int n){
    if(i==j+1){
        
        if(i==1)return;
        bubble(arr,i-1,0,n);
        return;
        
    }
    if(arr[j]>arr[j+1])swap(arr[j+1],arr[j]);
    bubble(arr,i,j+1,n);
}
int main(){
    int arr[5]={ 12, 11, 13, 5, 6 };
    selection_sort(arr,5);
    
    
    for(int i=0;i<5;i++){
        cout<<arr[i]<<" ";
    }
}