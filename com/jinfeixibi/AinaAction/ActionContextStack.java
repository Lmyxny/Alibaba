package com.jinfeixibi.AinaAction;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.Preparable;

/**
 * Title:
 * Email jinfeiixbiwoaini@163.com
 * Created by lmyxny on 17/10/17.
 * type:
 */
public class ActionContextStack implements Preparable {
    @Override
    public void prepare() throws Exception {

    }

    public String LiYingNa (){

        System.out.println("今天下雨是个好天气！");

        ActionContext.getContext().put("ceuqas","俄语地呀！！");

        return "Nana";
    }
}
