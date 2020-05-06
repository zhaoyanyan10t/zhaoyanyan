import java.util.Scanner;

public class test1{
    private static String[] names;
    private static int[] grades;
    private static void swap(int i, int j) {
        String tempS = names[j];
        int tempG = grades[j];
        names[j] = names[i];
        grades[j] = grades[i];
        names[i] = tempS;
        grades[i] = tempG;
    }

    public static void sort(int flag){
// 降序排列
        if(flag==0){
            for (int i = 0; i <names.length-1; i++)
                for (int j = i+1; j<names.length ; j++) {
                    if(grades[i]>grades[j])
                        swap(i,j);


                }
        }else if(flag==1){
            for (int i = 0; i <names.length-1; i++)
                for (int j = i+1; j<names.length ; j++) {
                    if(grades[i]<grades[j])
                        swap(i,j);
                }
        }
    }
    public static void main(String[] args) {        // TODO Auto-generated method stub       
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            int n = input.nextInt();
            int flag = input.nextInt();
            names = new String[n];
            grades = new int[n];
            for (int i = 0; i < n; i++) {
                names[i] = input.next();
                grades[i] = input.nextInt();
            }
            sort(flag);
            for (int i = 0; i < n; i++) {
                System.out.println(names[i] + " " + grades[i]);
            }
        }
    }
}