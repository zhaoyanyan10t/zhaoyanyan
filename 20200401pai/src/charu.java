public class charu {
    public static void charupai(int[] arr){
        int j;
        for (int i = 1; i <arr.length; i++) {
            int key=arr[i];
            for (j = i-1; j >=0 ; j--) {
                if(arr[j]>key){
                    arr[j+1]=arr[j];
                }else{
                    break;
                }
            }
            arr[j+1]=key;
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
//    public static void charupai(int[] arr){
//        for (int i = 1; i <arr.length; i++) {
//            int key=arr[i];
//            int end=i-1;
//            while(end>=0&&arr[end]>key){
//                arr[end+1]=arr[end];
//                end--;
//            }
//            arr[end+1]=key;
//        }
//        for (int i = 0; i <arr.length ; i++) {
//            System.out.print(arr[i]+" ");
//        }
//    }
    public static void main(String[] args) {
        int[] arr={3,1,8,5,0};
        charupai(arr);
    }
}
