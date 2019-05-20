package com.bittech.Servlet.db;

/**
 * package:com.bittech.Servlet.db
 * Description:TODO
 * @date:2019/5/18
 * @Author:weiwei
 **/

import java.sql.*;

/**
 * 配置数据库连接类
 */
public class DbManger {

    public String driver = "com.mysql.jdbc.Driver";
    public String username = "root";
    public String password = "root";
    public String url = "jdbc:mysql://127.0.0.1:3306/servletdb";

    public Connection conn = null;
    public Statement state = null;
    public ResultSet rs = null;

    public DbManger(){

    }

    public Connection getConnection(){
        try{
            Class.forName(driver);
            conn = DriverManager.getConnection(url,username,password);
            System.out.println("Connection Success....");
            return conn;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public ResultSet queryExecuteFun(String Strsql){
        try {
            state = conn.createStatement();
            rs = state.executeQuery(Strsql);
            return rs;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    public void closeDb(){
        try {
            if (rs != null) rs.close();
            if (state != null) state.close();
            if (conn != null) conn.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
