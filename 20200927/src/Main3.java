public class Main3 {
    public int[] insertSort (int[] data) {
        // write code here
        int i,j;
        for ( i = 1; i <data.length ; i++) {
            int key=data[i];
            for ( j = i-1; j >=0 ; j--) {
                if(key<data[j]){
                    data[j+1]=data[j];
                }else{
                    break;
                }
            }
            data[j+1]=key;
        }
        return data;
    }
    public static void main(String[] args) {

    }
}
