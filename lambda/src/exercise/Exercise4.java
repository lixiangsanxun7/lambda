package exercise;

import bean.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * lambda案例
 * @author 86134
 */
public class Exercise4 {
    public static void main(String[] args) {
        //需求：删除集合中满足条件的案例
        List<Person> list = new ArrayList<>();
        list.add(new Person("小米",10));
        list.add(new Person("小米",19));
        list.add(new Person("小米",8));
        list.add(new Person("小米",18));
        list.add(new Person("小米",111));
        list.add(new Person("小米",99));
        list.add(new Person("小米",3));
        list.add(new Person("小米",88));
        list.add(new Person("小米",66));

        //删除年龄大于10的元素

        //普通实现
        /*
        Iterator<Person> iterator = list.iterator();
        while (iterator.hasNext()){
            Person person = iterator.next();
            if (person.age>10){
                iterator.remove();
            }
        }

        System.out.println(list);
        */

        //lambda实现
//        default boolean removeIf(Predicate<? super E> filter) {}
//        @FunctionalInterface
//        public interface Predicate<T> {}
        //Predicate 函数是接口

        //removeIf逻辑：将集合中的所有元素都带入进 boolean test() 中 如果返回值为true 则删除
        list.removeIf(ele->ele.age>10);
        System.out.println(list);
    }
 }
