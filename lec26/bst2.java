import java.util.*;

public class bst2{
    static class node{
        int data;
        node left;
        node right;
        node(int d){
            this.data=d;
            this.left=null;
            this.right=null;
        }
    }
    static node root=null;
    public static node construct(int[] arr,int l,int h){
        if(l>h){
            return null;
        }
        else if(l==h){
            return new node(arr[h]);
        }
        int mid=(l+h)/2;
        node n=new node(arr[mid]);
        if(root==null){
            root=n;
        }
        n.left=construct(arr,l,mid-1);
        n.right=construct(arr, mid+1, h);
        return n;
    }
    public static int height(node root){
        if(root.left==null||root.right==null)return 0;
        int h=0;
        int l_h=height(root.left);
        int r_h=height(root.right);
        h=Math.max(l_h, r_h);
        return h+1;
    }
    public static int size(node root){
        if(root.left==null||root.right==null)return 0;
        int s=0;
        int l_s=size(root.left);
        int r_s=size(root.right);
        s=l_s+r_s;
        return s+1;
    }
    public static int max(node root){
        int max=root.data;
        node croot=root;
        while(croot.right!=null){
            max=Math.max(max, croot.data);
            croot=croot.right;
        }
        return max;
    }
    // public static node lca(node root,int k1,int k2){
        
    //     node temp=root;
    //     while(temp!=null){
    //         if(temp.data>k1&&temp.data>k2){
    //             temp=temp.left;
    //         }
    //         else if(temp.data<k1&&temp.data<k2){
    //             temp=temp.right;
    //         }
    //         else{
    //             return ca;
    //         }
    //     }
    // }
    public static void add(int d,node root){
        if(root.right==null&&root.data<d){
            node n=new node(d);
            root.right=n;
        }
        if(root.left==null&&root.data>d){
            node s=new node(d);
            root.left=s;
        }
        if(root.data>d){
            if(root.left!=null)add(d,root.left);
        }
        else{
            if(root.right!=null)add(d,root.right);
        }
    }
    public static void display(node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" -> ");
        if(root.left!=null) System.out.print(root.left.data+" ");
        if(root.right!=null) System.out.print(root.right.data+" ");
        System.out.println(".");
        if(root.left!=null) display(root.left);
        if(root.right!=null) display(root.right);
    }
    public static int sum(node root,int l,int h){
        
    }
    public static void main(String[] args){
        int[] arr={10,20,30,40,50,60,70,80,90,10,110};
        root=construct(arr, 0, arr.length-1);
        add(45,root);
        System.out.println(sum(root,30,70));
    }
}