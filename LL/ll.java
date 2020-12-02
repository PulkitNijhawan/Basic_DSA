import java.util.*;
public class ll{
    public static class linkedlist{
        public class node{
            int data;
            node next=null;
            node(int d){
                this.data=d;
            }
        }
        node head=null;
        node tail=null;
        int size=0;
        public boolean isEmpty(){
            if(size==0)return true;
            else return false;
        }
        public int size(){
            return size;
        }
        public void display(){
            node temp=head;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
        }
        public void addFirst(int d){
            
            node n=new node(d);
            if(size==0){
                head=n;tail=n;
            }
            else{
                n.next=head;
                head=n;
            }
            size++;
        }
        public void addLast(int d){
            node n=new node(d);
            if(size==0){
                tail=n;
                head=n;
            }
            else{
                tail.next=n;
                tail=n;
            }
            size++;
        }
        public node get(int idx){
            if(size==0)return null;
            if(idx<0||idx>size-1)return null;
            if(idx==0)return head;
            else if(idx==size-1)return tail;
            else{
                node i=head;
                while(idx-- >0){
                    i=i.next;
                }
                return i;
            }
        }
        public int removeLast(){
            if(size==0){
                System.out.print("NullPointerException");
                return -1;
            }
            int rv=tail.data;
            if(size==1){
                head=null;tail=null;
            }
            else{
                node sec_l=get(size-2);
                tail=sec_l;
                tail.next=null;
            }
            size--;
            return rv;
        }
        public int removeFirst(){
            if(size==0){
                System.out.print("NullPointerException");
                return -1;
            }
            int rv=head.data;
            if(size==1){
                head=null;tail=null;
            }
            else{
                node temp=head.next;
                head.next=null;
                head=temp;
            }
            size--;
            return rv;
        }

        public int getFirst(){
            if(size==0){
                System.out.print("NoSuchElementException: ");
                return -1;
            }
            else{
                return head.data;
            }
        }
        public int getLast(){
            if(size==0){
                System.out.print("NoSuchElementException: ");
                return -1;
            }
            else{
                return tail.data;
            }
        }
        public int removeAt(int idx){
            if(idx<0||idx>=size)return -1;
            if(idx==0)removeFirst();
            else if(idx==size)removeLast();
            else{
                // node del=get(idx);
                
                node prev=get(idx-1);
                int ans=prev.next.data;
                node frwd=get(idx+1);
                prev.next.next=null;
                prev.next=frwd;
                size--;
            }
            return ans;
        }
        public void addAt(int idx,int d){
            if(idx<0||idx>size)return;
            if(idx==0)addFirst(d);
            else if(idx==size)addLast(d);
            else{
                node prev=get(idx-1);
                node frwd=get(idx+1);
                node n=new node(d);
                prev.next=n;
                n.next=frwd;
                size++;
            }
        }
        public void revI(){
            int i=0;
            int j=size-1;
            
        }
        
    }
    

    
    public static void main(String[] args){
        linkedlist l=new linkedlist();
        for(int i=1;i<=5;i++){
            l.addLast(i);
        }
        // System.out.print(l.get(4).data);
        // l.removeFirst();
        l.removeAt(3);
        l.display();
    }
}