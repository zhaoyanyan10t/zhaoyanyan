class Solution {
    public void reverseString(char[] s) {
        for (int i = 0; i < (s.length)/2; i++) {
            int j=s.length-1-i;
            char tmp=s[i];
            s[i]=s[j];
            s[j]=tmp;
        }
        System.out.println(s);
    }
}
public class test {
    public static void main(String[] args) {
        char[] r={'a','b',
                'd','e','f'};
        Solution solution=new Solution();
        solution.reverseString(r);
    }
}
