public class construct_pre_inorder_post_tree {

    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    public static int searchind(int[] inorder,int leftbound,int rightbound,int tar){
        for(int i=leftbound;i<=rightbound;i++){
            if(inorder[i]==tar){
                return i;
            }
        }
        return -1;
    }

    public static Node builduniqTreewithin_pre_inorder(int[] preorder, int[] inorder, int[] preind, int left, int right ){

        if(left>right)return null;

        Node root=new Node(preorder[preind[0]]);

        int inindx=searchind(inorder,left,right,preorder[preind[0]]);
        preind[0]++;

       root.left= builduniqTreewithin_pre_inorder(preorder,inorder,preind,left,inindx-1);
        root.right= builduniqTreewithin_pre_inorder(preorder,inorder,preind,inindx+1 ,right);

         return root;
    }

    public static Node builduniqTreewith_post_inorder(int[] postorder, int[] inorder, int[] postind, int left, int right ){

        if(left>right)return null;

        Node root=new Node(postorder[postind[0]]);

        int inindx=searchind(inorder,left,right,postorder[postind[0]]);
        postind[0]--;

        root.right= builduniqTreewith_post_inorder(postorder,inorder,postind,inindx+1 ,right);
        root.left= builduniqTreewith_post_inorder(postorder,inorder,postind,left,inindx-1);

        return root;
    }

    public static Node builduniqTreewithin_pre_post(int[] preorder, int[] inorder, int[] preind, int left, int right ){

        if(left>right)return null;

        Node root=new Node(preorder[preind[0]]);

        int inindx=searchind(inorder,left,right,preorder[preind[0]]);
        preind[0]++;

        root.left= builduniqTreewithin_pre_inorder(preorder,inorder,preind,left,inindx-1);
        root.right= builduniqTreewithin_pre_inorder(preorder,inorder,preind,inindx+1 ,right);

        return root;
    }

    static void main(String[] args) {
            int inorder[]={9,3,15,20,7};
            int preorder[]={3,9,20,15,7};
            int postorder[]={9,15,7,20,3 };

        int[] preind = {0};
        int[] postind = {postorder.length-1};

        //builduniqTreewithin_pre_inorder(preorder,inorder,preind,0,inorder.length-1);

        //builduniqTreewith_post_inorder(postorder,inorder,postind,0,inorder.length-1);


    }
}
