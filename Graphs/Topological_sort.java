import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Topological_sort {
    public static class Edge {
        int src;
        int dest;


        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void dfsfortoposort(ArrayList<Edge>[] graph, int curr, boolean[] vis, Stack<Integer> st) {
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            if (vis[e.dest] == false)
                dfsfortoposort(graph, e.dest, vis, st);

        }
        st.push(curr);
    }

    public static void toposortwith_kahn_s_algo_BFS(int v,ArrayList<Edge>[] graph ){
        ArrayList<Integer> res=new ArrayList<>();

        int[] indeg = new int[graph.length];

        for(int i = 0; i < graph.length; i++) {
            for(Edge e : graph[i]) {
                indeg[e.dest]++;
            }
        }

        Queue<Integer> q=new LinkedList<>();
        for (int i = 0; i < graph.length ; i++) {
            if(indeg[i]==0) {
                q.add(i);
            }
        }

        while(q.size()>0){
            int curr=q.poll();
            res.addLast(curr);

            for(Edge e : graph[curr]) {
                indeg[e.dest]--;
                if(indeg[e.dest] == 0) q.add(e.dest);
            }
        }

        for(int i : res) {
            System.out.print(i+" ");
        }
    }


    public static void creategraph(int v) {
        ArrayList<Edge>[] graph = new ArrayList[v];

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }


        //for the 2 vertex
        graph[2].add(new Edge(2, 3));

        //for the 3 vertex
        graph[3].add(new Edge(3, 1));

        //for the 4 vertex
        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));


        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));


        Stack<Integer> st = new Stack<>();
        boolean[] vis = new boolean[graph.length];

        for (int i = 0; i < vis.length; i++) {
            vis[i]=false;
        }

        for (int i = 0; i < graph.length; i++) {

            if (vis[i] == false) {
                dfsfortoposort(graph, i,vis, st);
            }
        }

        while(!st.isEmpty()){
            System.out.print(st.pop()+" ");
        }

        System.out.println();
        toposortwith_kahn_s_algo_BFS(graph.length,graph);

    }


    public static void main(String[] args) {
        creategraph(6);
    }
}
