import java.util.*;
public class nokia_keypad{
    public static ArrayList<String> keypad(String[] codes,String ques){
        if(ques.length()==0){
            ArrayList<String> baseRes=new ArrayList<>();
            baseRes.add("");
            return baseRes;
        }
        char ch=ques.charAt(0);
        String roq=ques.substring(1);
        int idx=ch-'0';
        String code=codes[idx];
        ArrayList<String> myAns=new ArrayList<>();
        ArrayList<String> recAns=keypad(codes,roq);
        for(int i=0;i<code.length();i++){
            for(String str:recAns){
                myAns.add(code.charAt(i)+str);
            }
        }
        return myAns;
    }
    public static void main(String[] args){
        
    }
}