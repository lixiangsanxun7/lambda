package exercise;

import bean.Person;

import java.util.*;

/**
 * lambda案例
 * @author 86134
 */
public class Exercise3 {
    public static void main(String[] args) {
        //集合遍历
        List<Integer> integerList = new ArrayList<>();
        Collections.addAll(integerList,1,2,3,4,5,6,7,8,9,0);


        //default void forEach(Consumer<? super T> action) {}

        //@FunctionalInterface
        //public interface Consumer<T> {}
        //Consumer函数式接口

        //直接使用lambda遍历 不加自己添加的逻辑
        integerList.forEach(System.out::println);

        //输出集合中所以的偶数
        // void accept(T t); ele：Consumer接口中accept的入参
        integerList.forEach(ele -> {
            if (ele % 2 == 0){
                System.out.println(ele);
            }
        });

    }
 }
