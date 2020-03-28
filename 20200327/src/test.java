import java.util.PriorityQueue;

public class test {
    //插入排序
//    public static void charu(int[] arr){
//        for (int i = 1; i <arr.length; i++) {
//            int key=arr[i];
//            int j=i-1;
//            while(j>=0&&arr[j]>key){
//                arr[j+1]=arr[j];
//                j--;
//            }
//            arr[j+1]=key;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }
//    }
    //希尔排序
public static void shell(int[] arr){
    int gap=3;
    while(gap>0){
        for (int i = gap; i <arr.length; i++) {
            int key=arr[i];
            int j=i-gap;
            while(j>=0&&arr[j]>key){
                arr[j+gap]=arr[j];
                j=j-gap;
            }
            arr[j+gap]=key;
        }
        gap--;
    }

    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
    }
}
    public static void main(String[] args) {
        PriorityQueue p=new PriorityQueue();

        p.put()
        int[] arr={3,6,1,8,2};
        shell(arr);
//        charu(arr);
    }
}
