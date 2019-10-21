import java.util.Scanner;

public class test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count=3;
        while(count!=0){
            System.out.println("请输入password:");
            String password=sc.nextLine();
            if("123456".equals(password)){
                System.out.println("登陆成功");
                break;
            }
            else{
                count--;
                System.out.printf("你还有%d次机会",count);

            }
        }sc.close();
    }
}
