import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        while(sc.hasNext()){
            String str=sc.nextLine();
            String[] s=str.split("#");
            int[][] arr=new int[s.length][];
            for (int i = 0; i <s.length ; i++) {
                String[] s1=s[i].split(",");
                for (int j = 0; j <s1.length ; j++) {
                    int tmp=Integer.parseInt(s1[j]);
                    System.out.println(tmp);
                    arr[i][j]=tmp;
                }
            }
            int c=arr.length-1;
            int r=arr[0].length-1;
            int t=0;
            int[] num=new int[c+r+2];
            int i=0,j=0;
                while(i<c&&j<r){
                    for (int k = j; k <=r; k++) {
//                        System.out.println(arr[i][k]+",");
                        num[t++]=arr[i][k];
                    }
                    for (int k = i+1; k <=c ; k++) {
//                        System.out.println(arr[k][r-1]);
                        num[t++]=arr[k][r-1];
                    }
                    for (int k = r-1; k >=j ; k--) {
                        System.out.println(arr[c-1][k]);
                        num[t++]=arr[c-1][k];
                    }
                    for (int k = c-1; k >=i; k--) {
                        num[t++]=arr[c][j];
                    }
                   i++;
                    j++;
                    c--;
                    r--;

            }
            System.out.println(num.toString());
        }
    }
}
