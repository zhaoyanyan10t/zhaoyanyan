import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        char[][] num={{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(judge(num,str));

    }
    public static boolean judge(char[][] num,String str){
        if(num.length<0){
            return  false;
        }
        for (int i = 0; i <num.length ; i++) {
            for (int j = 0; j <num[i].length ; j++) {
                if(num[i][j]==str.charAt(0)){
                    //进入判断
                    if(Find(num,str,0,i,j)){
                        return true;
                    }
                }
            }
        }
        //循环走完都没有，那就是false
        return  false;
    }

    private static boolean Find(char[][] num, String str, int t,int i, int j) {

        if(t==str.length()){
            return true;
        }
        if (i < 0 || j < 0 || i >= num.length || j >= num[0].length || num[i][j] != str.charAt(t)) {

            return false;
        }
        if(Find(num,str,t+1,i-1,j)||Find(num,str,t+1,i,j+1)||Find(num,str,t+1,i+1,j)||Find(num,str,t+1,i,j-1)){
            return true;
        }
        return  false;
    }
}
