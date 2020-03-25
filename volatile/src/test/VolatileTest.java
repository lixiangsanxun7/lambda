package test;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 验证 volatile 可见性问题
 * 1验证volatile的可见性
 * 1.1假如int number = 0;, number. 变量之前根本没有添加volatile.关键字修饰,没有可见性
 * 1.2添加了volatile， 可以解决可见性问题。
 * 2验证ivolatile不保证原子性
 * 2.1 原子性指的是什么意思?
 * 不可分割，完整性，也即某个线程正在做某个具体业务时，中间不可以被加塞或者被分割。需要整体完整
 * 要么同时成功，要么同时失败。
 * 2.2是否可以保证原子性?
 *
 * @author 86134
 */
@SuppressWarnings("all")
public class VolatileTest {


    public static void main(String[] args) {

    }


    //    验证ivolatile不保证原子性
    public void isSecureAtom() {
        Data myData = new Data();
        for (int i = 1; i <= 20; i++) {
            new Thread(() -> {
                for (int j = 1; j <= 1000; j++) {
                    myData.numPlus();
                    myData.addMyAtomic();
                }
            }, String.valueOf(i)).start();
        }

        //统计线程数量 如果循环结束 那么所有线程死亡 只剩main和gc 否则放弃调度 让循环线程执行
        while (Thread.activeCount() > 2) {
            Thread.yield();
        }

        //若保证原子性 此处应为20*1000=20000 结果并非如此
        //volatile并不保证原子性
        System.out.println("for over num value->" + myData.num);
        //20000
        System.out.println("for over num value->" + myData.atomicInteger);
    }


    //volatile可以保证可见性 及时通知其它线程 主物理内存的的值已经被修改
    public void seeOkByVolatile() {
        Data myData = new Data();
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "\t come in");
            try {
                Thread.sleep(3 * 1000);
                myData.addTo60();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "\t update num->" + myData.num);

        }).start();


        //此处一直循环 即使3秒以后num被改变为了60 但是main线程并不知道 不可见
        //如果在num变量前加上volatile 则问题解决
        while (myData.num == 0) {

        }
        System.out.println(Thread.currentThread().getName() + "任务完成");
        System.out.println("myData get num value ->" + myData.num);
    }

}


class Data {
    volatile int num = 0;

    //    volatile int num = 0;
    public void addTo60() {
        this.num = 60;
    }

    //验证原子性  正常20*1000 = 20000 结果并非如此
    public void numPlus() {
        num++;
    }

    //juc的保证原子性的类
    AtomicInteger atomicInteger = new AtomicInteger();
    public void addMyAtomic() {
        atomicInteger.getAndIncrement();
    }
}
