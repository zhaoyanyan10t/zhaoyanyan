import java.sql.*;

//import com.mysql.jdbc.Driver;
public class test {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        1.注册Driver
        Class.forName("com.mysql.jdbc.Driver");
//        2.获取连接
//        cmd myqsql -u root -p<数据库密码>
        String url="jdbc:mysql://127.0.0.1:3306/javaboke?useSSL=false";
        String  username="root";
        String password="";
        Connection connection = DriverManager.getConnection(
                url,
                username,
                password
        );
//        3.获取语句statement
        Statement statement=connection.createStatement();
        //4.执行一条SELECT DATABASE()
        String sql="select database()";
        ResultSet resultSet=statement.executeQuery(sql);
        //5.事先知道结果只有一行+一列
        resultSet.next();//调一次next才到第一行
        String name=resultSet.getString(1);
        System.out.println(name);
        //-3.关闭结果集(resultSet)
        resultSet.close();

        sql="select id,username from user order by id";
        resultSet=statement.executeQuery(sql);
        while(resultSet.next()){
            int id=resultSet.getInt(1);
            String user=resultSet.getString(2);
            System.out.println(id+","+user);
        }
        resultSet.close();
        //-2.关闭语句
        statement.close();
//        System.out.println(connection);
//        -1.关闭连接
         connection.close();
    }
}
