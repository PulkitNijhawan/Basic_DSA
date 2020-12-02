#include<iostream>
#include<vector>
using namespace std;
void print_inc(int n){
    if(n==1){
        cout<<n<<" ";
        return;
    }
    
    print_inc(n-1);
    cout<<n<<" ";
}
int factorial(int n){
    if(n==0)return 1;
    int recAns=factorial(n-1);
    return n*recAns;
}
void print_arr(vector<int>& arr,int idx){
    if(idx==arr.size()){
        return;
    }
    cout<<arr[idx]<<" ";
    print_arr(arr,idx+1);
}
int findMax(vector<int>& arr,int idx){
    if(idx==arr.size()-1){
        int baseRes=arr[idx];
        return baseRes;
    }
    int recAns=findMax(arr,idx+1);
    if(arr[idx]>recAns){
        recAns=arr[idx];
    }
    return recAns;
}
vector<int> all_occ(vector<int>& arr,int idx,int cnt,int key){
    if(idx==arr.size()-1){
        vector<int> baseRes(cnt,0);
        return baseRes;
    }
    vector<int> recAns;
    if(arr[idx]==key){
        recAns=all_occ(arr,idx+1,cnt+1,key);
    }
    else recAns=all_occ(arr,idx+1,cnt,key);
    if(arr[idx]==key){
        recAns[cnt-1]=idx;
    }
    return recAns;
}
vector<string> subseq(string ques){
    if(ques.length()==0){
        vector<string> baseres;
        baseres.push_back("");
        return baseres;
    }
    string roq=ques.substr(1);
    char ch=ques[0];
    vector<string> myans;
    vector<string> recans=subseq(roq);
    for(int i=0;i<recans.size();i++){
        myans.push_back(ch+recans[i]);
    }
    for(int i=0;i<recans.size();i++){
        myans.push_back(recans[i]);
    }
    return myans;
}
vector<string> stair(int n){
    if(n==0){
        vector<string> baseRes;
        baseRes.push_back("");
        return baseRes;
    }
    vector<string> recAns;
    vector<string> myAns;
    if(n-1>=0){
        recAns=stair(n-1);
        for(int i=0;i<recAns.size();i++){
            myAns.push_back("recAns"+"1");
        }
    }
    if(n-2>=0){
        recAns=stair(n-2);
        for(int i=0;i<recAns.size();i++){
            myAns.push_back("recAns"+"2");
        }
    }
    if(n-3>=0){
        recAns=stair(n-3);
        for(int i=0;i<recAns.size();i++){
            myAns.push_back("recAns"+"3");
        }
    }
    return myAns;
}
int main(){
    // int n;cin>>n;
    vector<string> temp=stair(7);
    for(int i=0;i<temp.size();i++){
        cout<<temp[i]<<" ";
    }
    
    
}