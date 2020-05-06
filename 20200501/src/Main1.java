import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            String[] num=new String [n];
            for (int i = 0; i < n; i++) {
                num[i]=sc.next();
            }
            int n2=sc.nextInt();
            Map<String ,Integer> m=new HashMap<>();
            for (int i = 0; i <n2 ; i++) {
                String  num2=sc.next();
                int count=m.getOrDefault(num2,0);
                m.put(num2,count+1);
            }
            int sum=0;
            for (int i = 0; i <n ; i++) {
                String  s=num[i];
                int c=m.getOrDefault(num[i],0);
                sum+=c;
                System.out.println(s+":"+c);
            }
            System.out.print("Invalid:"+(n2-sum));
        }
    }

}

