import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class bipartite_grpah {
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
    public static void creategraph(int v){

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

    public static boolean checkbiparttite_bfs(ArrayList<Edge>[] graph){
        int color[]=new int[graph.length];

        for (int i = 0; i < color.length; i++) {
            color[i]=-1;
        }

        Queue<Integer> q=new LinkedList<>();

        for (int j= 0; j < graph.length; j++) {
            if(color[j]==-1){
                 q.add(j);
                 color[j]=0;
                    //now bfs for this graph
                while(!q.isEmpty()){
                     int curr=q.poll();
                    for (int i = 0; i <graph[curr].size() ; i++) {
                        Edge e=graph[curr].get(i);

                        if(color[e.dest]==-1){      //when neighbour has -1
                             int neihbcol=color[curr]==0 ? 1 : 0;
                             color[e.dest]=neihbcol;
                             q.add(e.dest);
                        }
//
//                        else if(color[e.dest]!=-1 && color[e.dest] != color[curr])
//                            continue;               //when neighbout has diff color with curr edge

                        else if(color[e.dest]==color[curr])
                                return false;       // when edge has same colour as neighbour


                    }
                }
            }
        }
    return true;
    }

    public static void main(String[] args) {

    }
}
