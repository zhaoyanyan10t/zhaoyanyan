public class test {
//    private String arr[]={"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
//    private String arr1[]={"元","拾","佰","仟","万","亿"};
//    private String arr2[]={"角","分","厘"};
//
//    public String toChinese (String str) {
//        // write code here
//        int n=0;
//        if(str.contains(".")) {
//            String[] s= str.split(".");
//            n=s.length;
//            if(s[0].length()>16){
//                return "超出计算能力";
//            }
//        }
//        if(n==0){
//            if(str.length()>16){
//                return "超出计算能力";
//            }
//        }
//
//    }
    public int[] productExceptSelf (int[] nums) {
        // write code here
        int re=1;
        for (int i = 0; i <nums.length; i++) {
            re*=nums[i];
        }
        int[] arr=new int[nums.length];
        for (int i = 0; i <nums.length ; i++) {
            arr[i]=re/nums[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        String str="You're a student";
        String[] arr=str.split(" ");
        StringBuffer s=new StringBuffer();

        for(int i=0;i<arr.length;i++){

        }
        }
}
