//哈希桶--数组+链表实现的----》可以帮助用户快速定位要将元素插入到那个链表来组织链表
//数组中存储的元素实际为节点的引用。
public class HashBucket {
    public static class Node{
        int key;
        int value;
        Node next;
        Node(int key,int value){
            this.key=key;
            this.value=value;
            next=null;
        }
    }

    //哈希桶中的成员数据
    Node[] table;
    int capatity;//表格容量，痛的个数
    int size;//有效元素的个数
    double loadFact=0.75;//装载因子
    public HashBucket(int initCap){
        //保证哈希桶初始的容量至少为10 个
        capatity=initCap;
        if(initCap<10){
            capatity=10;
        }
        table=new Node[capatity];
        size=0;
    }

    public int put(int key,int value){
        resize();
        //1.通过哈希函数，计算key所在的桶号。
        int buckedNo=hashFunc(key);
        //2. 在当前桶中检测key是否存在
        // 检测方式：遍历链表。
        Node cur= table[buckedNo];
        while(cur!=null){
            if(cur.key==key){
                int oldValue=cur.value;
                cur.value=value;
                return oldValue;
            }
            cur=cur.next;
        }
        //3.key不存在，将key value 插入到哈希桶中
        cur=new Node(key,value);
        cur.next=table[buckedNo];
        table[buckedNo]=cur;
        size++;
        return value;
     }

     //将哈希桶中为key的键值对删除
     public boolean remove(int key){
        //1.通过哈希函数计算key的桶号
         int bucketNo=hashFunc(key);
         //2. 在bucketNo桶中找key所对应的节点
         //找到后删除该节点
         Node cur=table[bucketNo];
         Node prev=null;
         while(cur!=null){
             if(cur.key==key){
//                 找到
                 //
                 if(prev==null){
                     //删除的结点刚好是头
                     table[bucketNo]=cur.next;
                 }else{
                     prev.next=cur.next;
                 }
                 --size;
                 return true;
             }else{
                 prev=cur;
                 cur=cur.next;
             }
         }
         return false;
     }
     //包含结点
      //时间复杂度O(1)
    public boolean containsKey(int key){
        //1.计算key的桶号
        int bucketNo=hashFunc(key);
        //2. 在桶中找key
        Node cur=table[bucketNo];
        while(cur!=null){
            if(cur.key==key){
                return true;
            }
            cur=cur.next;
        }
        return false;
    }
    //找value 时间复杂度O(N) 集体遍历一遍
    public boolean containsValue(int value){
        //哈希桶中是根据key来计算哈希地址的
//        因此，找value，不能计算出value在那个桶中
//                在value时，必须要遍历所有的桶
        for (int bucketNo = 0; bucketNo <capatity ; bucketNo++) {
            Node cur=table[bucketNo];
            while(cur!=null){
                if(cur.value==value){
                    return true;
                }
                cur=cur.next;
            }
        }
        return false;
    }
    //有多少元素
    public int size(){
        return size;
    }
    //看哈希表是不是为空
    public boolean empty(){
        return 0==size;
    }
    private void resize(){
        //装载因子超过0.75 时，进行扩容，按照两倍的方式进行扩容。
        if(size*10/capatity>loadFact*10){
            int newCap=capatity*2;
            Node[] newTable=new Node[newCap];
            //将table中的结点搬移到newTable中
            for (int i = 0; i < capatity; i++) {
                Node cur=table[i];
                //将table中的i号桶所对应链表中 所有结点插入到newTable中
                while(null!=cur){
                    table[i]=cur.next;
                    //将cur结点插入到newTable中
                    //计算cur在newTable中的桶号
//                    int bucketNo=hashFunc(cur.key);这种方式不行，hashFunc里面用的是旧 容量
                    int bucketNO=cur.key%newCap;
                    //2.将cur插入到newTable中
                    cur.next=newTable[bucketNO];
                    newTable[bucketNO]=cur;
                    //取table中的i号桶的下一个节点
                    cur=table[i];
                }
            }
            table=newTable;
            capatity=newCap;
        }
    }
    private int hashFunc(int key){
        return key%capatity;
    }
public void Print(){
    for (int bucketNO = 0; bucketNO < capatity; bucketNO++) {
        System.out.printf("table[%d]",bucketNO);
        Node cur=table[bucketNO];
        while(null!=cur){
            System.out.print("["+cur.key+","+cur.value+"]");
            cur=cur.next;
        }
        System.out.println();
    }
}
    public static void main(String[] args) {
        HashBucket ht=new HashBucket(5);
        ht.put(1,1);
        ht.put(11,11);
        ht.put(2,2);
        ht.put(22,22);
        ht.put(33,33);
        ht.put(3,3);
        ht.put(44,44);
        ht.put(15,15);
        System.out.println(ht.size());
        ht.Print();
        ht.put(14,14);
        ht.Print();

        System.out.println(ht.containsKey(5));
        System.out.println(ht.containsValue(14));

        ht.remove(2);
        System.out.println(ht.containsKey(2));
    }
}
