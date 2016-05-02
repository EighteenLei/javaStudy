package com.lei.javaStudy.studyTest;

import com.lei.javaStudy.bean.People;

/**
 * Created by lenovo on 2016/5/2.
 */
public class StudyTest {

    public static void printParity(int x){
        if (x % 2 == 0 ){
            System.out.println("x is even!");
        }else {
            System.out.println("x is odd!");
        }
    }

    public static void matchLog(){

        for (int i=5 ;i<=5; i--){

        if (i <= 0){
            System.out.println("输入值为负数，边长不能为非正数！");
            return;
        }
        int j = i*i;
        System.out.println("该正方形面积为" + j);
    }

    }

    public static void main(String[] args) {

        System.out.println("---正方形----");

        for (int x = 1; x <= 100; x++) {
            if (x % 10 != 0) {
                System.out.print("* ");

            }else if (x % 10 == 0){
                System.out.println("* ");
            }
        }

        System.out.println("---方法测试----");

        int number=19;
        printParity(number);

        System.out.println("---Return测试2----");
        matchLog();


    }
}