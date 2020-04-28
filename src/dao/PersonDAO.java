package dao;

import java.sql.*;


import domain.Person;
import util.JDBCUtils;

/**
 * 数据层一个程序
 * DAO层返回对象，在业务层通过操作这些对象来实现增删改查
 * */
public class PersonDAO {	

	public Person login(Person user) { //登录       
        Person existUser = null;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {//JDBC查询
            conn = JDBCUtils.getConnection();
            String sql = "select * from person where name=? and password=?"; //数据库编译时
            stmt = conn.prepareStatement(sql);	//将sql发送给数据库进行编译
            
            //设置sql参数
            stmt.setString(1,user.getName());	//传入数据值，不会作为关键字 --防止注入
            stmt.setString(2,user.getPassword());            
            rs = stmt.executeQuery();			//执行sql
                        
            //如果登陆成功，只有一条记录            
            if (rs.next()) {
            	existUser=new Person();   	//表示已登录用户
                existUser.setID(rs.getString("ID"));
                existUser.setName(rs.getString("name"));
                existUser.setPassword(rs.getString("password"));
                existUser.setBirthDate(rs.getDate("birthday"));
                System.out.println(existUser.getName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(user.getName());
        System.out.println(user.getPassword());
        try {
        	 System.out.println(rs.getString("name"));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("2");

		}
       
        return existUser;
    }
}

