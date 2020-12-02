import java.util.*;
public class dp{
    public static int matrix(int[] arr){
        int [][] dp=new int[arr.length-1][arr.length-1];
        for(int gap=0;gap<dp[0].length;gap++){
            for(int i=0,j=i+gap;j<dp[0].length;j++,i++){
                if(gap==0){
                    dp[i][j]=0;
                }
                else if(gap==1){
                    dp[i][j]=arr[i] * arr[j+1] *arr[j];
                }
                else{
                    dp[i][j]=Integer.MAX_VALUE;
                    for(int k=0;k<gap;k++){ 
                        int lp=dp[i][i+k];
                        int rp=dp[i+1+k][j];
                        int multi=arr[i]*arr[j+1]*arr[i+1+k];
                        dp[i][j]=Math.min(dp[i][j],lp+rp+multi);
                    }
                }
            }
        }
        return dp[0][dp[0].length-1];

    }
    public static void main(String[] args){
        int[] arr={10,20,30,40,50,60};
        System.out.println(matrix(arr));
    }
}