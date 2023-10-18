package com.itheima.day09.work;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> actors = new ArrayList<>();
        actors.add("王源");
        actors.add("张艺兴");
        actors.add("约翰列侬");
        actors.add("本杰明");
        actors.add("黄子韬");
        actors.add("卡特尼");
        actors.add("保罗麦卡特尼");

        ArrayList<String> actresses = new ArrayList<>();
        actresses.add("李小路");
        actresses.add("林心茹");
        actresses.add("林依晨");
        actresses.add("韩红");
        actresses.add("刘岩");

//        1.男演员只要名字为3个字的前三人
        List<String> man = actors.stream().filter(o -> o.length() == 3).limit(3).collect(Collectors.toList());
        man.forEach(System.out::println);

//        2.女演员只要姓林的，并且不要第一个
        List<String> women = actresses.stream().filter(s -> s.startsWith("林")).skip(1).limit(1).collect(Collectors.toList());
        women.forEach(System.out::println);

//        3.把过滤后的男演员姓名和女演员姓名合并到一起
        System.out.println("------");
        Stream<String> stream = man.stream();
        Stream<String> stream1 = women.stream();
        List<String> collect1 = Stream.concat(stream, stream1).collect(Collectors.toList());
        collect1.forEach(System.out::println);

//        4.上一步操作后的元素作为构造方法的参数创建演员对象（实例化一个Actor类,类中只有一个属性,演员姓名，此处尝试使用map）
//        ,并调用收集方法转换成List<Actor>.
        System.out.println("------");
        List<Actor> collect3 = collect1.stream().map(Actor::new).collect(Collectors.toList());
        collect3.forEach(System.out::println);
    }
}
