package com.test2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestJunit {
    @Before
    public void before() {
        System.out.println("before");
    }

    @After
    public void after() {
        System.out.println("after");
    }

    @Test
    public void test1() {
        System.out.println(1);
    }

    @Test
    public void test2() {
        System.out.println(2);

    }

    @Test
    public void test3() {
        System.out.println(3);

    }

    @Test
    public void test4() {
        System.out.println(4);

    }
}
