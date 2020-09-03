import java.util.Arrays;

public class test {

    public static void merge (int[] one, int[] two) {
        // write code here
        int n=one.length+two.length;
        int[] arr=new int[n];
        int a=0;
        for (int i = 0; i <one.length; i++) {
            arr[a++]=one[i];
        }
        for (int i = 0; i <two.length; i++) {
            arr[a++]=two.length;
        }
        Arrays.sort(arr);
        System.out.println(arr.toString());
    }
    public static void main(String[] args) {
        int[] one={3,1,2};
        int[] two={2,5,4};
        merge(one,two);

    }
}
