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
    // public static int canc(node rt,int one,int two){
    //     ArrayList<Integer> one=search(rt,one);
    //     ArrayList<Integer> two=search(rt,two);
    //     int i=one.size()-1;
    //     int j=two.size()-1;
    //     while(i>=0&&j>=0){
    //         if(one.get(i)!=two.get(j))break;
    //         i--;j--;
    //     }
    //     return one.get(i+1);
    // }
    public static void level_order(node rt){
        Queue<node> qu=new LinkedList<>();
        qu.add(rt);
        while(qu.size()>0){
            System.out.print(qu.peek().data);
            for(int i=0;i<qu.peek().child.size();i++){
                qu.add(qu.peek().child.get(i));
            }
            qu.remove();
        }
    }
    public static void zig_zag(node rt){
        Queue<node> queue=new LinkedList<>();
        ArrayList<node> stack=new ArrayList<>();
        queue.add(rt);
        while(queue.size()!=0){
            node cp=queue.remove();
            System.out.print(cp.data+" ");
            if(flag){
                for(int i=0;i<cp.child.size();i++){
                    stack.add(cp.child.get(i));
                }
            }
            else{
                for(int i=cp.child.size()-1;i>=0;i--){
                    stack.add(cp.child.get(i));
                }
            }
            if(queue.size()==0){
                while(stack.size()>0){
                    queue.add(stack.remove(stack.size()-1));
                }
                flag=!flag;
            }
        }
        
    }
    public static void main(String[] args){
        int input[]={1,2,5,-1,6,-1,-1,3,-1,4};
        construct(input);
        // display(root); 
        level_order(root);
    }
}
