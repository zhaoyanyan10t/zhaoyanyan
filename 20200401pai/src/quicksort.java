
public class quicksort {
    public static void swap(int[] arr,int a,int b){
        int tmp=arr[a];
        arr[a]=arr[b];
        arr[b]=tmp;
    }
    //找基准值方法2
    public static int partion2(int[] arr,int left,int right){
        int cur=left;
        int prev=cur-1;
        int key=arr[right-1];
        while(cur<right){
            if(arr[cur]<key&&++prev!=cur){
                swap(arr,prev,cur);
            }
            ++cur;
        }
        if(++prev!=right){
            swap(arr,prev,right-1);
        }
        return prev;
    }
    //找基准值1
    public static int partion(int[] arr,int left,int right){

        int begin=left;
        int end=right-1;
        int key=arr[end];
        while(begin<end){
            while(begin<end&&arr[begin]<=key){
                begin++;
            }
            while(begin<end&&arr[end]>=key){
                end--;
            }
            if(begin<end)
                swap(arr,begin,end);
        }
        swap(arr,begin,right-1);
        return begin;
    }
//    [left,right)
    public static void Quick(int[] arr,int left,int right){
        //right是数组的长度
        if(right-left>1){
            //至少有两个元素
            // 按照基准值对[left，right）区间进行分割
            int div=partion(arr,left,right);
            //递归排基准值的左半侧
            Quick(arr,0,div);
            Quick(arr,div+1,right);
        }
    }
    public static void print(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={3,1,6,2,0};
        Quick(arr,0,5);
        print(arr);
    }
}
