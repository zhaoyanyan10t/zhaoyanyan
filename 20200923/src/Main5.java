//import javax.swing.tree.TreeNode;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Scanner;
//import java.util.Stack;
//
//public class Main5 {
//    public ArrayList<Integer> preorderTraversal (TreeNode root) {
//        // write code here
//        ArrayList<Integer> list=new ArrayList<>();
//        TreeNode cur=root;
//        Stack<TreeNode> stack=new Stack<>();
//        while(cur!=null||!stack.isEmpty()){
//            while(cur!=null){
//                stack.push(cur);
//                list.add(cur.val);
//                cur=cur.left;
//            }
//            cur=stack.pop().right;
//        }
//        return list;
//    }
//    public static String judge(String str,int n){
//        if(str.length()!=8){
//            return "error";
//        }
//        for (int i = 0; i <str.length() ; i++) {
//            char ch=str.charAt(i);
//            if(ch<'0'||ch>'9'){
//                return "error";
//            }
//        }
//        StringBuffer s=new StringBuffer();
//        for (int i = 0; i <str.length() ; i++) {
//            if(i!=n-1){
//                s.append(str.charAt(i));
//            }
//        }
//        int[] arr=new int[7];
//        for (int i = 0; i <7 ; i++) {
//            arr[i]=(int)s.charAt(i);
//        }
//        Arrays.sort(arr);
//
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String str=sc.next();
//        int n=sc.nextInt();
//
//    }
//}
