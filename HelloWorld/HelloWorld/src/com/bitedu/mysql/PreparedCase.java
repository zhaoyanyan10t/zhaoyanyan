package com.bitedu.mysql;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import org.omg.CORBA.PRIVATE_MEMBER;

import javax.sql.DataSource;

import java.rmi.StubNotFoundException;
import java.sql.*;

import static com.bitedu.mysql.InsertCase.getDataSourse;

public class PreparedCase {
    private final static String URL="jdbc:mysql://localhost/my_jdbc_db";
    private final static  String USER="root";
    private final static  String PASSWORD="";
    //final不可修改

    static {
        //db.properties
    }
    public static DataSource getDataSourse(){
        MysqlDataSource dataSource=new MysqlDataSource();
        dataSource.setURL(URL);
        dataSource.setUser(USER);
        dataSource.setPassword(PASSWORD);

        return dataSource;
    }

    public static void createTable(){
        DataSource dataSource=getDataSourse();
        Connection connection=null;
        Statement stmt=null;

        try {
            //获取连接
            connection=dataSource.getConnection();
            //建表语句
            String sql="create table student(" +
                    "name varchar(20) not null,"+
                    "sn int primary key,"+
                    "height double(5,2)" +
                    ")";
            //打印出来，看出错误
            System.out.println("sql="+sql);

            stmt=connection.createStatement();
            stmt.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //释放资源
            //创建顺序要和释放顺序反着来
            try {
                if(stmt!=null){
                    stmt.close();
                }
                if(connection!=null){
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static class Student{
        String name;
        int sn;
        int height;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getSn() {
            return sn;
        }

        public void setSn(int sn) {
            this.sn = sn;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }
    }
    public static void insertTable(Student stu){
        DataSource dataSource=getDataSourse();
        Connection connection=null;
        PreparedStatement stmt=null;

        try {
            //获取连接
            connection=dataSource.getConnection();
            //建表语句
//            String sql="insert into student values (" +
//                    "'lily'," +
//                    "20190001," +
//                    "177" +
//                    ")";
            String sql="insert into student values (?,?,?)";
            //打印出来，看出错误
            System.out.println("sql="+sql);

//            stmt=connection.createStatement();
            stmt=connection.prepareStatement(sql);
            //在语句创建出来给值
            stmt.setString(1,stu.getName());
            stmt.setInt(2,stu.getSn());
            stmt.setInt(3,stu.getHeight());
//            stmt.execute(sql);
            stmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //释放资源
            //创建顺序要和释放顺序反着来
            try {
                if(stmt!=null){
                    stmt.close();
                }
                if(connection!=null){
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static  void selectData(int sn){
        DataSource dataSource=getDataSourse();
        Connection connection=null;
        PreparedStatement stmt=null;
        ResultSet rs=null;
        try {
            //获取连接
            connection=dataSource.getConnection();
            //建表语句
//            String sql="insert into student values (" +
//                    "'lily'," +
//                    "20190001," +
//                    "177" +
//                    ")";
            String sql="select *from student where sn=?";
            //打印出来，看出错误
            System.out.println("sql="+sql);

//            stmt=connection.createStatement();
            stmt=connection.prepareStatement(sql);
            //在语句创建出来给值
            stmt.setInt(1,sn);//和占位符位置一样

//            stmt.execute(sql);
            rs=stmt.executeQuery();
            while(rs.next()){
                System.out.println("name="+rs.getString("name")+
                                ",sn="+rs.getInt("sn")+
                                ",height="+rs.getInt("height"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //释放资源
            //创建顺序要和释放顺序反着来
            try {
                if(rs!=null){
                    rs.close();
                }
                if(stmt!=null){
                    stmt.close();
                }
                if(connection!=null){
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
//        createTable();
        Student stu=new Student();
        stu.setHeight(170);
        stu.setName("lily");
        stu.setSn(201900004);
        insertTable(stu);

        selectData(20190003);
    }
}
