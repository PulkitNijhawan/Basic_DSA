import java.util.*;
public class ques {
    public static int k_larg(int[] arr,int k){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int ele:arr){
            pq.add(ele);
            if(pq.size()>k){
                pq.remove();
            }
            
        }
        return pq.peek();
    }
    public static pair k_small(int[] arr,int k){
        PriorityQueue<pair> pq=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            pq.add(new pair(arr[i],i));
            if(pq.size()>k){
                pq.remove();
            }
        }
        return pq.peek();
    }
    public static class pair implements Comparable<pair>{
        int val=0;
        int idx=0;
        pair(int v,int i){
            this.val=v;this.idx=i;
        }
        @Override
        public int compareTo(pair o){
            return o.val-this.val; //min pq
            // return o.val-this.val; max pq
        }
    }
    
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8};
        System.out.println(k_larg(arr, 2));
        System.out.print(k_small(arr, 1).idx);
    }
}