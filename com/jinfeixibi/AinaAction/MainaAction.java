package com.jinfeixibi.AinaAction;

import com.opensymphony.xwork2.ActionContext;

/**
 * Title:
 * Email jinfeiixbiwoaini@163.com
 * Created by lmyxny on 17/10/16.
 * type:
 */
public class MainaAction  {

    private String username ;
    // 将请求参数中参数名为"username"所对应的参数值通过set方法赋值给当前的属性.
    private String password ;

    public  String  login() {

        //根据请求参数(用户名+ 密码),验证是否能进行登录

        if("admin".equals(username) && "1234".equals(password)) {
            //登录成功
            return "success";
        }
        ActionContext.getContext().put("error","怎么会出错呢！！大宝贝 爱你哦 下回注意呢 么么哒");
        //登录失败
        return "login";
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        System.out.println("setUsername:" + username);
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        System.out.println("setPassword:" + password);
        this.password = password;
    }
}
