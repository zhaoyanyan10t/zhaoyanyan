public class test {
    public static boolean isNUmber(String str){
        for (int i = 0; i <str.length() ; i++) {
            if((str.charAt(i)>='0')&&(str.charAt(i)<='9')){
                return false;
            }
        }
       return true;
//
//        for (int i = 0; i <str.length() ; i++) {
//            if((str.charAt(i)<'0')||(str.charAt(i)>'9')){
//                return false;
//            }
//        }
//        return true;

    }
    public static void main(String[] args) {
        String str="dfa";
        System.out.println(isNUmber(str));


        //        String str = "hello" ;
//        for(int x = 0; x < 1000; x++) {
//            str += x ;
//        }
//        System.out.println(str);

//        String str="Hello";
//        String r="";
//        str+="jj";


//        for (int i = 0; i <str.length() ; i++) {
//            char c=str.charAt(i);
//            if(c>='A'&&c<='Z'){
//                c+=32;
//            }
////            if(c>=65&&c<=90){
////                c+=32;
////            }
//            r+=c;
//        }
//        System.out.println(str);
    }
}
