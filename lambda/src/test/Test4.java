package test;

import bean.Person;

public class Test4 {
    public static void main(String[] args) {

        //lambda构造方法引用

        //正常lambda实现
        PersonCreat lambda = ()->new Person();

        //无参构造方法引用
        PersonCreat lambda2 = Person::new;
        Person person1 =  lambda2.getPerson();

        PersonCreat2 lambda3 = Person::new;
        Person person2 = lambda3.getPerson("小米",19);
        System.out.println(person2);


    }
}


/**
 * 在接口的某一个方法中 返回了某个对象 适合构造方法的引用
 */
interface PersonCreat{
    Person getPerson();
}

interface PersonCreat2{
    Person getPerson(String name,int age);
}
