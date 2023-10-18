package com.itheima.day12.work;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicInteger;

public class Test01 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            list.add(random.nextInt(100));
        }


        AtomicInteger sum = new AtomicInteger();

        for (int i = 0; i < 5; i++) {
            List<Integer> integers1 = list.subList(i * 20, (i + 1) * 20);
            FutureTask<Integer> integerFutureTask = new FutureTask<Integer>(()-> {
                Thread.sleep(2000);
                return  integers1.stream().reduce(0,Integer::sum);});
            new Thread(integerFutureTask).start();


            //        异步获得每个线程计算结果并累加到sum

            new Thread(()->{
                try {
                    sum.addAndGet(integerFutureTask.get());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }
            }).start();

        }



        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



        Integer reduce = list.stream().reduce(0, Integer::sum);
        System.out.println(reduce);
        System.out.println(sum);
    }
}
