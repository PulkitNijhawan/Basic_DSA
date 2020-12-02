import java.util.*;
public class dp{
    public static void print(int [][] dp,int is,int js,String ans){
        if(is==dp.length&&js==dp[0].length){
            System.out.println(ans);;
            return;
        }
        
        int max=Math.max(dp[is][js+1],dp[is-1][js+1]);
        max=Math.max(max,dp[is+1][js+1]);
        for(int k=1;k<=3;k++){
            if(dp[is][js+1]==max){
                print(dp,is,js+1,ans+"d1");
            }
            else if(dp[is-1][js]==max){
                print(dp,is-1,js,ans+"d2");
            }
            else{
                print(dp,is+1,js+1,ans+"d3");
            }
        
        }
        
    }
    public static int goldmine(int [][] arr){
        int [][]dp=new int[arr.length][arr[0].length];
        for(int j=arr[0].length-1;j>=0;j--){
            for(int i=arr.length-1;i>=0;i--){
                if(j==arr[0].length-1){
                    dp[i][j]=arr[i][j];
                }
                else if(i==arr.length-1){
                    dp[i][j]=arr[i][j];
                    dp[i][j]+=Math.max(dp[i][j+1],dp[i-1][j+1]);
                }
                else if(i==0){
                    dp[i][j]=arr[i][j];
                    dp[i][j]+=Math.max(dp[i][j+1],dp[i+1][j+1]);
                }
                else{
                    dp[i][j]=arr[i][j];
                    int max=Math.max(dp[i][j+1],dp[i-1][j+1]);
                    max=Math.max(max,dp[i+1][j+1]);
                    dp[i][j]+=max;
                }
            }
        }
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<dp.length;i++){
            if(dp[i][0]>ans){
                ans=dp[i][0];
            }
        }
        for(int i=0;i<dp.length;i++){
            if(dp[i][0]==ans)print(dp,i,0,"");
        }
        return ans;
    }
    public static void main(String[] args){
        int [][] arr={{4,8,2,7,9,4},
                      {3,7,6,4,3,1},
                      {5,1,2,3,5,6},
                      {4,3,6,8,4,2},
                      {1,2,6,4,2,6},
                      {2,8,1,9,3,7},
                    };
        System.out.println(goldmine(arr));
    }
}