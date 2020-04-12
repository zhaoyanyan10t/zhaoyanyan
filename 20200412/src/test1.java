public class test1 {
    public static void printArray(int[] array){
        for (int e:array) {
            System.out.print(e+"");
        }
    }
    public static void mergeData(int[] array,int left,int mid,int right,int[] tmp){
        int index=left;
        int begin1=left,end1=mid,begin2=mid,end2=right;
        while(begin1<end1&&begin2<end2){
            if(array[begin1]<array[begin2]){
                tmp[index]=array[begin1];
                begin1++;
            }else{
                tmp[index]=array[begin2];
                begin2++;
            }
            index++;
        }
        while(begin1<end1){
            tmp[index]=array[begin1];
            index++;
            begin1++;
        }
        while(begin2<end2){
            tmp[index]=array[begin2];
            index++;
            begin2++;
        }
    }
    public static void mergeSort(int[] array,int left,int right,int[]tmp){
        if(right-left>1){
            int mid=left+((right-left)>>1);
//            左半部分分
            mergeSort(array,left,mid,tmp);
//            右半部分分
            mergeSort(array,mid,right,tmp);
//            再归
            mergeData(array,left,mid,right,tmp);
            System.arraycopy(tmp,left,array,left,right-left);
        }
    }
    public static void mergeSort(int[] array){
        int[] tmp=new int[array.length];
        mergeSort(array,0,array.length,tmp);
    }
    public static void mergeSortNor(int[] array){
        int[]tmp=new int[array.length];
        int gap=1;
        while(gap<array.length){
            for (int i = 0; i < array.length; i+=gap*2) {
                int left=i;
                int mid=left+gap;
                int right=mid+gap;

                if(mid>array.length){
                    mid=array.length;
                }
                if(right>array.length){
                    right=array.length;
                }
                mergeData(array,left,mid,right,tmp);
            }
            System.arraycopy(tmp,0,array,0,array.length);
            gap<<=1;
        }
    }

    public static void main(String[] args) {
        int[] array={3,8,2,6,9,7,1,4,0,5};
        mergeSort(array);
        printArray(array);

    }
}
