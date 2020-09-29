import java.util.Arrays;

public class test1 {
    public static void main(String[] args) {
        int[] person={3,2,4};
        System.out.println(house(person));
    }
    public static int house (int[] person) {
        // write code here
        int[] arr =new int[person.length];
        for (int i = 0; i < person.length; i++) {
            arr[i]=person[i];
        }
        Arrays.sort(arr);
        int min = 0;
        int tmp = person[0];
        int[] num = new int[person.length];
        for (int i = 0; i < person.length; i++) {
            if (person[i] == arr[0]) {
                min = i;
                num[min] = 1;
                break;
            }
        }
        for (int i = min - 1; i >= 0; i--) {
             if (person[i] > person[i+1]) {
                num[i] = num[i + 1] + 1;
            } else {
                if (num[i + 1] == 1)
                    num[i] = 1;
                else
                    num[i] = num[i + 1] - 1;
            }
        }
        for (int i = min + 1; i < person.length; i++) {
            if (person[i] > person[i - 1]) {
                num[i] = num[i - 1] + 1;
            } else {
                if (num[i - 1] == 1)
                    num[i] = 1;
                else
                    num[i] = num[i - 1] - 1;
            }
        }
        int sum=0;
        for (int i = 0; i < num.length; i++) {
            sum+=num[i];
        }
        return sum;
    }
}
