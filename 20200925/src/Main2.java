import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Sheep{
    public int age=0;
}
public class Main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        int n=sc.nextInt();//多少年
        System.out.println(judge(n,n1,n2,n3));
    }
    public static int judge(int n,int n1,int n2,int n3){
        ArrayList<Sheep>  sheep=new ArrayList<>();
        sheep.add(new Sheep());
        List<Sheep> addsheep=new ArrayList<>();
        List<Sheep> removesheep=new ArrayList<>();
        for (int i = 1; i <=n ; i++) {
            for(Sheep s:sheep){
                s.age++;
                if(s.age==n1||s.age==n2){
                    addsheep.add(new Sheep());
                }else if(s.age==n3){
                     removesheep.add(s);
                }
            }
            sheep.addAll(addsheep);
            sheep.removeAll(removesheep);
            addsheep.clear();
            removesheep.clear();
        }
        return sheep.size();
    }
}
