package exercise;

import bean.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * lambda案例
 * @author 86134
 */
public class Exercise2 {
    public static void main(String[] args) {
        //集合排序
        Set<Person> set1 = new TreeSet<Person>();
//        set1.add(new Person("小米",10));
//        System.out.println(set);

        //Person cannot be cast to java.lang.Comparable
        //set是自带排序的集合 按照比较器Comparator排序 person没有实现这个接口 所以set不知道怎么排序抛了异常


        //    TreeSet构造方法
        //    public TreeSet(Comparator<? super E> comparator) {
        //        this(new TreeMap<>(comparator));
        //    }

        //使用比较器构造方法  升序排列
        //注：TreeSet如果Comparator比较器返回值为0 则认为两个元素一样 且Set不允许有重复元素
        //    所以不能直接用o2-o1 否则会少一个元素 需要写一下规则
        Set<Person> set = new TreeSet<Person>((o1, o2) -> {
            if (o1.age <= o2.age){
                return -1;
            } else {
                return 1;
            }
            //不要返回0
        });
        set.add(new Person("小米",10));
        set.add(new Person("小米",19));
        set.add(new Person("小米",8));
        set.add(new Person("小米",18));
        set.add(new Person("小米",111));
        set.add(new Person("小米",99));
        set.add(new Person("小米",3));
        set.add(new Person("小米",88));
        set.add(new Person("小米",88));

        for (Person person : set) {
            System.out.println(person.age);
        }





    }
 }
