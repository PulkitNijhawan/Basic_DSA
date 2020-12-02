import java.util.*;

// import jdk.internal.org.jline.utils.Display;

public class dijkstra {

	static class edge {
		int v1;
		int v2;
		int wt;

		edge(int a, int b, int wt) {
			this.v1 = a;
			this.v2 = b;
			this.wt = wt;
		}
	}

	static void addEdge(ArrayList<ArrayList<edge>> graph, int a, int b, int wt) {
		graph.get(a).add(new edge(a, b, wt));
		graph.get(b).add(new edge(b, a, wt));
	}
    static class helper implements Comparable<helper>{
        int u;int v;int wt;int wsf;
        helper(int u,int v,int wt,int wsf){
            this.u=u;this.v=v;this.wt=wt;this.wsf=wsf;
		}
		public int compareTo(helper other){
			return this.wsf-other.wsf; //min pq && wt for prim's
		}
    }
	static void Dijkstra(ArrayList<ArrayList<edge>> graph, int src) {
        PriorityQueue<helper> pq=new PriorityQueue<helper>();
        ArrayList<ArrayList<edge>> myGraph=new ArrayList<>();
        for(int i=0;i<graph.size();i++)myGraph.add(new ArrayList<edge>());
        helper root= new helper(src,-1,0,0);
        pq.add(root);
        boolean[] visited=new boolean[graph.size()];
        while(!pq.isEmpty()){
            helper cp=pq.remove();
            // if(visited[cp.u])continue; // cycle will come extra if not continue
			visited[cp.u]=true;
			
            if(cp.v!=-1){
                addEdge(myGraph, cp.u, cp.v, cp.wsf); // cp.wt for prim's
            }
            for(int i=0;i<graph.get(cp.u).size();i++){
                edge ce=graph.get(cp.u).get(i);
                if(!visited[ce.v2]){
                    helper nbr=new helper(ce.v2,ce.v1,ce.wt,cp.wsf+ce.wt);
                    pq.add(nbr);
                }
            }
        }
        display(myGraph);
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
	public static void main(String[] args) {
		ArrayList<ArrayList<edge>> graph = new ArrayList<>();
		for (int i = 0; i < 7; i++) {
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

		// Scanner scn = new Scanner(System.in);
		
		Dijkstra(graph, 0);
	}	
}