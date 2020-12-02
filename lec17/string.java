import java.util.*;
public class string{
    public static char max_fre(String s){
        char[] arr=s.toCharArray();;
        Arrays.sort(arr);
        int max=0;int cnt=0;char max_ch=arr[0];
        for(int i=0;i<s.length();i++){
            if(i<(s.length()-1)&&arr[i]==arr[i+1])cnt++;
            else cnt=0;
            if(max<cnt){
                max=cnt;
                max_ch=arr[i];
            }
            
        }
        return max_ch;

    }
    public 
    public static String toggle(String str){
        String ans="";
        for(int i=0;i<str.length();i++){
            int temp=str.charAt(i);
            if(temp<97){
                temp+=32;
                ans+=(char)temp;
            }
            else{
                temp-=32;
                ans+=(char)temp;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        System.out.print(max_fre("abaaac"));
        
    }
}