package com.jinfeixibi.AinaAction;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Title:
 * Email jinfeiixbiwoaini@163.com
 * Created by lmyxny on 17/10/16.
 * type:
 */
public class DemoAction extends ActionSupport {

    @Override
    public String execute() throws Exception {

        ActionContext.getContext().put("love","I love you");

        return SUCCESS;
    }


}
