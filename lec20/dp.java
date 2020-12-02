import java.util.*;
public class dp{
    // public static void min_path(int[][] dp,int i,int j,String path){
    //     if(i==dp.length-1&&j==dp[0].length-1){
    //         System.out.println(path);
    //         return;
    //     }
    //     if(i==dp.length-1){
    //         min_path(dp,i,j+1,path+"h");
    //     }
    //     else if(j==dp[0].length-1){
    //         min_path(dp,i+1,j,path+"v");
    //     }
    //     else{
    //         int min= dp[i][j+1];
    //         if(min>dp[i+1][j]){
    //             min=dp[i+1][j];
    //         }
    //         if(min==dp[i][j+1]){
    //             min_path(dp,i,j+1,path+"h");
    //         }
    //         if(min==dp[i+1][j]){
    //             min_path(dp, i+1, j, path+"v");
    //         }
    //     }
    // }
    public static boolean target_sum(int[] arr,int target){
        boolean[][] dp=new boolean[arr.length+1][target+1];
        dp[0][0]=true;
        for(int i=1;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=dp[i-1][j];
                if(dp[i][j]==false){ 
                    if(j-arr[i-1]>=0&&dp[i-1][j-arr[i-1]]){
                        dp[i][j]=true;
                    }                                                                                                     
                }
            }
        }
        return dp[arr.length][target];
    }
    public static void main(String[] args){
        int[] arr={2,1,9,4,5};
        System.out.println(target_sum(arr,7));
    }

}