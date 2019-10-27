import java.net.SocketTimeoutException;
import java.sql.SQLOutput;

class MyArrayList {
    public int usedSize;
    public int[] elem;

    public final int CAPACITY = 10;

    public MyArrayList() {
        this.usedSize = 0;
        this.elem = new int[CAPACITY];
    }
    private boolean isFull(){
        if(this.usedSize==this.elem.length){
            return true;
        }
        return false;
    }
    private boolean empty(){
        if(this.usedSize==0){
            return true;
        }
        return false;
    }
    // 在 pos 位置新增元素
    public void add(int pos, int data) {
        if(isFull()){
            int[] array = new int[2*CAPACITY];
            System.arraycopy(elem,0,array,0,usedSize);
            this.elem = array;
        }
        //1、pos是否合法
        if(pos<0||pos>this.usedSize){
            System.out.println("不合法");
            return ;
        }
        //2、挪数据
        for (int i = this.usedSize-1; i>=pos ; i--) {
            this.elem[i+1]=this.elem[i];
        }
        //3、插入数据
        this.elem[pos]=data;
        //4、usedSize++
        usedSize++;
    }
    // 判定是否包含某个元素
    public boolean contains(int toFind) {
        for (int i = 0; i <this.usedSize; i++) {
            if(toFind==this.elem[i]){
                return true;
            }
        }
       return false;
    }
    // 查找某个元素对应的位置
    public int search(int toFind) {
        for (int i = 0; i <this.usedSize ; i++) {
            if(toFind==this.elem[i]){
                return i;
            }
        }
        return -1; }
    // 获取 pos 位置的元素
    public int getPos(int pos) {
        if(pos<0||pos>this.usedSize){
            return -1;
        }
        return this.elem[pos]; }
    // 给 pos 位置的元素设为 value
    public void setPos(int pos, int value) { }
    //删除第一次出现的关键字key
    public void remove(int toRemove) {
        if(empty()){
            System.out.println();
            return ;
        }
        int index=search(toRemove);
       if(index==-1){
            return ;
       }
        for (int i =index; i <this.usedSize-1 ; i++) {
            this.elem[i]=this.elem[i+1];
        }
        this.usedSize--;
    }
    // 获取顺序表长度
    public int size() { return 0; }
    // 清空顺序表
    public void clear() { }
    // 打印顺序表
    public void display() {
        for (int i = 0; i <this.usedSize; i++) {
            System.out.print(this.elem[i]+" ");
        }
    }
}
public class test {
    public static void main(String[] args) {
        MyArrayList myArrayList=new MyArrayList();
        myArrayList.add(0,1);
        myArrayList.add(0,2);
        myArrayList.add(0,3);
        myArrayList.add(1,4);
        myArrayList.add(0,5);
        myArrayList.display();
    }

}
