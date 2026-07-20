public class Lc235 {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    public Node lowestCommonAncestor(Node root, Node p, Node q) {
        if(root == null) return null;

        if(root == p || root == q) return root;  // add karo

        if(p.val < root.val && q.val > root.val || p.val > root.val && q.val < root.val)
            return root;
        else if(p.val < root.val && q.val < root.val)
            return lowestCommonAncestor(root.left, p, q);
        else
            return lowestCommonAncestor(root.right, p, q);
    }
    static void main(String[] args) {

    }
}
