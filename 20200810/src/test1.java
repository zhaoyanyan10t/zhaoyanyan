import javax.jws.Oneway;
import java.util.HashSet;
import java.util.Set;

public class test1 {
    public static void main(String[] args) {
        int[] arr={4,1,2,1,2};
        System.out.println(bu(arr));
    }
    public static int bu(int[] arr){
        Set<Integer> s=new HashSet<>();
        for (int i = 0; i <arr.length ; i++) {
            if(!s.add(arr[i])){
                s.remove(arr[i]);
            }
        }
        Object[] o=s.toArray();
        return (int)o[0];
    }
    public static void main1(String[] args) {
        int[] arr={4,1,2,1,2};
        int ret=0;
        for (int i = 0; i <arr.length ; i++) {
            ret^=arr[i];
        }
        System.out.println(ret);
    }
}
