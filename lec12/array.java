import java.util.*;

// import sun.security.util.Length;
class array{
    static Scanner scn = new Scanner(System.in);
    static void input(int[] arr){
        for(int i=0; i<arr.length; i++){
            arr[i]=scn.nextInt();
        }
    }
    

    static void display(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(i + " " + arr[i]);
        }
    }

    static int span(int[] arr){
        int mymax=Integer.MIN_VALUE;
        int mymin = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>mymax)
            mymax=arr[i];
            if(arr[i]<mymin)
            mymin= arr[i];
        }
        return(mymax-mymin);
    }

    static void addtwoarray(int[] arr1,int[] arr2){
        int c=0;
        int size=arr1.length;
        if(size<arr2.length)
        size=arr2.length;
        size++;
        System.out.println(size);
        int res[]= new int[size];
        int i=arr1.length-1;
        int j= arr2.length-1;
        int k = res.length-1;
        while(i>=0 && j>=0 && k>=0){
            int num = arr1[i]+arr2[j]+c;
            res[k]=num % 10;
            c = num / 10;
            i--;j--;k--;
        
        }
        while(i>=0){
            int num = arr1[i]+c;
            res[k]=num%10;
            c = num/10;
            i--;
            k--;
        }
        while(j>=0){
            int num = arr2[j]+c;
            res[k]=num%10;
            c = num/10;
            j--;
            k--;
        }
        if(k>=0){
            res[k]=c;
            k--;
        }
        // System.out.println(res[k]+" ");
        for(int x=0; x<res.length; x++){
            if(x==0 &&res[x]==0){
                continue;
            }
            System.out.print(res[x]+" ");
        }
    }
    public static void main(String[] args){
        int size = scn.nextInt();
        int[] arr1 = new int[size];
        input(arr1);
        int n = scn.nextInt();
        int[] arr2 = new int[n];
        input(arr2);
        addtwoarray(arr1,arr2);
        // System.out.println(input(arr));
        // System.out.println(span(arr));
        // display(arr);

    }
} 