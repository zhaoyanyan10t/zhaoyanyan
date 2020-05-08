import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int group=sc.nextInt();
        while(group>0){
            //输入n，洗牌个数的一半
            int n=sc.nextInt();
            //输入k,洗几次牌
            int k=sc.nextInt();
            //数组 存放牌
            int[] num=new int[2*n];
            //存放更新后的牌
            int[] NN=new int[2*n];
            for (int i = 0; i <2*n ; i++) {
                num[i]=sc.nextInt();
            }
//            如果当前数的位置小于等于n（即在左手），则它下次出现的位置是 2*当前位置-1
//            如果当前位置大于n（即在右手）, 则它下次出现的位置是 2*（当前位置 - n)
            for (int i = 0; i <2*n ; i++) {
                //从1 开始计算位置
                int tmp=i+1;
                //计算k次洗牌后的位置
                for (int j = 0; j <k; j++) {
                    if(tmp<=n){
                        tmp=2*tmp-1;
                    }else{
                        tmp=2*(tmp-n);
                    }
                }
                NN[tmp-1]=num[i];
            }
            for (int i = 0; i <2*n ; i++) {
                if(i==2*n-1){
                    System.out.println(NN[i]);
                }else {
                    System.out.print(NN[i] + "");
                }
            }
            group--;
            System.out.println();
        }
    }
}
