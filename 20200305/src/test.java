//平衡二叉树
//子树的高度重复求解，导致效率低下O(N^2)
//先检测子树的平衡性
//class Solution {
//    public int maxDepth(TreeNode root) {
//        if (root == null) {
//            return 0;
//        }
//        int leftheight = maxDepth(root.left);
//        int rightheight = maxDepth(root.right);
//        return leftheight > rightheight ?
//                leftheight + 1 : rightheight + 1;
//    }
//
//    public boolean isBalanced(TreeNode root) {
////求左右子树的高度差
//        if (root == null) {
//            return true;
//        }
//        int height1 = maxDepth(root.left);
//        int height2 = maxDepth(root.right);
//        int height = height1 > height2 ?
//                height1 - height2 : height2 - height1;
//        //    int height=Math.abs(height1-height2);
//        if (height > 1) {
//            return false;
//        }
//        return isBalanced(root.left) &&
//                isBalanced(root.right);
//    }
//}

import java.util.LinkedList;
import java.util.Queue;

//判断子树
//class Solution {
//    public boolean isSameTree(TreeNode p, TreeNode q) {
//        if(p==null&&q==null){
//            return true;
//        }
//        if(p==null||q==null){
//            return false;
//        }
//        //两棵树都不为空
//        if(p.val!=q.val){
//            return false;
//        }
//        return isSameTree(p.left,q.left)&&
//                isSameTree(p.right,q.right);
//    }
//    public boolean isSubtree(TreeNode s, TreeNode t) {
//        if(t==null){
//            return true;
//        }
//        if(s==null){
//            return false;
//        }
//        //s t 都不为空
//        //s和t是相同的树
//        if(isSameTree(s,t)){
//            return true;
//        }
//        return isSubtree(s.left,t)||
//                isSubtree(s.right,t);
//    }
//}
//判断相同的树
//class Solution {
//    public boolean isSameTree(TreeNode p, TreeNode q) {
//        if(p==null&&q==null){
//            return true;
//        }
//        if(p==null&&q!=null||p!=null&&q==null){
//            return false;
//        }
//        //两棵树都不为空
//        if(p.val!=q.val){
//            return false;
//        }
//        return isSameTree(p.left,q.left)&&
//                isSameTree(p.right,q.right);
//    }
//}
//// 二叉树采用孩子表示法
class BTNode{
    BTNode left=null;//左子树
    BTNode right=null;//右子树
    int val;
    public BTNode(int val){
        this.val=val;
    }
}
public class test {
    private BTNode root=null;//引用二叉树的根节点
//root指向根节点

    //为了快速给出一棵二叉树作为验证(面试时不可用）
    public test(){
        BTNode n1=new BTNode(1);
        BTNode n2=new BTNode(2);
        BTNode n3=new BTNode(3);
        BTNode n4=new BTNode(4);
        BTNode n5=new BTNode(5);
        BTNode n6=new BTNode(6);

        root=n1;
        n1.left=n2;
        n1.right=n4;
        n2.left=n3;
        n4.left=n5;
        n4.right=n6;
    }
    public void preOrder()
    {
        System.out.print("前序遍历：");
        preOrder(root);
        System.out.println();
    }
    public void inOrder()
    {
        System.out.print("中序遍历：");
        inOrder(root);
        System.out.println();
    }
    public void postOrder()
    {
        System.out.print("后序遍历：");
        postOrder(root);
        System.out.println();
    }
    //获取总结点个数
    public int getNodeCount(){
        return getNodeCount(root);
    }
    //获取叶子结点个数
    public int getLeafNodeCount(){
        return getLeafNodeCount(root);
    }
    //获取第k层节点的个数
    public int getKLevelNodeCount(int k){
        return getKLevelNodeCount(root,k);
    }
    //二叉树的高度
    public int getHeight(){
        return getHeight(root);
    }
    //获取val在数中对应的节点，找到返回结点，否则返回null
    public BTNode find(int val){
        return find(root,val);
    }
    //将节点中的值域打印出来
    //前序遍历,根左右
    private void preOrder(BTNode root){
        if(root!=null){//加入树不为空，即根节点不为空
            System.out.print(root.val+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    //中序遍历，左根右
    private void inOrder(BTNode root){
        if(root!=null){//加入树不为空，即根节点不为空
            inOrder(root.left);
            System.out.print(root.val+" ");
            inOrder(root.right);
        }
    }
    //后序遍历，左右根
    private void postOrder(BTNode root){
        if(root!=null){//加入树不为空，即根节点不为空
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.val+" ");
        }
    }
    //获取节点个数  左子树结点数+根+右子树节点个数
    private int getNodeCount(BTNode root){
        if(root==null){
            return 0;
        }
        return getNodeCount(root.left)+getNodeCount(root.right)+1;
    }
    //叶子结点个数(d度为0的结点）
    private int getLeafNodeCount(BTNode root){
        if(root==null){
            return 0;
        }
        if(root.left==null&&root.right==null){
            return 1;
        }
        return getLeafNodeCount(root.left)+getLeafNodeCount(root.right);
    }
    //获取第k层节点的个数
    private int getKLevelNodeCount(BTNode root,int k){
        //空树或者K<0  结果都为0
        //k==1,只有一个结点
        //k>0
        //到子树中求k-1层
        if(root==null||k<0){
            return 0;
        }
        if(k==1){
            return 1;
        }
        return getKLevelNodeCount(root.left,k-1)+getKLevelNodeCount(root.right,k-1);
    }
    //二叉树的高度
    private int getHeight(BTNode root){
        if(root==null){
            return 0;
        }
        int leftHeight=getHeight(root.left);
        int rightHeight=getHeight(root.right);
        return leftHeight>rightHeight?leftHeight+1:rightHeight+1;
    }
    //获取val在数中对应的节点，找到返回结点，否则返回null
    private BTNode find(BTNode root,int val){
        if(root==null){
            return null;
        }
        //根节点中存的就是val，直接返回root
        if(root.val==val){
            return root;
        }
        BTNode retNode=null;
        if(null!=(retNode=find(root.left,val))||null!=(retNode=find(root.right,val))){
            return retNode;
        }
        return null;
    }
    //层序遍历
    public void LevelOrder(){
        if(root==null){
            return ;
        }
        Queue<BTNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            BTNode cur=q.poll();
            System.out.print(cur.val);
            //如果cur有左子树，让左子树入队列
            if(cur.left!=null){
                q.offer(cur.left);
            }
            //如果cur有右子树，让右子树入队列
            if(cur.right!=null){
                q.offer(cur.right);
            }
        }
    }
    public static void main(String[] args) {
        test bt=new test();
        bt.LevelOrder();
        bt.preOrder();
        bt.inOrder();
        bt.preOrder();
        System.out.println(bt.getNodeCount());
        System.out.println(bt.getLeafNodeCount());
        System.out.println(bt.getKLevelNodeCount(3));
        System.out.println(bt.find(1));
    }
}

