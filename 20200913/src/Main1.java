import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
         int n=sc.nextInt();
         int m=sc.nextInt();
         int x=0,y=0,a=0,b=0;
         char[][] num=new char[n][m];
        for (int i = 0; i <n ; i++) {
            String s=sc.nextLine();
            for (int j = 0; j <s.length() ; j++) {
                num[i][j]=s.charAt(j);
                if(num[i][j]=='S'){
                    x=i;
                    y=j;
                }
                if(num[i][j]=='E'){
                    a=i;
                    b=j;
                }
            }
        }


    }
    public static String judge(int[][] num,int n,int m,int x,int y,int a,int b){
//        for (int i = 0; i <n ; i++) {
//            for (int j = 0; j <m ; j++) {
                if(a==x){
                    if(y>b){
                        while(y-b>1){
                            if(num[a][y--]=='#'){
                                return "NO";
                            }
                        }
                    }else{
                        while(b-y>1){
                            if(num[a][y++]=='#'){
                                return "NO";
                            }
                        }
                    }
                }

                if(y==b){
                    if(x>a){
                        while(x-a>1){
                            if(num[x--][b]=='#'){
                                return "NO";
                            }
                        }
                    }else{
                        while(a-x>1){
                            if(num[x++][b]=='#'){
                                return "NO";
                            }
                        }
                    }
                }
                if(x>a){
                    if(y>b){

                    }
                }
//            }
//        }
        return  "YES";
    }
}
