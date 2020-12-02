#include <iostream>
#include<vector>
using namespace std;
void  kendals(vector<int>& arr){
    int sum=0;int Max=arr[0];int gs=0;int ge=0;int cs=0;int ce=0;
    while(ce<arr.size()){
        if(sum>0)sum+=arr[ce];
        else {
            cs=ce;
            sum=arr[cs];
        }
        if(Max<sum){
            Max=sum;
            gs=cs;
            ge=ce;
        }
        ce++;
    }
    cout<<Max<<endl;
        for(int i=gs;i<=ge;i++)cout<<arr[i]<<" ";
}
int main(){
    vector<int> arr{5,-3,2,-8,1,4,7,-1,6,-8};
    kendals(arr);

}
