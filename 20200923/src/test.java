public class test {
    public static int indexOf (String s, String pattern) {
        // write code here
        int t=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            boolean judge=true;
            if(ch==pattern.charAt(t)){
                for (int j = 0; j <pattern.length() ; j++) {
                    if(s.charAt(i++)!=pattern.charAt(j)){
                        judge=false;
                    }
                }
                if(judge){
                    return i;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {

    }
}
