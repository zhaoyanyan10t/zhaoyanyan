import com.mysql.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class test {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://127.0.0.1:3306/class?useSSL=false&characterEncoding=utf8";
        String user="root";//连接数据库的用户名
        String password="";//链接MySQL的密码
        Connection connection =DriverManager.getConnection(url,user,password);

        //一个Statement 只能用一个语句，用完就得关闭
        //插入一些数据，供select使用
        {
            Statement statement = connection.createStatement();
            String sql = "insert into user(id,name) values(1,'zhao'),(2,'yan'),(3,'er')";
            statement.executeUpdate(sql);//通过statement对象来执行SQL语句
            statement.close();
        }

        //执行select语句
        {
            Statement statement = connection.createStatement();
            String sql = "select id,name from user";
            ResultSet resultSet = statement.executeQuery(sql);
            List<String> nameList=new ArrayList<>();
            while (resultSet.next()) {
//                //不同的类型调用不同的方法
//                resultSet.getInt();
//                resultSet.getLong();
//                resultSet.getString();

//                int id=resultSet.getInt(1);//下标是从1 开始的，不是从0开始的
//                int id=resultSet.getInt("id");//通过字段名称获取
                int id=resultSet.getInt(1);
                String name=resultSet.getString("name");
                //结果集需要马上销毁，需要List保存结果
                nameList.add(name);
                System.out.println(id+","+name);
            }
            resultSet.close();
            statement.close();
        }
//        //insert
//        String sql="insert into user(id,name) values(1,'zhao')";
//        statement.executeUpdate(sql);//通过statement对象来执行SQL语句
        //update
//         String sql="update user set name='yan' where id=1";
//         statement.executeUpdate(sql);
        //delete
//         String sql="delete from user where id=1";
//         statement.executeUpdate(sql);
//        statement.close();
        connection.close();
    }
}
