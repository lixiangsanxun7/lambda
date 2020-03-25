package test;

import interfaces.SingleReturnSingleParameter;

public class Test3 {
    public static void main(String[] args) {
        //方法引用：
        SingleReturnSingleParameter lambda0 = a -> lambdaTestClass(a);
        //可以快速的将lambda表达式的实现指向一个已经实现的方法
        //语法：方法的隶属者::方法名
        //隶属者：静态方法隶属于类 非静态方法隶属于对象

        //注：如果一个接口多处使用 且实现方法一样  也可使用方法引用

        //隶属于类的的静态方法
        SingleReturnSingleParameter lambda = Test3::lambdaTestClass;

        //隶属于对象的非静态方法
        Test3 test3 = new Test3();
        SingleReturnSingleParameter lambda2 = test3::lambdaTestObject;

    }

    private int lambdaTestObject(int a){
        return a * 2;
    }

    private static int  lambdaTestClass(int a){
        return a * 2 ;
    }
}
