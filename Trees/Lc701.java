public class Lc701 {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    public static Node insertIntoBST(Node root, int val) {

        if(root==null)return new Node(val);

        if(val<root.val)
            root.left = insertIntoBST(root.left,val);
        else
            root.right = insertIntoBST(root.right,val);

        return root;
    }
    static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(2);
        Node c = new Node(7);

        a.left = b;
        a.right = c;

        Node d = new Node(1);
        Node e = new Node(3);

        b.left = d;
        b.right = e;

        insertIntoBST(a,5);
    }
}
