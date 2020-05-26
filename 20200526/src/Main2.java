import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str=sc.nextLine();
            String[] s1=str.split("_");
            StringBuilder s2=new StringBuilder();
            for (int i = 0; i <s1.length; i++) {
                if(i!=0){
                    String s3=s1[i].substring(0,1).toUpperCase()+s1[i].substring(1);
                    s2.append(s3);
                }else{
                    s2.append(s1[i]);
                }
            }
            System.out.println(s2);
        }
    }
}
