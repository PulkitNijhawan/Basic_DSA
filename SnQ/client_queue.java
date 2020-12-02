
public class client_queue {
    public static void main(String[] args) throws Exception {
        queue q=new queue();
        q.push(10);
        q.push(20);
        q.push(30);
        q.push(40);
        q.push(50);
        q.pop();
        q.push(60);
        q.display();
    }
}