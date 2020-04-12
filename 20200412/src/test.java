import java.util.Arrays;

class Person {
    String name = "No name";
    public Person(String nm) {
        name = nm;
    }
}
class Employee extends Person {
    String empID = "0000";
    public Employee(String id) {
        super(id);
        empID = id;
    }
}
public  class test {

    public static void main(String[] args) {
        int[] array={9,3,2,1,6,4,3,0,7,5,3,2,8,0};
        int[] tmp=new int[10];
        for (int i = 0; i <array.length ; i++) {
            int t=array[i];
            tmp[t]++;
        }
        for (int i = 0; i <tmp.length ; i++) {
            System.out.print(i+":"+tmp[i]);
        }
        Arrays.sort(array);
        for (int e:array) {
            System.out.println(e);
        }
    }
    public static void main4(String[] args) {
        String str="100311";
        int[] arr=new int[10];
        for (int i = 0; i < str.length(); i++) {
            int t=str.charAt(i)-'0';
            arr[t]++;
        }
        for (int i = 0; i <arr.length ; i++) {
                System.out.println(i+" "+arr[i]);

        }
    }
    public static void main3(String[] args) {
        Object o = new Object() {
            public boolean equals(Object obj) {
                return true;
            }
        };
        System.out.println(o.equals("Fred"));
//        byte b1=1,b2=2,b3,b6;
//        final byte b4=4,b5=6;
//        b6=b4+b5;
//        b3= (byte) (b1+b2);
//        System.out.println(b3+b6);

    }
//    public final static int w() ;
//    public final double hyperbolicCosine() {
//        return 0;
//    }

    public static void main2(String[] args) {
        try{
        int i = 100 / 0;
        System.out.print(i);
    }catch(Exception e){
        System.out.print(1);
//        throw new RuntimeException();
    }finally{
        System.out.print(2);
    }
System.out.print(3);
}

    public static void main1(String[] args) {
        String x="fmn";
        x.toUpperCase();
        String y=x.replace('f','F');
        y=y+"wxy";
        System.out.println(y);
    }
}
