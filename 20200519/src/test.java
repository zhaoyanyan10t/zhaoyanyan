class Replacement {
    public String replaceSpace(String iniString, int length) {
        // write code here
        String s=iniString.replaceAll(" ","%20");
        return s;
    }
}
class LCA {
    public int getLCA(int a, int b) {
        // write code here
        while(true){
            if(a==b){
                return a;
            }else if(b>a){
                b=b/2;
            }else{
                a=a/2;
            }
        }
    }
}
public class test {
}
