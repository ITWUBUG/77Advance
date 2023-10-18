package com.itheima.day12;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class SumCallable implements Callable<Integer> {
    List<Integer> list =new ArrayList<>();

    public SumCallable(List list) {
        this.list = list;
    }

    @Override
    public Integer call() throws Exception {
        return list.stream().reduce(0, Integer::sum);
    }
}
