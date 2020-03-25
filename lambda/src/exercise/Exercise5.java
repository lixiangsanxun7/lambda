package exercise;

import bean.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * lambda案例
 * @author 86134
 */
public class Exercise5 {
    public static void main(String[] args) {
        //需求 开辟一条线程 做一个数字的输出
        //匿名内部类实现
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("匿名内部类：" + i);
                }
            }
        }).start();


        //lambda实现
        Thread t = new Thread(()->{
            for (int i = 0; i < 100; i++) {
                System.out.println("lambda："+ i);
            }
        });
        t.start();
    }
 }
