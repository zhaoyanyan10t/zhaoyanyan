import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        int count=0;
        int i = 0,j=0;
        while ( i <s1.length()&&j<s2.length()) {
            char ch1=s1.charAt(i);
            char ch2=s1.charAt(j);
                if(ch1==ch2){
                    count++;
                    i++;
                    j++;
                }else if(ch2=='*'){
                    if(s2.charAt(j-1)==s1.charAt(i)){
                        count++;
                        i++;
                    }else{
                        if(s2.charAt(j+1)==s1.charAt(i)){
                            count++;
                            i++;
                            j++;
                        }else{
                            j++;
                        }
                    }
                }
        }
        System.out.println(count);
    }
}
