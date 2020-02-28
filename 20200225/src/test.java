class BTNode{
    BTNode left=null;
    BTNode right=null;
    int val;

    public BTNode(int val){
        this.val=val;
    }
}
public class test {
    private BTNode root=null;//引用二叉树的根节点
    //前序遍历

    public void preOrder(BTNode root){
        if(null!=root){
            System.out.println(root.val+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    //中序遍历

//节点个数
    private int getNodeCount(BTNode root){
        if(null==root){
            return 0;
        }
        return getNodeCount(root.left)+getNodeCount(root.right)+1;
    }
    //叶子结点个数
    private int getLeafNodeCount(BTNode root){
        if(null==root){
            return 0;
        }
        //root就是叶子结点
        if(root.left==null&&root.right==null){
            return 1;
        }
        return getLeafNodeCount(root.left)+getLeafNodeCount(root.right);
    }
    //获取第K层中节点的个数
    private   int getKLevelNodeCount(BTNode root,int k){
        if(root==null||k<1){
            return 0;
        }
        if(k==1){
            return 1;
        }
        return getKLevelNodeCount(root.left,k-1)+getKLevelNodeCount(root.right,k-1);
    }
    public static void main(String[] args) {

    }
}
