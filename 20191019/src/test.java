import java.util.Arrays;
public class test {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.print(Arrays.toString(arr));
        fun5(arr);
    }
    public static void fun5(int[] arr) {
        int left=0,right=arr.length-1;
        while(left<right){
            while(left<right&&arr[left]%2!=0){
                left++;
            }
            while(left<right&&arr[right]%2==0){
                right--;
            }
            if(left<right){
                int tmp=arr[left];
                arr[left]=arr[right];
                arr[right]=tmp;
            }
        }
        System.out.print(Arrays.toString(arr));
    }
    public static void fun4(int[] arr){
        int left=0;
        int right=arr.length-1;
        int tmp;
            while(arr[left]<arr[right]){
                tmp=arr[left];
                arr[left]=arr[right];
                arr[right]=tmp;
                left++;
                right--;
            }
        System.out.print(Arrays.toString(arr));
    }
    public static void main3(String[] args) {
        int[] arr={1,2,3,4,5};
        fun3(arr);
    }
    public static void fun3(int[] arr){
        int ave,sum=0;
        for (int i = 0; i < arr.length; i++) {
           sum+=arr[i];
        }
        ave=sum/arr.length;
        System.out.print(ave);
    }
    public static void main2(String[] args) {
    int[] arr={1,2,3,4,5};
    fun2(arr);
    }
    public static void fun2(int[] arr){
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.print(max);
    }
    public static void main1(String[] args) {
        int[] arr = {2, 3, 4,8,9};
//        System.out.println(Arrays.toString(arr));
        fun(arr);
    }

    public static void fun(int[] arr) {

        int[] arr1 = {1,2,3,4,5};
        int ret,i;
        for (i = 0; i <5; i++) {
            ret=arr[i];
            arr[i]=arr1[i];
            arr1[i]=ret;
        }
        System.out.print(Arrays.toString(arr));
    }
    public static void fun1(int[] arr) {
        String ret ="[";
        for (int i = 0; i <arr.length ; i++) {
            ret+=arr[i];
            if(i!=arr.length-1){
                ret+=",";
            }
        }
        ret+="]";
        System.out.println(ret);
//        int[] ret = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            ret[i] = arr[i] * 2;
//            System.out.print(ret[i] + " ");
//        }
    }
}
