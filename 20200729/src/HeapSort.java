import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr={4,2,6,1,3,8,9};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int [] arr){
//        1.构建大顶堆
        //从最后一个非叶子结点从右至左，从下往上调整结构
        //最后一个非叶子结点是len/2-1
        for (int i = arr.length/2-1; i >=0 ; i--) {
            adjust(arr,i,arr.length);
        }//建大堆完成

//        2.调整对结构+交换堆顶元素与末尾元素
        for (int i = arr.length-1; i >=0; i--) {
            swap(arr,0,i);
            adjust(arr,0,i);
        }

    }
//    public static void adjust(int[] arr,int i,int length){
//        //调整成为大顶堆
//        for (int j = i*2+1; j <length ; j=j*2+1) {
//            if(j+1<length&&arr[j]<arr[j+1]) {
//                //有左右结点并且j指向较大的那个节点
//                j++;
//            }
//            if(arr[j]>tmp){
//                //如果孩子节点比父节点大，则交换两者的位置
//                int t=arr[i];
//                arr[i]=arr[j];
//                arr[j]=t;
//                i=j;
//            }
//        }
//    }
    public static void adjust(int[] arr,int i,int length){
        //调整成为大顶堆
        int tmp=arr[i];//取出当前元素i
        for (int j = i*2+1; j <length ; j=j*2+1) {//从i结点的左子结点开始，也就是2i+1处开始
            if(j+1<length&&arr[j]<arr[j+1]) {
                //有左右结点并且j指向较大的那个节点
                j++;
            }
            if(arr[j]>tmp){
                //如果孩子节点大于父节点，将孩子节点赋值给父节点（不用进行交换）
                arr[i]=arr[j];
                i=j;
            }else{
                break;
            }
        }
        arr[i]=tmp;//将tmp值放到最终的位置上
    }
    public  static void swap(int[] arr,int a,int b){
        int tt=arr[a];
        arr[a]=arr[b];
        arr[b]=tt;
    }
}
