import java.util.*;
public class stack {
    protected int[] arr;
    protected int size=0;
    protected int tos=-1;
    public stack(){
        reassign(10);
    }
    public stack(int size){
        reassign(size);
    }
    protected void reassign(int size){
        arr=new int[size];
        tos=-1;
        size=0;
    }
    public int peek(){
        if(this.size==0) throw new EmptyStackException();
        return this.arr[this.tos];
    }
    public void push(int d){
        if(this.tos==this.size)throw new ArrayIndexOutOfBoundsException();
        this.tos++;
        this.size++;
        this.arr[this.tos]=d;
    }
    public int pop(){
        if(this.size==0) throw new EmptyStackException();
        int rv=this.arr[this.tos];
        arr[this.tos]=0;
        this.tos--;
        this.size--;
        return rv;
    }
    public boolean isEmpty(){
        return this.size==0;
    }
    public int size(){
        return this.size;
    }
    public void display(){
        while(!this.isEmpty()){
            System.out.println(this.pop());
        }
    }
}