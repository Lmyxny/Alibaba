package com.jinfeixibi.test;

import com.jinfeixibi.Entity.ActionEntity;
import ognl.Ognl;
import ognl.OgnlContext;
import ognl.OgnlException;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Title:
 * Email jinfeiixbiwoaini@163.com
 * Created by lmyxny on 17/10/17.
 * type:
 */
public class ActionTest {

    @Test
    public void text1() throws OgnlException {

        OgnlContext ognlContext = new OgnlContext();

        ActionEntity actionEntity = new ActionEntity("Tom",16);

        ognlContext.setRoot(actionEntity);

        String name = (String) Ognl.getValue("name='Maina'", ognlContext, ognlContext.getRoot());

        System.out.println(name);
    }

    @Test
    public void text2() throws OgnlException {

        Map<String,ActionEntity> map = new HashMap<>();

        map.put("user1",new ActionEntity("马幸宇",24));

        map.put("user2",new ActionEntity("李英娜",23));

        OgnlContext ognlContext = new OgnlContext();

        ognlContext.setValues(map);

        String name = (String) Ognl.getValue("#user1.name='张三丰'", ognlContext, ognlContext.getValues());

        String nameNa = (String) Ognl.getValue("#user2.name", ognlContext, ognlContext.getRoot());

        System.out.println(name);

        System.out.println(nameNa);
    }

}
