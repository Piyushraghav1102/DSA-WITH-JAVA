public class Lc222 {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    static int leftHeight(Node root) {
        int h = 0;
        while (root != null) {
            h++;
            root = root.left;
        }
        return h;
    }
    static int rightHeight(Node root) {
        int h = 0;
        while (root != null) {
            h++;
            root = root.right;
        }
        return h;
    }

    public static int countNodes(Node root) {
        if(root==null)return 0;


        int lh=leftHeight(root);
        int rh=rightHeight(root);

        if(lh==rh)return (int) Math.pow(2,lh)-1;      //perfect binary tree


        return 1 + countNodes(root.left)+countNodes(root.right);
    }
    static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(1);

        a.left = b;
        a.right = c;

        Node d = new Node(6);
        Node e = new Node(2);
        Node f = new Node(0);
//        Node g = new Node(8);
//        Node h = new Node(7);
//        Node i = new Node(4);

        b.left=d;
        b.right=e;
        c.left=f;

        System.out.println(countNodes(a));

    }
}
