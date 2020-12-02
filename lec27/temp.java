import java.util.*;
public class temp{
    static class edge{
        int v1;
        int v2;
        edge(int v1,int v2){
            this.v1=v1;this.v2=v2;
        }
    }
    public static void addEdge(ArrayList<ArrayList<edge>> graph,int v1,int v2){
            edge e1=new edge(v1, v2);
            edge e2=new edge(v2,v1);
            graph.get(v2).add(e2);
            graph.get(v1).add(e1);
        
        
    }
    public static void display(ArrayList<ArrayList<edge>> graph){
        for(int i=0;i<graph.size();i++){
            System.out.print(i+"->");
            for(int j=0;j<graph.get(i).size();j++){
                System.out.print("("+graph.get(i).get(j).v2 + ") " );
            }
            System.out.println(".");
        }
    }
    public static boolean haspath(int s,int d,ArrayList<ArrayList<edge>> graph,boolean[] visited,int path){
        if(s==d){
            return true;
        }
        visited[s]=true;
        boolean res=false;
        for(int i=0;i<graph.get(s).size();i++){
            edge ce=graph.get(s).get(i);
            if(path==0){
                if(!visited[ce.v2]&&(s>ce.v2))res=res||haspath(ce.v2,d,graph,visited,path);
            }
            else{
                if(!visited[ce.v2]&&(s<ce.v2))res=res||haspath(ce.v2,d,graph,visited,path);
            }
        }
        visited[s]=false;
        return res;
        
    }
    
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int totalHouses=scn.nextInt();
        ArrayList<ArrayList<edge>> graph=new ArrayList<>();
        for(int i=0;i<=totalHouses;i++){
            graph.add(new ArrayList<edge>());
        }
        for(int i=0;i<=totalHouses;i++){
            int a=scn.nextInt();
            int b=scn.nextInt();
            addEdge(graph,a,b);
        }
        display(graph);
        // int tc=scn.nextInt();
        // while(tc>0){
        //     int path=scn.nextInt();
        //     int x=scn.nextInt();
        //     int y=scn.nextInt();
        //     boolean[] visited=new boolean[graph.size()];
        //     if(haspath(y,x,graph,visited,path))System.out.println("YES");
        //     else System.out.println("NO");
        //     tc--;
        // }
    }
}