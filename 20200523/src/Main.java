import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()) {
            int year = sc.nextInt();
            int month = sc.nextInt();
            int day = sc.nextInt();
            System.out.println(getOutDay(year, month, day));
        }
    }
    public static int getOutDay(int year,int month,int day){
        int[] days={31,28,31,30,31,30,31,31,30,31,30,31};
        if(year<=0||month<=0||month>12||day<=0||day>days[month-1]){
            return -1;
        }
        //看是否为闰年
        int count=0;
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            days[1] = 29 ;
        }
        for (int i = 0; i <month-1 ; i++) {
            count+=days[i];
        }
        count=count+day;
        return count;
    }
}
