public class selectsort {
    public static void swap(int[] arr,int a,int b){
        int tmp=arr[a];
        arr[a]=arr[b];
        arr[b]=tmp;
    }
     public static void Select(int[] arr) {
         int begin = 0;
         int end = arr.length - 1;

         while (begin < end) {
             int max = begin;
             int min = begin;
             for (int i = begin+1; i <=end; i++) {
                 if (arr[max] < arr[i]) {
                     max = i;
                 }
                 if (arr[min] > arr[i]) {
                     min = i;
                 }
             }

             swap(arr, max, end);
//             万一end的位置刚好是最小值
             if(min==end){
                 min=max;
             }
             swap(arr, min, begin);
             begin++;
             end--;
         }
         for (int i = 0; i <arr.length ; i++) {
             System.out.print(arr[i]+" ");
         }
     }
//    public static void Select(int[] arr){
//        for (int i = 0; i <arr.length; i++) {
//            for (int j = i+1; j <arr.length ; j++) {
//                if(arr[i]<arr[j]){
//                    swap(arr,i,j);
//                }
//            }
//        }
//        for (int i = 0; i <arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }
//    }
//    public static void Select(int[] arr){
//        for (int i = 0; i <arr.length; i++) {
//            int max=0;
//            for (int j = 1; j <arr.length-i ; j++) {
//                if(arr[j]>arr[max]){
//                    max=j;
//                }
//            }
//            //最大的数找到了，把他放在最后的位置
//
//            swap(arr,max,arr.length-1-i);
//        }
//        for (int j = 0; j <arr.length ; j++) {
//            System.out.print(arr[j]+" ");
//        }
//    }
    public static void main(String[] args) {
        int[] arr={9,3,2,6,5,7,1,4,0};
        Select(arr);
    }
}
