package com.lei.javaStudy;

import com.lei.javaStudy.bean.People;

/**
 * Created by lenovo on 2016/5/2.
 */
public class TestRun {

    public static void main(String[] args){
        People lyl = new People();
        lyl.setName("雷雅玲");
        lyl.setAge(28);
        lyl.setMan(false);
        
        System.out.println(lyl.getName());
        System.out.println(lyl.getAge());
        System.out.println(lyl.getMan());

        System.out.println(lyl.toString());
    }
}
