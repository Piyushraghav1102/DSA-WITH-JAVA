import java.util.ArrayList;

public class Check_cycle {
    public static class Edge{
        int src;
        int dest;


        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }
    public static void creategraph(int v){
        ArrayList<Edge>[] graph=new ArrayList[v];

        for (int i = 0; i <graph.length ; i++) {
            graph[i]=new ArrayList<>();
        }

        //for the 0 vertex
        graph[0].add(new Edge(0,1));

        //for the 0 vertex
        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));
        graph[1].add(new Edge(1,3));

        //for the 0 vertex
        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,3));

        //for the 0 vertex
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,2));
        graph[3].add(new Edge(3,1));

        //for the 0 vertex
        graph[4].add(new Edge(4,3));


        System.out.println(detectcycle(graph));

    }

    public static boolean detectcycle(ArrayList<Edge>[] graph){
        boolean vis[]=new boolean[graph.length];

        for (int i = 0; i <graph.length ; i++) {
            if(!vis[i])
                if(detectutiltraversal(graph,vis,i,-1))return true;
        }
        return false;
    }

    private static boolean detectutiltraversal(ArrayList<Edge>[] graph, boolean[] vis, int curr, int par) {

        vis[curr]=true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e=graph[curr].get(i);

            if(!vis[e.dest]){
                if(detectutiltraversal(graph,vis,e.dest,curr))return true;
            }

            else if(vis[e.dest] && e.dest!= par)return true;    //always cycle exist

        }
            return false;
    }

    public static void main(String[] args) {

        creategraph(5);

    }
}
