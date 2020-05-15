import java.util.Scanner;

import static java.lang.Math.floor;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static java.lang.StrictMath.acos;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            double x0=sc.nextDouble();
            double y0=sc.nextDouble();
            double z0=sc.nextDouble();
            double x1=sc.nextDouble();
            double y1=sc.nextDouble();
            double z1=sc.nextDouble();
            double r=sqrt(pow(x1-x0,2)+pow(y1-y0,2)+pow(z1-z0,2));
            double S=0.73*acos(-1)*pow(r,3);
            System.out.printf("%.3f"+" "+"%.3f",r,S);
        }
    }
}
