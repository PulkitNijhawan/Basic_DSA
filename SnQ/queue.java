// import java.util.*;
public class queue {
    protected int[] arr;
    protected int size=0;
    protected int front=0;
    protected int back=0;
    protected boolean isFull=false;
    protected void reassign(int size){
        this.arr=new int[size];
        this.size=0;
        this.front=0;
        this.back=0;
        this.isFull=false;
    }
    public queue(){
        reassign(5);
    } 
    public queue(int size){
        reassign(size);
    }
    public int pop() throws Exception {
        if(this.size==0)throw new Exception("QueueEmpty");
        int rv=this.arr[this.front];
        this.arr[this.front]=0;
        this.front=(this.front+1)%this.arr.length;
        if(this.isFull)this.isFull=false;
        this.size--;
        return rv;
    }
    public int front() throws Exception{
        if(this.size==0)throw new Exception("QueueEmpty");
        return this.arr[this.front];
    }
    public void push(int d)throws Exception{
        if(isFull) throw new Exception("PopSomeElements");
        this.arr[this.back]=d;
        this.back=(this.back+1)%this.arr.length;
        if(this.back==this.front)this.isFull=true;
        this.size++;
    }
    public boolean isEmpty(){
        return this.size==0;
    }
    public int size(){
        return this.size;
    }
    public void display() throws Exception{
        while(!this.isEmpty()){
            System.out.print(this.pop()+" ");
        }
    }
}