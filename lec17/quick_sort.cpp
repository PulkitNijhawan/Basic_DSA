#include<iostream>
#include<vector>
using namespace std;
int srt(vector<int>& arr,int h,int l){
    int i=l;
    int j=l;
    int pvt=arr[h];
    for(;i<=h;i++){
        if(arr[i]<=pvt){
            swap(arr[i],arr[j]);
            j++;
        }
    }
    
    return j-1;
}
void quick_sort(vector<int>& arr,int h,int l){
    if(l>=h)return;
    int pvtidx=srt(arr,h,l);
    quick_sort(arr,pvtidx-1,l);
    quick_sort(arr,h,pvtidx+1);
}
void three_sort(vector<int>& arr){
    int one=0;int two=0;
    for(int i=0;i<arr.size();i++){
        if(arr[i]==0){
            
            
        }
        }
    }
}
int main(){
    vector<int> arr{0,2,0,2,1,0,2,1,1,0,2};
    // quick_sort(arr,8,0);
    three_sort(arr);
    for(int i=0;i<arr.size();i++){
        cout<<arr[i]<<" ";
    }
}