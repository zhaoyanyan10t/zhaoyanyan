package yanyan.dao;

import yanyan.exception.SystemException;
import yanyan.model.Classes;
import yanyan.model.User;
import yanyan.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {

    public static User query(User user) {
        User queryUser=null;
        Connection c=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        try{
            c=DBUtil.getConnection();
            String sql="select id,username,password,nickname from user where username=? and password=?";
            ps=c.prepareStatement(sql);
            ps.setString(1,user.getUsername());
            ps.setString(2,user.getPassword());
            rs=ps.executeQuery();
            //处理结果集
            while(rs.next()){
                queryUser=user;
                queryUser.setId(rs.getInt("id"));
                queryUser.setNickname(rs.getString("nickname"));

            }
        }catch(Exception e){
            throw new SystemException("00007","用户登录校验数据库查询出错",e);
        }finally{
            DBUtil.close(c,ps,rs);
        }
        return queryUser;
    }
}
