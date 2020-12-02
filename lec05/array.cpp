#include <iostream>
#include<vector>
using namespace std;
vector<int> inverse (vector<int>& arr){
    
        vector<int> ans(arr.size(),0);
        for(int i=0;i<arr.size();i++){
            int val=arr[i];
            ans[val]=i;
        }
        return ans;

}
int main(){
    vector<int> arr{3,2,1,4,0};
    vector<int> ans=inverse(arr);
    for(int i=0;i<arr.size();i++){
        cout<<ans[i]<<" ";
    }
}
