public class quicksortwa {
    public static void swap(int[] arr,int a,int b){
        int tmp=arr[a];
        arr[a]=arr[b];
        arr[b]=tmp;
    }
    public static void wa(int[] arr,int left,int right){
        int begin=left;
        int end=right-1;
        int keng=arr[end];
        while(begin<end){
            while(begin<end&&arr[begin]<keng){
                begin++;
            }
            if(begin<end)
                arr[end]=arr[begin];
            while(begin<end&&arr[end]>keng){
                end--;
            }
            if(begin<end)
            arr[begin]=arr[end];
        }
        arr[begin]=keng;
    }
    public static void print(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={3,1,6,2,0};
        wa(arr,0,arr.length);
        print(arr);
    }
}
