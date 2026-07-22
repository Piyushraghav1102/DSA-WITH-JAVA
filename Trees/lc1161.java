import java.util.LinkedList;
import java.util.Queue;

public class lc1161 {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }
    public int maxLevelSum(Node root) {
        int[] max={Integer.MIN_VALUE,0};
        int level=0;

        Queue<Node> q=new LinkedList<>();

        if(root == null)
            return max[1];


        q.add(root);

        while(!q.isEmpty()){
            int n=q.size();
            int currmax=0;

            level++;
            for (int i = 0; i < n; i++) {
                Node curr=q.poll();

                currmax+=curr.val;

                if(curr.left!=null)q.add(curr.left);
                if(curr.right!=null)q.add(curr.right);
            }
            if(max[0]<currmax){
                max[0]=currmax;
                max[1]=level;
            }

        }
        return max[1];
    }

    static void main(String[] args) {

    }
}
