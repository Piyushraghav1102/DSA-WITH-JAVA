public class Lc1008BS_with_preorder {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }
    public static Node bstFromPreorder(int[] preorder) {
        if(preorder.length==0)return null;

        int[] i={0};
        return helper(preorder,i,0);
    }

    private static Node helper(int[] preorder, int i[], int bound) {

        if(i[0] >= preorder.length || preorder[i[0]] > bound)
            return null;

        Node root = new Node(preorder[i[0]]);
        i[0]++;
        root.left = helper(preorder, i, root.val);
        root.right = helper(preorder, i, bound);

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

    }
}
