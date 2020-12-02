import java.util.*;
public class btree{
    static node root=null;
    static class node{
        int data;
        node right;
        node left;
        node(int d){
            this.data=d;
        }
    }
    public static void construct(int[] arr){
        ArrayList<node> stack=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(root==null){
                node n=new node(arr[i]);
                root=n;
                stack.add(root);
            }
            else{
                if(arr[i]==-1){
                    stack.remove(stack.size()-1);
                }
                else{
                    node cp=stack.get(stack.size()-1);
                    node n=new node(arr[i]);
                    if(cp.left==null){
                        
                        
                        cp.left=n;
                        
                    }
                    else{
                        cp.right=n;
                    }
                    stack.add(n);
                }
            }
        }
    }
    public static void display(node rt){
        if(rt==null)return;
        System.out.print(rt.data+"->");
        if(rt.left!=null)System.out.print(rt.left.data+" ");
        if(rt.right!=null)System.out.print(rt.right.data);
        System.out.println(".");
        if(rt.left!=null)display(rt.left);
        if(rt.right!=null)display(rt.right);
    }
    public static int size(node rt){
        if(rt.right==null)return 1;
        if(rt.left==null)return 1;
        int size=0;
        size+=size(rt.left)+size(rt.right);
        return size+1;
    }
    public static int height(node rt){
        if(rt.right==null)return 1;
        if(rt.left==null)return 1;
        int h=0;
        int l_h=height(rt.left);
        int r_h=height(rt.right);
        h=Math.max(l_h, r_h);
        return h+1;
    }
    public static int max(node rt){
        if(rt.right==null)return rt.data;
        if(rt.left==null)return rt.data;
        int m=rt.data;
        int l_m=max(rt.left);
        int r_m=max(rt.right);
        int child_m=Math.max(l_m, r_m);
        m=Math.max(m, child_m);
        return m;
    }
    public static void pre(node rt){
        ArrayList<node> stack=new ArrayList<>();
        stack.add(rt);
        while(stack.size()!=0){
            node cp=stack.remove(stack.size()-1);;
            System.out.print(cp.data+" ");
            if(cp.right!=null)stack.add(cp.right);
            if(cp.left!=null)stack.add(cp.left);
            
        }
    }
    public static void in(node rt){
        if(rt==null)return;
        if(rt.left!=null)in(rt.left);
        System.out.print(rt.data+" ");
        if(rt.right!=null)in(rt.right);
    }
    public static void post(node rt){
        if(rt==null){
            return;
        }
        if(rt.left!=null)post(rt.left);
        if(rt.right!=null)post(rt.right);
        System.out.print(rt.data+" ");
    }
    public static cons(int[] pre,int[] in){
        node root=new node(pre[0]);
        for(int i=1;i<pre.length;i++){
            
        }
    }
    public static void main(String[] args){
        int[] arr={1,2,4,-1,5,-1,-1,3};
        construct(arr);
        // System.out.print(max(root));
        // display(root);
        post(root);
    }
    
}