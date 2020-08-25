public class Main4 {
    public static void main(String[] args) {
//        int[] arr={21,21,22,22,23,23,23,23,23,23,24};
        int[] arr={1,2,2,3};
//        int[] arr={1,2};
        int count=0;
        int len=arr.length/2;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==arr[len]){
                count++;
            }
        }
        if(count>=len)
        System.out.println(arr[arr.length/2]);
        else
        System.out.println("0");
    }
}
