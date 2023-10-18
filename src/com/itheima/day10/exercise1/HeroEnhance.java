package com.itheima.day10.exercise1;

public class HeroEnhance implements Skill{
    private Hero hero;

    public HeroEnhance(Hero hero) {
        this.hero = hero;
    }

    @Override
    public void a() {
        hero.a();
        System.out.println("增强");
    }

    @Override
    public void e() {

    }

    @Override
    public void q() {

    }

    @Override
    public void w() {

    }
}
