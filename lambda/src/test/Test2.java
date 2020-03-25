package test;

import interfaces.NoneReturnMutipleParameter;
import interfaces.NoneReturnSingleParameter;
import interfaces.SingleReturnMutipleParameter;
import interfaces.SingleReturnNoneParameter;

public class Test2 {
    public static void main(String[] args) {
        //语法精简：

        //参数: 1.参数类型
        //  在接口的抽象方法中 已经定义了方法的参数和类型
        //  所以在lambda表达式式中 参数类型可以省略 可以根据接口推导出来
        //  要省略，全部省略，不省略，全不省略

        //无返回 多参数
        NoneReturnMutipleParameter lambda = (a,b)->{
            System.out.println(a + b);
        };

        //2.参数小括号
        //   如果参数中的参数只有一个  则此时小括号可以省略
        NoneReturnSingleParameter lambda2 = a->{
            System.out.println(a);
        };

        //3.方法 大括号
        if (true)
            System.out.println("在 if...else  while for 循环中,如果方法体中只有一条代码  方法体可以省略");
        //lambda中同样使用
        NoneReturnSingleParameter lambda3 = a-> System.out.println("大括号可以省略");
        lambda3.test(9);

        //4.如果lambda中唯一的一条语句是返回语句 则在省略掉大括号时 也必须省略掉return
        SingleReturnNoneParameter lambda4 = ()-> 10;
        System.out.println(lambda4.test());

        //多参数有返回值
        SingleReturnMutipleParameter lambda5 = (a,b)->a+b;
        System.out.println(lambda5.test(1,1));
    }
}
