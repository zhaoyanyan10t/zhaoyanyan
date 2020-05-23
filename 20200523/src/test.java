import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int[][] num = new int[n][2];
            for (int i = 0; i < n; i++) {
                num[i][0] = scanner.nextInt();
                num[i][1] = scanner.nextInt();
            }
            ArrayList<Integer> list=new ArrayList<>();
            for (int i = 0; i <num.length ; i++) {
                if(num[i][0]==1){
                    list.add(num[i][1]);
                }else{
                    list.remove(new Integer(num[i][1]));
                }
                if(judje(list)){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
            }

        }
    }
    //是否构成多边形判断三角形 两边之和大于第三边
    public static boolean judje(ArrayList<Integer> l){
        if(l.size()<3){
            return false;
        }
        for (int i = 0; i <l.size() ; i++) {
//            从第一个元素开始看，除过当前元素，剩余的元素之和，
//            如果小于这个元素，则不构成多边形。
            int tmp=l.remove(i);
            int sum=0;
            for (int j = 0; j <l.size() ; j++) {
                sum+=l.get(j);
            }
            if(tmp>=sum){
//                如果不能构成多边形，要把删除的这个元素加进来，否则影响后面的判断
                l.add(i,tmp);
                return false;
            }
            l.add(i,tmp);
        }
        return true;
    }
}
