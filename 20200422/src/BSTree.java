public class BSTree {
    public static class BSTNode {
        BSTNode left = null;
        BSTNode right = null;
        int val;

        BSTNode(int val) {
            this.val = val;
        }
    }

    //根节点
    private BSTNode root = null;

    //检测val是否在二叉搜索树中
    boolean contains(int val) {
        BSTNode cur = root;
        while (cur != null) {
            if (val == cur.val) {
                return true;
            } else if (val < cur.val) {
                cur = cur.left;
            } else {
                cur = cur.right;
            }
        }
        return false;
    }

    //将val插入到二叉搜索树中，插入成功返回true
    public boolean insert(int val) {
        //空
        if (null == root) {
            root = new BSTNode(val);
            return true;
        }
//        非空
        //找待插入元素在二叉搜索树中的插入位置 ,并保存双亲。
        BSTNode cur = root;
        BSTNode parent = null;
        while (cur != null) {
            parent = cur;
            if (val < cur.val) {
                cur = cur.left;
            } else if (val > cur.val) {
                cur = cur.right;
            } else {
                return false;
            }
        }
        //找到待插入节点的位置--插入新节点
        cur = new BSTNode(val);
        if (val < parent.val) {
            parent.left = cur;
        } else {
            parent.right = cur;
        }
        return true;
    }

    public void inOrder() {
        inOrder(root);
    }

    public void inOrder(BSTNode root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.val + " ");
            inOrder(root.right);
        }
    }

    //最左侧节点----最小的节点
    public int leftMost() {
        if (root == null) {
            ;
        }
        BSTNode cur = root;
        while (cur.left != null) {
            cur = cur.left;
        }
        return cur.val;
    }

    //最右侧节点----最大的节点
    public int rightMost() {
        if (root == null) {
            ;
        }
        BSTNode cur = root;
        while (cur.right != null) {
            cur = cur.right;
        }
        return cur.val;
    }

    //删除
    boolean remove(int val) {
        if (root == null) {
            return false;
        }
        BSTNode cur = root;
        BSTNode parent = null;
        while (cur != null) {

            if (val == cur.val) {
                break;
            } else if (val < cur.val) {
                parent = cur;
                cur = cur.left;
            } else {
                parent = cur;
                cur = cur.right;
            }
        }
        //该元素不在二叉搜索树中
        if (cur == null) {
            return false;
        }
        //已经找到待删除节点的位置，之后删除该节点

        //必须要对cur的孩子结点分情况
//        1.cur没有孩子
//                2.cur只有左孩子
//                2.cur只有右孩子
//                4,。cur左右孩子均存在
        if (cur.left == null) {
            //cur只有右孩子或者cur是叶子结点
            if (parent == null) {
                root = cur.right;
            } else {
                //双亲存在
                if (cur == parent.left) {
                    parent.left = cur.right;
                } else {
                    parent.right = cur.right;
                }
            }
        } else if (cur.right == null) {
            //cur只有左孩子
            if (parent == null) {
                root = cur.left;
            } else {
                if (cur == parent.left) {
                    parent.left = cur.left;
                } else {
                    parent.right = cur.left;
                }
            }
        } else {
            //cur的左右孩子均存在---不能直接删除
            //在cur的子树中找一个替代结点删除
            //方式一：在其右子树中找最小的节点，即最左侧节点
            //方式二：在其左子树中找最大的节点，即最右侧节点
            BSTNode del = cur.right;
            parent = cur;
            while (del.left != null) {
                parent = del;
                del = del.left;
            }
            //替代结点找到
            cur.val = del.val;
            //删除替代结点
            //最左侧说明没有左孩子了
            if (parent.left == del) {
                parent.left = del.right;
            } else {
                parent.right = del.right;
            }

        }
        return true;
    }



    public static void main(String[] args) {
        int[] array={5,3,4,1,7,8,2,6,0,9};
        BSTree t=new BSTree();
        for (int e:array) {
            t.insert(e);
        }
        t.inOrder();
        System.out.println();
        System.out.println(t.leftMost());
        System.out.println(t.rightMost());

    }
}
