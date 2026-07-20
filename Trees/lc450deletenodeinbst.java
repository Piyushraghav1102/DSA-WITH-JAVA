public class lc450deletenodeinbst {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    private static Node findMin(Node root) {

        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static Node deleteNode(Node root, int key) {

        if (root == null)
            return null;

        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        }

        else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        }

        else {

            // Case 1: No child
            if (root.left == null && root.right == null) {
                return null;
            }

            // Case 2: One child
            else if (root.left == null) {
                return root.right;
            }

            else if (root.right == null) {
                return root.left;
            }

            // Case 3: Two children
            else {
                Node temp = findMin(root.right);
                root.val = temp.val;
                root.right = deleteNode(root.right, temp.val);
            }
        }

        return root;

    }

    static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(5);
        Node c = new Node(13);

        a.left = b;
        a.right = c;

        Node d = new Node(3);
        Node e = new Node(6);

        b.left = d;
        b.right = e;

        Node f = new Node(11);
        Node g = new Node(2);
        c.left=f;
        d.left=g;
        Node h = new Node(4);
        d.right=h;
        Node i = new Node(14);
        f.right=i;

        deleteNode(a,3);

    }

}
