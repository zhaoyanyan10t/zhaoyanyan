import java.util.Arrays;

public class dui {
    public static void main(String[] args) {
        int[] arr={4,2,6,9,1,3,7};
        show(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void show(int[] arr){
        //从最后一个非叶子结点开始向下递归 建小堆--》降序
        for (int i = arr.length/2-1; i >=0 ; i--) {
            create(arr,i,arr.length);
        }
        //之后排序，将最小的元素放在后面，之后依次在完善小堆
        for (int i = arr.length-1; i>=0 ; i--) {
            swap(arr,0,i);
            create(arr,0,i);
        }

    }
    public static void create(int[] arr,int parent,int length){
        int child=parent*2+1;


        while(child<length){
            if(child+1<length&&arr[child+1]<arr[child]){
            child+=1;
        }
            if(arr[parent]>arr[child]){
                int tmp=arr[parent];
                arr[parent]=arr[child];
                arr[child]=tmp;
            }
            parent=child;
            child=parent*2+1;
        }
    }
    public static void swap(int[] arr,int i,int j){
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }
}
