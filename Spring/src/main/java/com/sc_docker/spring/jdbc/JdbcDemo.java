package com.sc_docker.spring.jdbc;

import java.sql.*;

public class JDBC {
    public static void main(String[] args) throws SQLException {

//        1.注册驱动
//        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

//        2.获取连接
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spring","root","root");
//        3.获取预处理对象
        PreparedStatement pstm = con.prepareStatement("select  * from  account");
//        4.执行SQL语句，得到结果集
        ResultSet rs = pstm.executeQuery();
//        5.遍历数据集
        while (rs.next()){
            System.out.println(rs.getString("name"));
        }
//        6.关闭连接
        con.close();
        pstm.close();
        con.close();
    }
}
