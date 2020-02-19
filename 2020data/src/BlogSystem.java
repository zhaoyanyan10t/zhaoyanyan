import java.sql.*;
import java.util.Scanner;

public class BlogSystem {
    private static Connection connection;

    static{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection=DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/javaboke?useSSL=false",
                    "root",
                    ""
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws SQLException {
        Scanner scanner =new Scanner(System.in);
        boolean running=true;
        while(running){
            System.out.println("博客系统");
            int select =scanner.nextInt();
            switch(select){
                case 1:registerUser();break;
                default:running=false;

            }
        }
    }

    private static void registerUser() throws SQLException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入要注册的用户名");
        String username=scanner.nextLine();
        Statement statement=connection.createStatement();
        String sql=String.format(
                "insert into user(username)values('%s')",
                 username
        );
        statement.executeUpdate(sql);
        statement.close();
//        scanner.close();
        System.out.println("用户注册成功");
    }
}
