import java.util.LinkedList;
import java.util.Queue;

public class seralize_deseralize {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    public static String serialize(Node root){
        if(root==null)return " ";

        Queue<Node> q=new LinkedList<>();
        StringBuilder sb=new StringBuilder();

        q.add(root);
        while(!q.isEmpty()){
            Node curr=q.poll();
            if(curr==null){
                sb.append("null ");

            }else {
                sb.append(curr.val + " ");
                 q.add(curr.left);
                q.add(curr.right);
            }
        }
        return sb.toString();
    }

    public static Node deserialize(String data) {
        if(data==null || data.isEmpty())return null;

        Queue<Node> q=new LinkedList<>();

        String[] vals = data.split(" ");

        Node root = new Node(Integer.parseInt(vals[0]));
        q.add(root);

        int i=1;
        while(!q.isEmpty() && i<vals.length){
            Node curr=q.poll();

            //for left child
            if(i<data.length() && !vals[i].equals("null")){
                Node left = new Node(Integer.parseInt(vals[i]));
                curr.left=left;
                q.offer(left);
            }
            i++;

            //for right child
            if(i<data.length() && !vals[i].equals("null")){
                Node right = new Node(Integer.parseInt(vals[i]));
                curr.right=right;
                q.offer(right);
            }
            i++;

        }
        return root;
    }
    static void main(String[] args) {

    }
}
