import java.util.*;
public class maze_4{
    public static int count(int[][] arr,int i ,int j,int r,int c){
        if(i==r&&j==c)return 1;
        int cnt=0;
        if(j+1<=c&&arr[i][j+1]!=1){
            arr[i][j]=1;
            int hr=count(arr,i,j+1,r,c);
            arr[i][j]=0;
            cnt+=hr;
        }
        if(i+1<=r&&arr[i+1][j]!=1){
            arr[i][j]=1;
            int vd=count(arr,i+1,j,r,c);
            arr[i][j]=0;
            cnt+=vd;
        }
        if(i-1>=0&&arr[i-1][j]!=1){
            arr[i][j]=1;
            int vu=count(arr,i-1,j,r,c);
            arr[i][j]=0;
            cnt+=vu;
        }
        if(j-1>=0&&arr[i][j-1]!=1){
            arr[i][j]=1;
            int hl=count(arr,i,j-1,r,c);
            arr[i][j]=0;
            cnt+=hl;
        }
        return cnt;

    }
    public static void main(String[] args){
        int [][] arr={{0,0,0,0,0},
                      {0,0,1,0,1},
                      {0,0,0,0,0},
                      {0,0,0,1,0}};
        System.out.print(count(arr,0,0,3,4));
    }
}