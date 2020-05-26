import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str=sc.nextLine();
            String[] s1=str.split("[^a-zA-Z]+");
            StringBuilder s2=new StringBuilder();
            for (int i = s1.length-1; i >=0; i--) {

                if(i==0){
                    s2.append(s1[i]);
                }else{
                    s2.append(s1[i]+" ");
                }
            }
            System.out.println(s2);
        }
    }
}
