public class BinarySearchTree {
    public static class Node{
        int val;
        Node right;
        Node left;
        public Node(int val){
            this.val=val;
        }
    }
    public Node root=null;

    //查找key
    public Node search(int key){
        Node cur=root;
        while(cur!=null){
            if(cur.val==key){
                return cur;
            }else if(cur.val<key){
                cur=cur.right;
            }else{
                cur=cur.left;
            }
        }
        return null;
    }
    //将key插入进去
    public boolean insert(int key){
        if(root==null){
            root=new Node(key);
            return true;
        }
        //不为空的时候，先找到要往哪个节点的孩子插入，
        Node cur=root;
        Node parent=null;
        while(cur!=null){
            if(key==cur.val){
                return  false;
            }else if(key>cur.val){
                parent=cur;
                cur=cur.right;
            }else{
                parent=cur;
                cur=cur.left;
            }
        }
        Node node=new Node(key);
        if(key>parent.val){
            parent.right=node;
        }else{
            parent.left=node;
        }
        return true;
    }

    //找到要删除的cur
    public boolean remove(int key){
        Node cur=root;
        Node parent=null;
        while(cur!=null){
            if(cur.val==key){
                removeNode(parent,cur);
                return true;
            }else if(cur.val<key){
                parent=cur;
                cur=cur.right;
            }else{
                parent=cur;
                cur=cur.left;
            }
        }
        return false;
    }
    //删除节点
    public void removeNode(Node parent,Node cur){
        //左子树或者右子树为空，是可以更改结点的指向来满足删除
        //左子树和右子树都不为空，就需要将合适的值赋值给要删除的值，然后再将赋值了的值删除掉。
        if(cur.left==null){//左子树是空的，要把cur删除
            if(cur==root){//要删除的就是根节点
                root=cur.right;
            }else if(cur==parent.left){
                parent.left=cur.right;

            }else{
                parent.right=cur.right;
            }
        }else if(cur.right==null){
            if(root==null){
                root=cur.left;
            }else if(cur==parent.left){
                parent.left=cur.left;
            }else{
                parent.right=cur.right;
            }
        }else{//左右子树都不为空
            //要删除节点肯定要找一个合适的，要满足搜索二叉树的性质
            Node goatparent=cur;
            Node goat=cur.right;
            while(goat.left!=null){//要找到要删除节点的右子树中最小的节点
                goatparent=cur;
                cur=cur.left;
            }
            cur.val=goat.val;//将合适的值赋值给cur
            if(goat==goatparent.left){//之后再将合适的那个点删除
                goatparent.left=goat.left;
            }else{
                goatparent.right=goat.right;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={3,9,7,4,1,6,2,8,5};
        BinarySearchTree tree=new BinarySearchTree();
        for (int i:arr) {
            System.out.println(tree.insert(i));
        }
        in(tree.root);
        System.out.println(tree.search(7).val);
        tree.remove(4);
        in(tree.root);
    }
    //前序遍历
    public static void in(Node node){
        if(node!=null){
            in(node.left);
            System.out.print(node.val);
            in(node.right);
        }
    }
}
