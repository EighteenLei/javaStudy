package com.lei.javaStudy.bean;

/**
 * Created by lenovo on 2016/5/2.
 */
public class People {

    /** 名字 王-金绍  */
    private String name;
    /** 年龄 */
    private Integer age;

    private Boolean man;



    public String getName() {
        if (name.contains("-")){
            return name.substring(name.indexOf("-"));
        }
        return name;
    }

    /**
     * 设置姓名
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (age<0){
            throw new RuntimeException("年龄错误");
        }
        this.age = age;
    }

    public Boolean getMan() {
        return man;
    }

    public void setMan(Boolean man) {
        this.man = man;
    }

    @Override
    public String toString() {
        return "People{" +
                "namesda='" + name + '\'' +
                ", age=" + age +
                ", man=" + man +
                '}';
    }
}
