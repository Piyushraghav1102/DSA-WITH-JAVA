import java.util.*;

public class Lc2385mintimetoburntree {

    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    public static void makeundirectedwithinorder(Node root, Map<Node, Node> parent,Node[] curr,int start) {
        if (root == null) return;

        if(root.val==start)curr[0]=root;

        if (root.left != null) {
            parent.put(root.left, root);
        }
        makeundirectedwithinorder(root.left, parent,curr,start);

        if (root.right != null) {
            parent.put(root.right, root);
        }
        makeundirectedwithinorder(root.right, parent,curr,start);

    }

    public static int bfstraveresaltofindmintime(Node target, int k, Map<Node, Node> parent) {
        Queue<Node> q = new LinkedList<>();
        q.add(target);

        Set<Integer> set = new HashSet<>();
        set.add(target.val);

        while (!q.isEmpty()) {
            int n = q.size();

            for (int i = 0; i < n; i++) {
                Node curr = q.poll();

                if (curr.left != null && !set.contains(curr.left.val)) {
                    q.add(curr.left);
                    set.add(curr.left.val);

                }

                if (curr.right != null && !set.contains(curr.right.val)) {
                    q.add(curr.right);
                    set.add(curr.right.val);
                }

                if (parent.get(curr) != null && !set.contains(parent.get(curr).val)) {
                    q.add(parent.get(curr));
                    set.add(parent.get(curr).val);
                }


            }
            if(!q.isEmpty()) k++;
        }
        return k;
    }

    public static int amountOfTime(Node root, int start) {
        Map<Node,Node> parent = new HashMap<>();
        Node[] curr = new Node[1];
        makeundirectedwithinorder(root, parent,curr,start);
        List<Integer> res = new LinkedList<>();
       int k= bfstraveresaltofindmintime(curr[0], 0,parent);
        return k;
    }
    static void main() {
        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(1);

        a.left = b;
        a.right = c;

        Node d = new Node(6);
        Node e = new Node(2);
        Node f = new Node(0);
        Node g = new Node(8);
        Node h = new Node(7);
        Node i = new Node(4);


        c.left = f;
        c.right = g;
        b.left = d;
        b.right = e;
        e.left = h;
        e.right = i;

        System.out.println("This is the minimum time to burn tree :-"+amountOfTime(a,c.val));
    }
}
