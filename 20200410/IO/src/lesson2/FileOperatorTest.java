package lesson2;

import org.junit.Test;

import java.io.*;

public class FileOperatorTest {

//    public static void main(String[] args)throws Exception {

//按照字符读取
//    @Test
////    public void fileRead_1() throws Exception {
//////        创建文件的输入流进行文件的本地读取操作
////        FileInputStream fis=new FileInputStream(
////                new File("D:\\code\\javacode\\20200410\\IO\\res\\info.txt"));
//////        文件读取
//////        缓冲流  缓冲的字符流
////        BufferedReader br=new BufferedReader(new InputStreamReader(fis,"UTF-8"));
//////        String line;
//////        while((line=br.readLine())!=null){
//////            System.out.println(line);
//////        }
////
////        char[] chars=new char[1024];
////        int len;
//////        off是偏移量  len是读取多长的
////        while((len=br.read(chars,0,1024))!=-1){
////            String str=new String(chars,0,len);
////            System.out.println(str);
////        }

//    while((len=br.read(chars))!=-1){
//        String str=new String(chars,0,len);
//        System.out.println(str);
//    }
////    }
////
////
//////按照字节读取
////    @Test
////    public void fileRead_2() throws Exception {
////        FileInputStream fis=new FileInputStream(
////                new File("D:\\code\\javacode\\20200410\\IO\\res\\info.txt"));
////        byte[] bytes=new byte[1024];
////        int len;
//////        while((len=fis.read(bytes,0,1024))!=-1){
//////            String str=new String(bytes,0,len);
//////            System.out.println(str);
//////        }
////        while((len=fis.read(bytes))!=-1){
////            String str=new String(bytes,0,len);
////            System.out.println(str);
////        }
////    }



//    写操作
//    按照字符输出
//      缓冲
    @Test
    public void testWrite1()throws Exception {
        FileOutputStream fos=new FileOutputStream(
                new File("D:\\code\\javacode\\20200410\\IO\\res\\info.txt"));
        BufferedWriter br=new BufferedWriter(new OutputStreamWriter(fos));
//        使用缓冲流输出的时候，要进行flush刷新缓冲区，否则不会真是输出数据到目的设备
        br.write("1,aa\n");//write写数据到系统内存缓冲区
        br.write("2.bb\n");
        br.write("3,cc");
        br.flush();//缓冲区刷新，发送数据到目的设备
    }

//    复制本地文件到另一个地方

//    缓冲
//    字符
    @Test
    public void copyFile() throws Exception {
        FileInputStream fis=null;
        BufferedInputStream bis=null;
        FileOutputStream fos=null;
        BufferedOutputStream bos=null;
        try {
            fis=new FileInputStream(
                    new File("D:\\code\\javacode\\20200410\\IO\\res\\info.txt"));
            bis=new BufferedInputStream(fis);
            fos=new FileOutputStream(
                    new File("D:\\code\\javacode\\20200410\\IO\\res\\info1.txt"));
            bos=new BufferedOutputStream(fos);
            byte[] bytes=new byte[1024];
            int len;
//        off是偏移量  len是读取多长的
            while((len=fis.read(bytes))!=-1){
                bos.write(bytes);
                bos.flush();
            }
        } finally {
//IO流的操作完成之后，一定要释放资源，顺序是根据依赖关系（B依赖A，先释放B），返向释放
            if(bis!=null)
                bis.close();
            if(fis!=null)
                bis.close();
            if(bos!=null)
                bis.close();
            if(fos!=null)
                bis.close();
        }
    }



//    BufferedInputStream bis=new BufferedInputStream(new FileInputStream(
//            new File("D:\\code\\javacode\\20200410\\IO\\res\\info.txt")));
//    BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(
//            new File("D:\\code\\javacode\\20200410\\IO\\res\\info1.txt")));
//
//    byte[] bytes=new byte[1024];
//    int len;
////        off是偏移量  len是读取多长的
//        while((len=bis.read(bytes))!=-1){
//        bos.write(bytes);
//        bos.flush();
//    }
//}




////字节
    @Test
    public void Copy2()throws Exception {
        FileInputStream fin = new FileInputStream("D:\\code\\javacode\\20200410\\IO\\res\\info.txt");
        FileOutputStream fout = new FileOutputStream("D:\\code\\javacode\\20200410\\IO\\res\\info1.txt");
        int len = 0;
        byte[] buff = new byte[1024];
        while ((len = fin.read(buff)) != -1) {
            fout.write(buff, 0, len);
        }
    }
}
