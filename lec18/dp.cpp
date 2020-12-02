#include<iostream>
#include<vector>
using namespace std;
int cnt_dp(int sr,int sc,int er,int ec){
    vector<vector<int>> dp(er+1,vector<int> (ec+1,0));
    for(int i=er;i>=0;i--){
        for(int j=ec;j>=0;j--){
            if(i==er&&j==ec){
                dp[i][j]=1;
            }
            else if(i==er){
                dp[i][j]=dp[i][j+1];
            }
            else if(j==ec){
                dp[i][j]=dp[i+1][j];
            }
            else{
                dp[i][j]=dp[i+1][j]+dp[i][j+1];
            }
        }
    }
    return dp[0][0];
}
int stairs(int n){
    vector<int> dp(n+1);
    for(int i=n;i>=0;i--){
        if(i<=n-3){
            dp[i]=dp[i+1]+dp[i+2]+dp[i+3];
            
        }
        else if(i<=n-2){
            dp[i]=dp[i+1]+dp[i+2];
        }
        else if(i==n){
            dp[i]=1;
        }
        else{
            dp[i]=dp[i+1];
        }
    }
    return dp[0];
}
int main(){
    cout<<stairs(7);
}