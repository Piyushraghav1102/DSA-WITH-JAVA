import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Lc515 {
    public static class Node {
    int val;
    Node left;
    Node right;

    public Node(int val) {
        this.val = val;
    }
    }
    public List<Integer> largestValues(Node root) {
        List<Integer> res = new LinkedList<>();

        Queue<Node> q=new LinkedList<>();

        if(root == null)
            return res;

        q.add(root);

        while(!q.isEmpty()){
            int[] max={Integer.MIN_VALUE};
            int n=q.size();

            for (int i = 0; i < n; i++) {
                Node curr=q.poll();

                if(curr.left!=null)q.add(curr.left);
                if(curr.right!=null)q.add(curr.right);

                max[0]=Math.max(max[0],curr.val);
            }
            res.add(max[0]);
        }
        return res;
    }
}
