import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret=new ArrayList<>();
        for (int i = 0; i <numRows; i++) {
            List<Integer> Row=new ArrayList<>();
            //设置当前Row行的数据
            for (int j = 0; j <=i; j++) {
                if(j==0||i==j){
                    //在使用set(index,element)向ArrayList中设置元素时，index必须在size（）范围内，（不能越界）
//                    Row.set(j,1);//Row行的满足j==0或者j==i的值都设置为1
                Row.add(1);
                }else{
//                    Row.set(j,0);
                    Row.add(0);
                }
            }
            ret.add(Row);
        }
        //设置其他位置的数据
        for (int i = 2; i <numRows ; i++) {
            //当前行
            List<Integer> cur=ret.get(i);
                    //前一行
            List<Integer> pre=ret.get(i-1);
            for (int j = 1; j <i ; j++) {
                cur.set(j,pre.get(j)+pre.get(j-1));
            }
        }
     return ret;
    }
}
public class test {
    public static void main(String[] args) {



//        List<Integer> l1=new ArrayList<>();
//        l1.add(1);
//        System.out.println(l1);
//        List<Integer> l2=new ArrayList<>();
//        List<List<Integer>> l=new ArrayList<>();
//        l.add(l1);
//        l.add(l2);
//        System.out.println(l);


//        Integer i1=100;
//        Integer i2=100;
//        Integer i3=2000;
//        Integer i4=2000;
//        System.out.println(i1==i2);//比的是地址
//        System.out.println(i3==i4);
//        //Integer：-128,-127，...0,1,...127
//        //i如果在low华为high范围内，找到对应的对象直接返回，如果不在，return new Integer（i)
//        //i1和i2只想同一个对象地址相同，
//        //i3和i4都是new了一个新对象，地址不相同
//        Integer e=Integer.valueOf(100);
//        Integer e1=Integer.valueOf(1000);

//        ArrayList<Integer> l=new ArrayList<>();
//        l.add(1);
//        System.out.println(l);
//        int i=20;
//        Integer ii=i;//自动装箱 编译器在编译阶段会使用i构造一个包装类型的对象
//        System.out.println(ii);
//        Integer i2=Integer.valueOf(i);//装箱；将基础类型定义的变量转化为对应的包装类型
//        System.out.println(i2);
//        int i3=i2.intValue();//拆箱，将包装类对象中的对象拿出来
//        System.out.println(i3);
//        int i4=ii;//自动拆箱 将包装类型的对象直接赋值给对应的基础类型变量
//        System.out.println(i4);

        //        Map<String,String > m=new HashMap<>();
//        System.out.println(m.size());
//        System.out.println(m.get("作者"));
//        System.out.println(m.getOrDefault("作者", "tt"));
//        System.out.println(m.containsKey("作者"));
//        System.out.println(m.containsValue("佚名"));
//        m.put("h","o");
//        m.put("k","l");
//        System.out.println(m.size());
//        System.out.println(m);
//        System.out.println(m.get("h"));
//        System.out.println(m.getOrDefault("h","o"));
//        System.out.println(m.getOrDefault("h","qqq"));
//        System.out.println(m.containsKey("h"));
//        System.out.println(m.containsValue("o"));
//        for(Map.Entry<String ,String >entry:m.entrySet()){
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//        }


//        Collection<String> s=new ArrayList<>();
//        System.out.println(s.size());
//        s.add("ww");
//        s.add("shu");
//        System.out.println(s.size());
//        System.out.println(s);
//        s.remove("ww");
//        System.out.println(s.size());
//        System.out.println(s);
    }
}
