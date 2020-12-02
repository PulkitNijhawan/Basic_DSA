import java.util.*;
public class ques{
    // public  boolean balanced(String s){
    //     Stack<Character> st=new Stack<>();
    //     for(int i=0;i<s.length();i++){
    //         char ch=ques.charAt(i);
    //         if(ch=='{'||ch=='('||ch=='[')st.push(ch);
    //         else if(st.size()==0)return false;
    //         else if(st.peek()=='('&&ch!=')')return false;
    //         else if(st.peek()=='['&&ch!=']')return false;
    //         else if(st.peek()=='{'&&ch!='}')return false;
    //         else st.pop();
    //     }
    //     return st.size()==0?true:false;
    // }
    static class helper{
        int idx;int value;
        helper(int i,int v){
            this.idx=i;this.value=v;
        }
    }
    public static int[] rightGreat(int[] arr){
        Stack<helper> st=new Stack<>();
        int[] temp=new int[arr.length];
        for(int l=0;l<temp.length;l++){
            temp[l]=arr.length;
        }
        helper zero=new helper(0,arr[0]);
        st.push(zero);
        for(int i=1;i<arr.length;i++){
            helper n=new helper(i,arr[i]);
            while(!st.isEmpty()&&arr[i]>st.peek().value){
                helper t=st.pop();
                temp[t.idx]=n.idx;
            }
            st.push(n);
        }
        return temp;
    }
    public static int[] leftGreat(int[] arr){
        Stack<Integer> st=new Stack<>();
        int [] temp=new int[arr.length];
        for(int l=0;l<temp.length;l++){
            temp[l]=arr.length;
        }
        st.push(arr.length-1);
        for(int i=arr.length-2;i>=0;i--){
            while(!st.isEmpty()&&arr[i]>arr[st.peek()]){
                temp[st.peek()]=i;
                st.pop();
            }
            st.push(i);
        }
        return temp;
    }
    public static int[] rightSmall(int[] arr){
        Stack<Integer> st=new Stack<>();
        int [] temp=new int[arr.length];
        for(int l=0;l<temp.length;l++){
            temp[l]=arr.length;
        }
        st.push(0);
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty()&&arr[i]<arr[st.peek()]){
                temp[st.peek()]=i;
                st.pop();
            }
            st.push(i);
        }
        return temp;
    }
    public static void main(String[] args){
        int [] arr={8,6,4,1,-1,3,5,7};
        int[] ans=rightSmall(arr);
        for(int i:ans)System.out.print(i+" ");

    }
}