import java.util.*;
public class path_maze{
    public static int maze(int sr,int sc,int er,int ec,String path){
        if(sr==er && sc==ec){
            System.out.println(path+" ");
            return 1;        
        }
        int cnt=0;
        if(sc+1<=ec)
            cnt+=maze(sr, sc+1, er, ec,path+"H");
        
        if(sr+1<=er)
            cnt+=maze(sr+1, sc, er, ec,path+"V");
        
        return cnt;
    }
    public static ArrayList<String> maze2(int sr,int sc,int er,int ec){
        if(sc==ec&&sr==er){
            ArrayList<String> baseRes=new ArrayList<>();
            baseRes.add("");
            return baseRes;
        }
        ArrayList<String> myAns=new ArrayList<9>();
        if(sr+1<=er){
            ArrayList<String> recAns=maze2(sr+1,sc,er,ec);
            
            for(String str:recAns){
                myAns.add("V"+str);
            }
        }
        if(sc+1<=ec){
            ArrayList<String> recAns=maze2(sr,sc+1,er,ec);
            
            for(String str:recAns){
                myAns.add("H"+str);
            }
        }
        return myAns;


    }
    public static ArrayList<String> all_maze(int sr,int sc,int er,int ec){
        for(int i=sr;i<=er;i++){
            
            if(i==sr+1){
                ArrayList<String> recAns=all_maze(sr+1,sc,er,ec);
                for(String str:recAns){
                    myAns.add()
                }
            }
        }
    }
    public static void main(String[] args){
        System.out.print(maze(0,0,2,2,""));
        String[]
        
    }
}