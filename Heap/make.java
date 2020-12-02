import java.util.*;
public class make {
    public static ArrayList<Integer> arr=new ArrayList<>();
    public static void construct(int[] data){
        for(int ele:data)arr.add(ele);
        for(int i=data.length-1;i>=0;i--){
            downHeapify(i,data.length-1);
        }
    }
    public static void downHeapify(int parIdx,int ei){
        int lc=2*parIdx+1;
        int rc=2*parIdx+2;
        int maxIdx=parIdx;
        if(lc<=ei&&arr.get(lc)>arr.get(maxIdx))maxIdx=lc;
        if(rc<=ei&&arr.get(rc)>arr.get(maxIdx))maxIdx=rc;
        if(maxIdx!=parIdx){
            swap(maxIdx,parIdx);
            downHeapify(maxIdx,ei);
        }
    }
    public static void swap(int a,int b){
        int val1=arr.get(a);int val2=arr.get(b);
        arr.set(a,val2);
        arr.set(b, val1);
    }
    public static int remove(){
        int ans=arr.get(0);
        swap(0,arr.size()-1);
        arr.remove(arr.size()-1);
        downHeapify(0, arr.size()-1);
        
        return ans;
    }
    public static void main(String[] args){
        int[] data={15,16,2,3,4,11};
        construct(data);
        while(arr.size()!=0){
            System.out.print(remove()+" ");
        }
        long startTime = System.nanoTime();

    // code

    long endTime = System.nanoTime();
    System.out.println("Took "+(endTime - startTime) + " ns");
    }
}