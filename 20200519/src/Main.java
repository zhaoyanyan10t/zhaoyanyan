import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int[][] num=new int[n][2];
            for (int i = 0; i <n ; i++) {
                num[i][0]=sc.nextInt();
                num[i][1]=sc.nextInt();
            }
            List<Integer> list=new ArrayList<>();
            for (int i = 0; i < num.length; i++) {
                if(num[i][0]==1){
                    list.add(num[i][1]);
                }else{
                    list.remove(num[i][1]);
                }
                duo(list);
            }
        }
    }
    public static void duo(List<Integer> L){
        Collections.sort(L);
        int sum=0;
        for (int i = 0; i < L.size()-1; i++) {
            sum+=L.get(i);
        }
        if(sum>L.get(L.size()-1)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
