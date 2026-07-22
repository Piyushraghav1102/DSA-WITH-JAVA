import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Lcconnectedcomponents {
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
        boolean arr[]=new boolean[graph.length];

        for (int i = 0; i < graph.length ; i++) {
            if(!arr[i])
                BFSutil(graph,arr);
        }


    }

    public static void BFSutil(ArrayList<Edge>[] graph,boolean[] vis){

        Queue<Integer> q=new LinkedList<>();

        q.add(0);
        while(!q.isEmpty()){
            int v=q.poll();

            if(vis[v]!=true){
                System.out.println(v+"->");
                vis[v]=true;

                //add neighbours
                for (int i = 0; i < graph[v].size(); i++) {
                    Edge e= graph[v].get(i);
                    if(vis[e.dest]!=true)
                        q.add(e.dest);
                }
            }

        }

    }


    public static void DFStraversal(ArrayList<Edge>[] graph,int curr,boolean vis[]) {
        boolean arr[]=new boolean[graph.length];

        int count=0;
        for (int i = 0; i < graph.length ; i++) {
            if(!arr[i]) {
                DFSutil(graph, i, arr);
                count++;
            }
        }

    }
    public static void DFSutil(ArrayList<Edge>[] graph,int curr,boolean vis[]) {

        System.out.print(curr+"->");
        vis[curr]=true;

        for (int i = 0; i <graph[curr].size() ; i++) {
            Edge e=graph[curr].get(i);

            if(!vis[e.dest])
                DFStraversal(graph,e.dest,vis);

        }

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


    }
}
