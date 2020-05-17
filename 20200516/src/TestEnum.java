import org.omg.IOP.ENCODING_CDR_ENCAPS;

import java.lang.reflect.Constructor;

enum EnumColor{
    RED("红色",1),BLACK("黑色",2),GREEN("绿色",3);

    //枚举类型默认是私有的
    EnumColor(String color,int key){
        this.color=color;
        this.key=key;
    }
    private String color;
    int key;
}

public class TestEnum {
    public static void test1(EnumColor color){
        switch(color){
            case RED:
                System.out.println("红色");
                break;
            case BLACK:
                System.out.println("黑色");
                break;
            case GREEN:
                System.out.println("绿色");
                break;
                default:
                    System.out.println("未知的颜色");
        }
    }
    public static void test2(){
        EnumColor[] colors=EnumColor.values();
        for (int i = 0; i <colors.length ; i++) {
            System.out.println(colors[i]+" "+colors[i].ordinal());
        }
        //将字符串RED转化为枚举类型
        EnumColor red=EnumColor.valueOf("RED");
        System.out.println(red);

        //将字符串YELLOW转化为枚举类型
        // 在进行转换时，如果有对应的枚举类型则转换，否则抛出IllegalArgumentException
//        EnumColor yellow=EnumColor.valueOf("YELLOW");
//        System.out.println(yellow);

 // 注意此处的比较是使用枚举成员的索引来比较了
        System.out.println(red.compareTo(EnumColor.RED));
        System.out.println(red.compareTo(EnumColor.GREEN));
    }
    public static void test3(){
        try {
            Class<?> enumClass = Class.forName("EnumColor");
//            获取构造器
            //注意：自己实现的枚举的构造方法有两个参数，
            // 但是编译器会给用户实现的枚举多增加两个参数：String，int，
            // 实际：自己实现的枚举构造有4个参数
            Constructor<?> enumConstructor=enumClass.getDeclaredConstructor(String.class,int.class,String.class,int.class);
            enumConstructor.setAccessible(true);
            EnumColor red=(EnumColor) enumConstructor.newInstance("红色",1,"基类参数",2);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        int num=1;
//        test1(EnumColor.RED);
//        test2();
        test3();
    }
}
