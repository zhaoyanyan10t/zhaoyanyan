public class queuesort{
    public static void swap(int[] arr,int a,int b){
        int tmp=arr[a];
        arr[a]=arr[b];
        arr[b]=tmp;
    }
    public static void shiftDown(int[] arr,int parent,int size){
        int child=parent*2+1;

        while(child<size){
            //找出较小的孩子
            if(child+1<size&&arr[child+1]<arr[child]){
                child=child+1;
            }
            //看较小的孩子和父母亲比较
            if(arr[parent]>arr[child]){
                swap(arr,parent,child);
                parent=child;
                child=parent*2+1;
            }else{
                break;
            }

        }
    }
    public static void Queue(int[] arr){
        int lastLeaf=(arr.length-2)>>1;
        for (int root = lastLeaf; root >=0 ; root--) {
            shiftDown(arr,root,arr.length);
        }
        int end=arr.length-1;
        while(end>=0){
            swap(arr,0,end);
            shiftDown(arr,0,end);
            end--;
        }
        for (int i:arr) {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={3,1,7,2,0};
        Queue(arr);
    }
}


//import java.util.PriorityQueue;
//
//public class queuesort {
//    public static void Queue(int[] arr) {
//        PriorityQueue<Integer> p = new PriorityQueue<>(arr.length);
//        for (int i = 0; i < arr.length; i++) {
//            p.offer(arr[i]);
//        }
//        for (int i = 0; i <arr.length ; i++) {
//            arr[i]=p.poll();
//        }
//        for (int i = 0; i <arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }
//    }
//    public static void main(String[] args) {
//        int[] arr={1,5,2,8,0};
//        Queue(arr);
//
//    }
//}
