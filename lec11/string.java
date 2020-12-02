import java.math.RoundingMode;
import java.util.*;
public class string{
    public static ArrayList<String> subseq(String ques){
        if(ques.length()==0){
            ArrayList<String> baseRes=new ArrayList<String>();
            baseRes.add("");
            return baseRes;
        }
        String roq=ques.substring(1);
        char ch=ques.charAt(0);
        ArrayList<String> recAns=subseq(roq);
        
        ArrayList<String> myAns=new ArrayList<String>();
        for(String str:recAns){
            myAns.add(ch+str);
        }
        for(String str:recAns){
            myAns.add(str);
        }
        return myAns;
    }
    public static ArrayList<Integer> ways(int n){
        if(n==0){
            
        }
    }
    public static void main(String[] args){
        // String ques="abc";
        System.out.println(ways(7));
    }
}