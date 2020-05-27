import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            String [] num=new String[n];
            for (int i = 0; i <n; i++) {
                num[i]=sc.next();
            }
            String str=sc.next();
            int index=sc.nextInt();
//            char[] s=str.toCharArray();
            //count计算一共多少个兄弟
            int count=0;
            ArrayList<String> list=new ArrayList<>();
            for (int i = 0; i <n ; i++) {
                //检查num[i]和str是不是兄弟。
                int c=check(str,num[i]);
                count+=c;
                //如果是兄弟，就把num[i]放进list中,为了之后方便查找指定序列的兄弟单词。
                if(c==1){
                    list.add(num[i]);
                }

            }
            System.out.print(count);
            Collections.sort(list);
            if(count>index)
            System.out.println(" "+list.get(index-1));
        }
    }
    public static int check(String str,String word){
        //如果str和word 相等或者他俩的长度不相等，则不是兄弟。
        if(str.equals(word)||str.length()!=word.length()){
            return 0;
        }
        char[] s=str.toCharArray();
        Arrays.sort(s);
        char[] w=word.toCharArray();
        Arrays.sort(w);
        if(Arrays.equals(s, w)){
            return 1;
        }else{
            return 0;
        }
    }
}
