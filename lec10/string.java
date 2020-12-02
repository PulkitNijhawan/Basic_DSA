import java.util.*;
public class string{
    public static void main(String[] args){
        ArrayList<Integer> al=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.remove(0);
        al.size();
        for(int i=0;i<al.size();i++){
            System.out.print(al.get(i));
        }
        String s="pulkit";
        for(int i=0;i<s.length();i++){
            System.out.println(s.substring(i,i+1));
        }
        System.out.println(s+0);
        String a=new String("pulkit");
        System.out.print(s==a);
        
    }
}