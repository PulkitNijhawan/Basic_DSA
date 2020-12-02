import java.util.*;
public class make {
    public static void main(String[] args){
        String str="jfuirgfj";
        int[] one={2,2,2,4,5};
        int[] two={1,2,3,4};
        // freqIdx(str);
        interSimple(one, two);
    }
    public static void freq(String str){
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        System.out.print(map);
    }
    public static void freqIdx(String str){
        HashMap<Character,ArrayList<Integer>> map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            ArrayList<Integer> temp=new ArrayList<>();
            if(!map.containsKey(ch)){
                temp.add(i);
                map.put(ch,temp);
            }
            else{
                ArrayList<Integer> myAns=map.get(ch);
                for(int x:myAns){
                    temp.add(x);
                }
                temp.add(i);
                map.put(ch,temp);
            }
        }
        System.out.print(map);
    }
    public static void interSimple(int[] one,int[] two){
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<one.length;i++){
            map.put(one[i], 0);
        }
        for(int j=0;j<two.length;j++){
            if(map.containsKey(two[j])&&map.get(two[j])==0){
                map.put(two[j],1);
                ans.add(two[j]);
            }
        }
        System.out.print(ans);
    }
    public static void interAdvance(int[] one,int[] two){
        
    }
}