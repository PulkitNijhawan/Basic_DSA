#include<iostream>
#include<vector>
using namespace std;
int min_path(vector<vector<int>>& arr,int er,int ec){
    vector<vector<int> > dp(er+1,vector<int>(ec+1,0));
    for(int i=er;i>=0;i--){
        for(int j=ec;j>=0;j--){
            if(i==ec&&j==er){
                dp[i][j]=arr[i][j];
            }
            else if(i==er){
                dp[i][j]=dp[i][j+1]+arr[i][j];
            }
            else if(j==ec){
                dp[i][j]=dp[i+1][j]+arr[i][j];
            }
            else{
                if(dp[i+1][j]<dp[i][j+1]){
                    dp[i][j]=dp[i+1][j]+arr[i][j];
                }
                else{
                    dp[i][j]=dp[i][j+1]+arr[i][j];
                }
            }
        }
    }
    return dp[0][0];
}

int gold_mine(vector<vector<int>>& arr,int er,int ec){
    vector<vector<int> > dp(er+1,vector<int>(ec+1));
    for(int i=ec;i>=0;i--){
        for(int j=0;j<=er;j++){
            if(i==ec){
                dp[j][i]=arr[j][i];
                
            }
            else if(j==0){
                if(dp[j][i+1]>dp[j+1][i]) dp[j][i]=dp[j][i+1]+arr[j][i];
                else dp[j][i]=dp[j+1][i+1]+arr[j][i];
               
            }
            else if(j==er){
                if(dp[j][i+1]>dp[j+1][i]) dp[j][i]=dp[j][i+1]+arr[j][i];
                else dp[j][i]=dp[j-1][i+1]+arr[j][i];
            }
            else{
                int Max=dp[j][i+1];
                if(dp[j-1][i+1]>Max)dp[j][i]=dp[j-1][i+1]+arr[j][i];
                else if(dp[j+1][i+1]>Max)dp[j][i]=dp[j+1][i+1]+arr[j][i];
                else dp[j][i]=Max+arr[j][i];
            }
        }
        
    }
    for()
    return 1;
}

int main(){
    vector<vector<int>> arr{{2,0,1,3,1},
                            {1,4,6,2,5},
                            {1,1,2,6,9},
                            {4,5,3,8,2},
                            {3,2,1,1,7},
                            {5,4,9,2,3}};
    cout<<(gold_mine(arr,5,4));
    
}