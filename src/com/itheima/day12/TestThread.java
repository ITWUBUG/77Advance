package com.itheima.day12;

import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.stream.Collectors;

public class TestThread {
    public static void main(String[] args) {
        MyThread myThread = new MyThread(-1);
//        1.start与run区别：start会启动线程，run不会
        myThread.start();
//        myThread.run();
//        2.线程不允许多次启动
//        myThread.start();
//        3.线程是由cpu调度的，start之后只是进入就绪状态，控制不了它的顺序
        for (int i = 0; i < 10; i++) {
            MyThread myThread1 = new MyThread(i);
            myThread1.start();
        }
        new Thread(new MyRunable()).start();
        new Thread(() -> System.out.println("线程")).start();


//        1、创建list,生成100个随机数
//        2、对list进行分片(5片) (limit或skit,subList)
//        3、创建线程计算和(Callable)

        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            list.add(random.nextInt(100));
        }

        List<Integer> integers = list.subList(0, 50);
        List<Integer> integers1 = list.subList(50, 100);


        SumCallable sumCallable = new SumCallable(integers);
        SumCallable sumCallable1 = new SumCallable(integers1);
        FutureTask<Integer> futureTask = new FutureTask<>(sumCallable);
        FutureTask<Integer> futureTask1 = new FutureTask<>(sumCallable1);
        Thread thread = new Thread(futureTask);
        Thread thread1 = new Thread(futureTask1);
        thread.start();
        thread1.start();

        int sum;
        try {
            Integer o = (Integer) futureTask.get();
            Integer o1 = (Integer) futureTask1.get();
            sum = o + o1;
            System.out.println(sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }



    }
}
