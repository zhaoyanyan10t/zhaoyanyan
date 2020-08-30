 class parent {
    public int c=100;
    public String name;
    public parent(int c){
        this.c=c;
        print();
    }
    public void print(){
        System.out.println("parent c="+c+",parent="+name);
    }

     public static void main(String[] args) {
         new child(200);
     }
}
class child extends parent{
    public child(int c){
    super(c);
}
    @Override
    public void print() {
        System.out.println("child c="+c+",parent="+name);
    }


}
