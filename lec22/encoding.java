import java.io.*;
import java.util.*;

public class Solution {
    public static void code(String ques,String ans,char[] arr){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        int c=ques.charAt(0)-'0';
        char ch=arr[c];
        int c2=0;
        String ch2="";
        if(ques.length()>=2){
            c2=Integer.parseInt(ques.substring(0,2));
            if(c2<=26)ch2=ch2+arr[c2];
        }
        code(ques.substring(1),ans+ch,arr);
        if(ques.length()>=2&&c2<=26){
            code(ques.substring(2),ans+ch2,arr);
        }
    }
    public static void main(String[] args) {
        
        char[] arr=     
        {'0','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        code("1123","",arr);
    }
}