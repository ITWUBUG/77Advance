package com.itheima.day03.inner;

/**
 * 外部类
 */
public class Outer {

    private int a = 10;

    /**
     * 成员内部类  一般使其私有化
     */
    private class Inner {
        public void show() {
            System.out.println(a);
            System.out.println(Outer.this.a);
        }
    }

    public void showInner() {
        Inner inner = new Inner();
        inner.show();
    }

    /**
     * 局部内部类
     */
    public void method(){
        int c = 100;
        class Part{
            int d = 200;
            public void show(){
                System.out.println(d);
                System.out.println(c);
            }
        }
        Part part = new Part();
        part.show();
    }
}

