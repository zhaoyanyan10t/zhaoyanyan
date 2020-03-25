import java.util.Comparator;
import java.util.Objects;
import java.util.PriorityQueue;

//class Card {
////    public int rank;    // 数值
////    public String suit; // 花色
////
////    public Card(int rank, String suit) {
////        this.rank = rank;
////        this.suit = suit;
////    }
////
////    @Override
////    public boolean equals(Object o) {
////        //自己和自己比较
////        if (this == o)
////            return true;
////        //o如果是null对象或者o不是Card的子类
////        if (o == null || o instanceof Card)
////            return false;
////        //注意基本类型可以直接比较，但引用类型最好调用其equals方法
////        Card card = (Card) o;
////        return rank == card.rank &&
////                suit.equals(card.suit);
////    }
////}


//class Card implements Comparable<Card> {
//    public int rank;    // 数值
//    public String suit; // 花色
//
//    public Card(int rank, String suit) {
//        this.rank = rank;
//        this.suit = suit;
//    }
//    // 根据数值比较，不管花色
//    // 这里我们认为 null 是最小的
//    public int compareTo(Card o){
//        //牌面值
//        return rank-o.rank;
//    }
//}


//class Card{
//    public int rank;    // 数值
//    public String suit; // 花色
//
//    public Card(int rank, String suit) {
//        this.rank = rank;
//        this.suit = suit;
//    }
//
//}
////基于比较器的比较
//class CardComp implements Comparator<Card> {
//    @Override
//    public int compare(Card o1, Card o2) {
//        if(o1==o2){
//            return 0;
//        }
//        if(o1==null){
//            return -1;
//        }
//        if(o2==null){
//            return 1;
//        }
//        return o1.rank-o2.rank;
//    }
//}


class Card implements Comparable<Card>{
    public int rank;    // 数值
    public String suit; // 花色

    public Card(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }
    public int compareTo(Card o){
//        //牌面值
        return rank-o.rank;
    }
    @Override
    public boolean equals(Object o) {
        //自己和自己比较
        if (this == o)
            return true;
        //o如果是null对象或者o不是Card的子类
        if (o == null || o instanceof Card)
            return false;
        //注意基本类型可以直接比较，但引用类型最好调用其equals方法
        Card card = (Card) o;
        return rank == card.rank &&
                suit.equals(card.suit);
    }
}
//基于比较器的比较
class CardComp implements Comparator<Card> {
    @Override
    public int compare(Card o1, Card o2) {
        if(o1==o2){
            return 0;
        }
        if(o1==null){
            return -1;
        }
        if(o2==null){
            return 1;
        }
        return o1.rank-o2.rank;
    }
}
public class test {
    public static void TestPriorityQueue() {
        PriorityQueue<Card> p = new PriorityQueue<>();
        p.offer(new Card(1, "♠"));
        p.offer(new Card(2, "♠"));
    }
     public static void TestCompare(){
         int a = 10;
         int b = 20;
         System.out.println(a > b);
         System.out.println(a < b);
         System.out.println(a == b);

         char c1 = 'A';
         char c2 = 'B';
         System.out.println(c1 > c2);
         System.out.println(c1 < c2);
         System.out.println(c1 == c2);

         boolean b1 = true;
         boolean b2 = false;
         System.out.println(b1 == b2);
         System.out.println(b1 != b2);
     }
     public static void TestCompare2(){
         Card c1 = new Card(1, "♠");
         Card c2 = new Card(2, "♠");
         Card c3 = c1;
         Card c4 = new Card(1, "♠");
//         System.out.println(c1 > c2);   // 编译报错
         System.out.println(c1 == c2);//false
         System.out.println(c1 == c3);//true
         System.out.println(c1 == c4);//false
         System.out.println(c1.compareTo(c2));
     }
    public static void TestCompare3(){
        Card c1 = new Card(1, "♠");
         Card c2 = new Card(2, "♠");
         Card c3 = c1;
         Card c4 = new Card(1, "♠");
         //如果要比较，先要给一个比较器对象
         CardComp comp=new CardComp();
        System.out.println(comp.compare(c1,c2));
    }
    public static void TestPriorityQueue4(){
        Card c1 = new Card(5, "♠");
        Card c2 = new Card(2, "♠");
        Card c3= new Card(1, "♠");
        Card c4= new Card(3, "♠");
        PriorityQueue<Card> p=new PriorityQueue<>(4);
        p.offer(c1);
        p.offer(c2);
        p.offer(c3);
        p.offer(c4);
    }
    public static void main(String[] args) {
//        TestPriorityQueue();
//        TestCompare();
//        TestCompare2();
//        TestCompare3();
        TestPriorityQueue4();
    }
}
