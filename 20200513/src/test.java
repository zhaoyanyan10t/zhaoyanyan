import java.util.Map;
import java.util.TreeMap;
class GoUpstairs {
    public int countWays(int n) {
        // write code here
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        if(n==3){
            return 4;
        }
        return (countWays(n-1)+countWays(n-2)%1000000007+countWays(n-3))%1000000007;
    }
}
public class test {
    public static void main(String[] args) {
        GoUpstairs t=new GoUpstairs();
        System.out.println(t.countWays(3));

//        Map<String,Integer> m=new TreeMap<>();
//        m.put("B",2);
//        m.put("A",1);
//        m.put("F",5);
//        System.out.println(m);
//        System.out.println(m.get("d"));

    }
}
