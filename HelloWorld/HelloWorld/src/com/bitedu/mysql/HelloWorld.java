package com.bitedu.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class HelloWorld {
    private static String HELLO="niaho ";
    private static long length=1024;
    static
    {
        length=3;
        int i=0;
    }
    public static void main(String[] args) {
        Connection connection=null;
        Statement stmt=null;
        try {
            //加载数据库驱动
            Class.forName("com.mysql.jdbc.Driver");
            //获取一个连接
             connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","");
           //创建语句对象
             stmt=connection.createStatement();
            //执行
    stmt.execute("create database my_jdbc_db");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            try {
                //资源释放
                if (stmt != null) {
                    stmt.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
