package com.itheima.day12.work;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class SumCallable implements Callable<Integer> {
    private List<Integer> list = new ArrayList<>();

    public SumCallable(List list) {
        this.list = list;
    }

    @Override
    public Integer call() throws Exception {
        return list.stream().reduce(0, Integer::sum);
    }
}
