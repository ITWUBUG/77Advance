package com.itheima.day06.work02;

import java.util.ArrayList;
import java.util.Random;

/**
 * 游戏类
 */
public class Game {

    /**
     * 名字集合
     */
    private ArrayList<Person> person = new ArrayList<>();

    /**
     * 抓阄内容
     */
    private ArrayList<String> elements = new ArrayList<>();

    public Game() {
        elements.add(Lots.ELEMENT1);
        elements.add(Lots.ELEMENT2);
        elements.add(Lots.ELEMENT3);
        elements.add(Lots.ELEMENT4);
        elements.add(Lots.ELEMENT5);
    }

    /**
     * 开始游戏
     */
    public void start() {
        person.forEach(personName -> {
            Random random = new Random();
            int i = random.nextInt(elements.size());
            String s = elements.get(i);
            elements.remove(i);
            System.out.println( personName.getName()+ "抓到的阄为" + s);
        });

    }

    public void addNames(Person name) {
        person.add(name);
    }

    public void removeNames(String name) {
        person.remove(name);
    }

    public ArrayList<Person> getNames() {
        return person;
    }


    public ArrayList<String> getElements() {
        return elements;
    }
}
