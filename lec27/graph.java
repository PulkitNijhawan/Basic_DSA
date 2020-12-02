import java.util.*;
public class graph{
    static class edge{
        int v1;
        int v2;
        int wt;
        edge(int v1,int v2,int wt){
            this.v1=v1;this.v2=v2;this.wt=wt;
        }
    }
    public static void addEdge(ArrayList<ArrayList<edge>> graph,int v1,int v2,int wt){
        edge e1=new edge(v1, v2, wt);
        edge e2=new edge(v2,v1,wt);
        graph.get(v1).add(e1);
        graph.get(v2).add(e2);
    }
    public static void display(ArrayList<ArrayList<edge>> graph){
        for(int i=0;i<graph.size();i++){
            System.out.print(i+"->");
            for(int j=0;j<graph.get(i).size();j++){
                System.out.print("("+graph.get(i).get(j).v2+","+graph.get(i).get(j).wt+") ");
            }
            System.out.println(".");
        }
    }
    public static void path(int s,int d,ArrayList<ArrayList<edge>> graph,String ans,boolean[] visited){
        if(s==d){
            System.out.println(ans);
            return;
        }
        visited[s]=true;
        for(int i=0;i<graph.get(s).size();i++){
            edge ce=graph.get(s).get(i);
            if(!visited[ce.v2])path(ce.v2,d,graph,ans+ce.v2,visited);;
            
        }
        visited[s]=false;
    }
    public static int spath(ArrayList<ArrayList<edge>> graph,int s,int d,boolean[] visited){
        if(s==d){
            return 0;
        }
        int myAns=Integer.MIN_VALUE;
        visited[s]=true;
        for(int i=0;i<graph.get(s).size();i++){
            edge ce=graph.get(s).get(i);
            int recAns=0;
            if(!visited[ce.v2])recAns=spath(graph,ce.v2,d,visited);;
            myAns=Math.max(recAns+ce.wt,myAns);
            
        }
        visited[ce.v2]=false;
        return myAns;
    }
    public static void spath2(ArrayList<ArrayList<edge>> graph,int s,int d,boolean[] visited,String ans){
        
    }
    public static void main(String[] args){
        ArrayList<ArrayList<edge>> graph=new ArrayList<>();
        for(int i=0;i<=7;i++){
            graph.add(new ArrayList<edge>());
        }
        addEdge(graph, 0, 3, 40);
		addEdge(graph, 1, 0, 10);
		addEdge(graph, 2, 1, 10);
		addEdge(graph, 3, 2, 10);
		addEdge(graph, 4, 3, 2);
		addEdge(graph, 5, 4, 3);
		addEdge(graph, 6, 5, 3);
		addEdge(graph, 6, 4, 8);
        // addEdge(graph, 1, 4, 10);
        boolean[] visited=new boolean[graph.size()];
        // path(1,7,graph,"1",visited);
        // spath2(graph,1,7,visited,"1");
        System.out.print(spath(graph,0,6,visited));
    }
}