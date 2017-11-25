package com.jinfeixibi.Entity;

/**
 * Title:
 * Email jinfeiixbiwoaini@163.com
 * Created by lmyxny on 17/10/17.
 * type:
 */
public class ActionEntity {

    private String name ;

    private Integer age ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ActionEntity{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Integer getAge() {
        return age;
    }

    public ActionEntity() {
    }

    public ActionEntity(String name, Integer age) {

        this.name = name;
        this.age = age;
    }

    public void setAge(Integer age) {

        this.age = age;
    }
}
