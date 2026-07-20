import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class graph {
    public static class Edge{
            int src;
            int dest;
            int weight;

        public Edge(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }

    public static void BFStraversal(ArrayList<Edge>[] graph){

        Queue<Integer> q=new LinkedList<>();
        boolean arr[]=new boolean[graph.length];

        q.add(0);
        while(!q.isEmpty()){
            int v=q.poll();

            if(arr[v]!=true){
                System.out.println(v+"->");
                arr[v]=true;

                //add neighbours
                for (int i = 0; i < graph[v].size(); i++) {
                        Edge e= graph[v].get(i);
                    if(arr[e.dest]!=true)
                            q.add(e.dest);
                }
            }

        }

    }

    public static void DFStraversal(ArrayList<Edge>[] graph,int curr,boolean vis[]) {

        System.out.print(curr+"->");
        vis[curr]=true;

        for (int i = 0; i <graph[curr].size() ; i++) {
            Edge e=graph[curr].get(i);

            if(!vis[e.dest])
                DFStraversal(graph,e.dest,vis);

        }

    }

    public static boolean haspath(ArrayList<Edge>[] graph,int src,int dest,boolean[] vis){

        if(src==dest)return true;

        vis[src]=true;

        for (int i = 0; i <graph[src].size() ; i++) {
            Edge e=graph[src].get(i);

            if(!vis[e.dest] && haspath(graph,e.dest,dest,vis))return true;
        }
    return false;
    }

    public static void main(String[] args) {


        int v=5;
        ArrayList<Edge>[] graph=new ArrayList[v];

        for (int i = 0; i <graph.length ; i++) {
            graph[i]=new ArrayList<>();
        }

        //for the 0 vertex
        graph[0].add(new Edge(0,1,5));

        //for the 0 vertex
        graph[1].add(new Edge(1,0,5));
        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,3));

        //for the 0 vertex
        graph[2].add(new Edge(2,1,1));
        graph[2].add(new Edge(2,3,1));

        //for the 0 vertex
        graph[3].add(new Edge(3,4,2));
        graph[3].add(new Edge(3,2,1));
        graph[3].add(new Edge(3,1,3));

        //for the 0 vertex
        graph[4].add(new Edge(4,3,2));

        //how to get 2vertex neihbours
//        for (int i = 0; i < graph[2].size(); i++) {
//            Edge e=graph[2].get(i);
//            System.out.println("neihbours :- "+e.dest);
//        }


        BFStraversal(graph);

        boolean[] vis=new boolean[v];
        DFStraversal(graph,0,vis);


    }
}
