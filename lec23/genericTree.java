import java.util.*;
class generic{
    static node root=null;
    private static class node{
        int data;
        ArrayList<node> child;
        node(int d){
            this.data=d;
            this.child=new ArrayList<>();
        }
        
        
    }
    public static void display(node rt){
        if(rt==null)return;
        System.out.print(rt.data + "->");
        for(int i=0;i<rt.child.size();i++){
            System.out.print(rt.child.get(i).data+" ");
            
            
        }
        System.out.println(".");
        for(int i=0;i<rt.child.size();i++){
            display(rt.child.get(i));
        }
        
        
    }
    public static void construct(int[] input){
        ArrayList<node> stack=new ArrayList<>();
        for(int i=0;i<input.length;i++){
            if(input[i]==-1){
                stack.remove(stack.size()-1);
            }
            else{
                if(root==null){
                    node n=new node(input[i]);
                    root=n;
                    stack.add(n);
                }
                else{
                    node n=new node(input[i]);
                    node cp=stack.get(stack.size()-1);
                    cp.child.add(n);
                    stack.add(n);
                }
            }
        }
    }
    public static int size(node rt){
        int count=0;
        for(int i=0;i<rt.child.size();i++){
            count+=size(rt.child.get(i));
        }
        return count+1;
    }
    public static int max(node rt){
        int myMax=rt.data;
        for(int i=0;i<rt.child.size();i++){
            int recAns=max(rt.child.get(i));
            myMax=Math.max(recAns, myMax);
        }
        return myMax;
    }
    public static ArrayList<Integer> search(node rt,int key){
        
        
        if(rt.data==key){
            ArrayList<Integer> base=new ArrayList<>();
            base.add(key);
            return base;
        }
        ArrayList<Integer> recAns=new ArrayList<>();
        for(int i=0;i<rt.child.size();i++){
            recAns=search(rt.child.get(i),key);
            if(recAns.size()!=0)break;
        }
        if(recAns.size()!=0){
            recAns.add(rt.data);
            
        }
        return recAns;
    }

    public static void main(String[] args){
        int input[]={1,2,5,-1,6,-1,-1,3,-1,4};
        construct(input);
        // display(root);
        System.out.print(search(root,3));
    }
}
