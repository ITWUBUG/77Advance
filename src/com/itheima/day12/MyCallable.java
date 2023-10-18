package com.itheima.day12;


import java.util.concurrent.Callable;

public class MyCallable implements Callable<Walllet> {
    private Walllet walllet;

    public MyCallable(Walllet walllet) {
        this.walllet = walllet;
    }

    @Override
    public Walllet call() throws Exception {
        return walllet;
    }
}
