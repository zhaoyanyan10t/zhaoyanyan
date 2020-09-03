public class test2 {
    public static void quick_sort (String[] array) {
        // write code here
        for (int i = 0; i <array.length ; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i].charAt(0)>array[j].charAt(0)){
                    swap(array,i,j);
                }
            }
        }
        for (int i = 0; i <array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }

    private static void swap(String[] arr,int i,int j) {
        String str=arr[i];
        arr[i]=arr[j];
        arr[j]=str;
    }

    public static void main(String[] args) {
        String[] arr={"nice","try","do"};
        quick_sort(arr);
    }
}
