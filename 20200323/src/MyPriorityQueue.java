
public class MyPriorityQueue {
    private int[] array;
//    private int size;//表示优先级队列中有效元素的个数

    public MyPriorityQueue(){
        //默认的构造----将其第层容量设置为11
        array=new int[11];
//        size=0;
    }
    public MyPriorityQueue(int initcapacity){
        if(initcapacity<1){
            //标准库：跑出一个非法参数的异常
            initcapacity=11;
        }
        array=new int[initcapacity];
//        size=0;
    }
    //标准库中没有该接口，标准库中可以采用集合来构造优先级队列
    public MyPriorityQueue(int[] arr){
        array=new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            array[i]=arr[i];
        }
        //将arr中的元素调整，让其满足小堆的性质
        //找到倒数第一个非叶子结点
        int lastLeaf=(array.length-2)>>1;
        for (int root = lastLeaf; root >=0 ; root--) {
            shiftDown(root);
        }
    }
    //parent表示本次需要调整的节点的小标
    //调整以parent为根的二叉树
    //注意：调整之前，一定要保证parent的左右子树已经满足小堆的性质
    //如果要检测parent是否满足小堆的性质，只需要使用parent与其孩子进行比较
    //满足小堆性质 说明以parent为跟的二叉树已经是小堆
    //不满足小堆性质  说明parent比其孩子大，此时需要将parent与其娇小的孩子进行交换
//                  交换完以后，parent较大的元素向下移动，可能导致其子树下不满足小堆性质
//                   需要继续调整其子树
    //
    private void shiftDown(int parent){
        //使用child标记parent的较小的孩子
        //默认情况下先让其标记左孩子，因为parent可能有所孩子但没有右孩子
        int child=parent*2+1;
        int size= array.length;
        while(child<size){
            //找parent中较小的孩子
            //再用左右孩子比较式，必须保证右孩子存在---while条件已经保证左孩子存在
            if(child+1<size&&array[child+1]<array[child]){
                child+=1;
            }

            //检测娇小的孩子是否比双亲小
            if(array[child]<array[parent]){
                //说明parent不满足小堆的性质，将parent与child进行交换
                swap(parent,child);
                //parent较大 的元素向下移动可能会导致子树不满足堆的性质
                //继续向下调整
                parent=child;
                child=parent*2+1;
            }else{
                //以parent为根的二叉树已经满足堆的性质
                return;
            }
        }
    }
    private void swap(int parent,int child){
        int tmp=array[parent];
        array[parent]=array[child];
        array[child]=tmp;
    }

    public static void main(String[] args) {
        int array[]={5,3,7,1,4,6,8,0,2};
        MyPriorityQueue mp=new MyPriorityQueue(array);
    }
}
