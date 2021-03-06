import java.util.*;
public class dp2{
    public static int egg_drop(int egg,int floor){
        int [][] dp=new int[egg+1][floor+1];
        for(int e=0;e<=egg;e++){
            for(int f=0;f<=floor;f++){
                if(e==0)dp[e][f]=0;
                else if(e==1 || f==0 || f==1){
                    dp[e][f]=f;
                }
                else{
                    int bestOfWorst=Integer.MAX_VALUE;
                    for(int i=1;i<=f;i++){
                        int case1=dp[e][f-i];
                        int case2=dp[e-1][i-1];
                        int worst=Math.max(case1,case2);
                        bestOfWorst=Math.min(bestOfWorst,worst);
                    }
                    dp[e][f]=bestOfWorst+1;
                }
            }
        }
    }
}