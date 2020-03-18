import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Stack;

//class TreeNode {
//      int val;
//      TreeNode left=null;
//      TreeNode right=null;
//     public TreeNode(int val) { this.val = val; }
// }
// class Solution {
//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        if(root==null||p==null||q==null){
//            return null;
//        }
//        Stack<TreeNode> pPath=new Stack<>();
//        Stack<TreeNode> qPath=new Stack<>();
//        //获得p的路径
//        getNodePath(root,p,pPath);
//        //获得q的路径
//        getNodePath(root,q,qPath);
//        while(!pPath.empty()&&!qPath.empty()){
//            if(pPath.size()>qPath.size()){
//                pPath.pop();
//            }else if(qPath.size()>pPath.size()){
//                qPath.pop();
//            }else{
//                if(pPath.peek()==qPath.peek()){
//                    return root;
//                }else{
//                    pPath.pop();
//                    qPath.pop();
//                }
//            }
//        }
//        return null;
//    }
////找node 的路径
//    public boolean getNodePath(TreeNode root,TreeNode node,Stack<TreeNode> sPath){
//        if(root==null){
//            return false;
//        }
//        sPath.push(root);
//        if(root==node){
//            return true;
//        }
//        //递归呆root的左子树或者右子树中找node的路径
//        if(getNodePath(root.left,node,sPath)||getNodePath(root.right,node,sPath)){
//            return true;
//        }
//        sPath.pop();
//        return false;
//    }
//}
public class test {
    public static void main(String[] args) {
        PriorityQueue<Integer> p=new PriorityQueue<>();
        //插入的元素一定要能够比大小，而且不能插入null对象
        //插入时会自动扩容
        //插入失败时，返回false或者抛出异常
        //插入元素期间，优先级队列的元素会进行调整，首元素对象一定是最小的吧
        p.offer(4);
        p.offer(1);
        p.offer(3);
        p.offer(6);
        p.offer(5);
        //peek();取优先级队列中第一个（最小的）元素
        //poll(); 删除优先级队列中第一个元素（最小的）元素
           //剩余元素会自动调整---》将剩余元素中最小的元素调整到首元素位置

        p.poll();
        System.out.println(p.peek());
        p.poll();
        System.out.println(p.peek());
        p.poll();
        System.out.println(p.peek());
        p.clear();
        System.out.println(p.size());
//        //1.构造一个空的优先级队列
//        PriorityQueue<Integer> p1=new PriorityQueue<>();
//        //2.按照指定容量进行构造
//        //如果知道优先级队列中大概要放多少个元素，最好是用该方法进行构造
//        //不要使用空的构造方式，因为在插入元素时，需要不断扩容，而影响程序效率
//        PriorityQueue<Integer> p2=new PriorityQueue<>(20);
//        //3.可以用一个集合来直接构造优先级队列，将来就会将集合中的元素放到优先级队列
//        List<Integer> list=new ArrayList<>();
//        list.add(6);
//        list.add(0);
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        //使用List构造优先级队列时，优先级队列并不是直接将List中的元素拷贝进来
//        //而是将List中的元素按照一定的规则进行排列
//        PriorityQueue<Integer> p3=new PriorityQueue<>(list);
//        System.out.println(p3.size());
//        System.out.println(p3.peek());
    }
}
