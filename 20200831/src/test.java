import java.util.ArrayList;

public class test {
    public ArrayList<String> findCommonString (ArrayList<ArrayList<String>> values) {
        // write code here
        ArrayList<String > list=values.get(0);
//
        ArrayList<String > l=new ArrayList<>();
        for (int i = 0; i <list.size(); i++) {
            int count=0;
            for (int j = 0; j <values.size(); j++) {
                if(!values.get(j).contains(list.get(i))){
                    break;
                }else{
                    count++;
                }
            }
            if(count==values.size()){
                l.add(list.get(i));
            }

        }
        return l;
    }
}
