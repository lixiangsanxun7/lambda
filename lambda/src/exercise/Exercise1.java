package exercise;

import bean.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * lambda案例
 * @author 86134
 */
public class Exercise1 {
    public static void main(String[] args) {
        //集合排序
        //已知：在一个ArrayList中有若干个Person对象  把这写对象按照Person年龄降序排列
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


        //@FunctionalInterface
        //public interface Comparator<T> {}
        //Comparator 比较器 函数式接口 sort方法中使用lambda实现Comparator的比较规则 为正则o2大 为负则o1大 只看正负
        list.sort((o1, o2) -> o2.age -o1.age);
        for (Person person : list) {
            System.out.println(person.age);
        }



        //集合排序 用到的lambda表达式 用法和上面一样 都是实现Comparator比较器接口
//        Collections.sort();
//        Arrays.sort();
    }
 }
