package com.bittech.Servlet.VO;

/**
 * package:com.bittech.Servlet.VO
 * Description:TODO
 * @date:2019/5/18
 * @Author:weiwei
 **/
public class UserInfo {
    private String username;
    private String password;
    public UserInfo(){

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "UserInfo{"+
                "username='"+username + '\''+
                ",password='"+password + '\''+
                "}";
    }
}
