import java.util.*;
public class Main3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Queue<Character> queue=new LinkedList<>();

        int error1=0;
        int error2=0;

        int num=sc.nextInt();

        while(true){
            String str=sc.next();
            if(str.equals("END")){
                break;
            }
            if(str.charAt(0)=='P') {
                String str1 = sc.next();
                if(queue.size()<num-1){
                    queue.offer(str1.charAt(0));

                }else{
                    error1++;
                }
            }else if(str.charAt(0)=='D'){
                if(!queue.isEmpty()){
                    queue.poll();
                }else{
                    error2++;
                }
            }

        }
        System.out.println(error1);
        System.out.println(error2);
        while(!queue.isEmpty()){
            System.out.print(queue.poll());
        }
    }
}
          
      