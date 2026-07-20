import java.util.*;

public class NodesatkdistanceLc863 {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    public static void makeundirectedwithinorder(Node root,Map<Node,Node> parent){
        if(root==null)return;

        if(root.left!=null){
            parent.put(root.left,root);
        }
        makeundirectedwithinorder(root.left,parent);

        if(root.right!=null){
            parent.put(root.right,root);
        }
        makeundirectedwithinorder(root.right,parent);

    }

    public static void bfstraversal(Node target,int k,List<Integer> res, Map<Node,Node> parent){
        Queue<Node> q=new LinkedList<>();
        q.add(target);

        Set<Integer> set=new HashSet<>();
        set.add(target.val);

        while(!q.isEmpty()){
            int n=q.size();

            if(k==0)break;

            for (int i = 0; i < n; i++) {
                Node curr=q.poll();

                if(curr.left!=null && !set.contains(curr.left.val)){
                    q.add(curr.left);
                    set.add(curr.left.val);

                }

                if(curr.right!=null && !set.contains(curr.right.val)){
                    q.add(curr.right);
                    set.add(curr.right.val);
                }

                if(parent.get(curr) != null && !set.contains(parent.get(curr).val)) {
                    q.add(parent.get(curr));
                    set.add(parent.get(curr).val);
                }
            }
            k--;
        }
        while(!q.isEmpty()){
            res.add(q.poll().val);
        }

    }


    public static List<Integer> distanceK(Node root, Node target, int k) {
        Map<Node,Node> parent = new HashMap<>();
        makeundirectedwithinorder(root, parent);
        List<Integer> res = new LinkedList<>();
        bfstraversal(target, k, res,parent);
        return res;
    }



    public static void main(String[] args) {
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

        List<Integer> res=distanceK(a,b,2);

        for(int j = 0; j <res.size(); j++){
            System.out.print(res.get(j)+" ");
        }
        System.out.println();
    }

}
