 import java.util.*;
 public class dp{
     public static int coin(int[] arr,int target){
         int[] dp=new int[target+1];
         dp[0]=1;
         
         for(int i=1;i<=target;i++){//constant loop
                                    //repitition 1d array
             
             for(int j=0;j<arr.length;j++){
                 if(i-arr[j]>=0){
                    dp[i]+=dp[i-arr[j]];
                 }
                 
             }
             
             
         }
         return dp[target];
     }
    public static int thief(int[] cost,int[] wt,int cap){
        int[][] dp=new int[cost.length+1][cap+1];
        for(int i=1;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=dp[i-1][j];
                if(j-wt[i-1]>=0 && dp[i][j]<(cost[i-1]+dp[i-1][j-wt[i-1]])){
                    dp[i][j]=cost[i-1]+dp[i-1][j-wt[i-1]];
                }
            }
        }
        return dp[cost.length][cap];
    }
 
 public static void main(String[] args){
    int[] wt={3,4,1,2,5};
    int[] cost={45,20,15,25,30};
    System.out.print(thief(cost,wt,7)); 
}
 }