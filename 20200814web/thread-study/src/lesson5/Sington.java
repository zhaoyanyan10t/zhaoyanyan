package lesson5;

public class Sington {

    public Sington(){

    }

    //饿汉式
//    private static Sington SINGTON=new Sington();
//    public static Sington getInstance(){
//        return SINGTON;
//    }

    //懒汉式
    private static  Sington SINGTON=null;
    public static Sington getInstance(){
        if(SINGTON==null)
            SINGTON=new Sington();
        return SINGTON;
    }

}


