
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void swap(int[] arr,int i,int j){
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            array[i] = sc.nextInt();
            sum += array[i];
        }

        int z = 0;
        int[] arr = new int[sum];
        for (int i = 0; i < 10; i++) {
            while (array[i] != 0) {
                arr[z++] = i;
                array[i]--;
            }
        }
        Arrays.sort(arr);

        if (arr[0] == 0) {
            int t = arr[1];
            int j = 1;
            while (t == 0) {
                j++;
                t = arr[j];
            }

            swap(arr, 0, j);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

//        int j=0;
//        int min=arr[j];
//        while(min==0){
//            j++;
//            min=arr[j];
//        }
//        for (int i = j+1; i <10 ; i++) {
//            if(arr[i]==0){
//                continue;
//            }
//            if(arr[i]<min){
//                    min=arr[i];
//                }
//        }
//    }
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        char c = scanner.next().charAt(0);
        for (int i = 0; i < (N + 1) / 2; i++) {
            for (int j = 0; j < N; j++) {
                if (i == 0 || j == 0 || i == ((N + 1) / 2 - 1) || j == N - 1) {
                    System.out.print(c);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        char  c=sc.next().charAt(0);
//        int N=(n+1)/2;
//        for (int i = 0; i <N; i++) {
//            for (int j = 0; j < n; j++) {
//                if(i==0||i==N-1){
//                    System.out.print(c);
//                }else{
//                    if(j==0||j==n-1){
//                        System.out.print(c);
//                    }else{
//                        System.out.print(" ");
//                    }
//                }
//            }
//            System.out.println();
//        }
//    }
//}
