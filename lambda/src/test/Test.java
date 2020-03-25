package test;


import interfaces.*;

public class Test {
    public static void main(String[] args) {
        //lambda匿名函数有
        //参数列表 方法体
        //(): 描述参数列表
        //{}：描述方法体
        //->：lambda运算符 读作 goes to

        //无参无返回
        NoneReturnNoneParameter lambda1 = ()->{
            System.out.println("hello world");
        };
        lambda1.test();

        //无返回值 单个参数
        NoneReturnSingleParameter lambda2 = (int a)->{
            System.out.println(a);
        };
        lambda2.test(999);

        //无参 多个返回

        NoneReturnMutipleParameter lambda3 = (int a,int b)->{
            System.out.println(a + b);
        };
        lambda3.test(2,2);

        //单个返回 没有参数
        SingleReturnNoneParameter lambda4 =()->{
            System.out.println("lambda4");
            return 99;
        };
        System.out.println(lambda4.test());

        //单个返回 单个参数
        SingleReturnSingleParameter lambda5 =(int a)->{
            System.out.println("lambda5" + a);
            return a;
        };
        System.out.println(lambda5.test(9999));

        //单个返回 多个参数
        SingleReturnMutipleParameter lambda6 = (int a,int b)->{
            System.out.println("lambda6");
            return a + b;
        };
        System.out.println(lambda6.test(1,1));
    }
}
