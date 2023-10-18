package com.itheima.day09.work02;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        ArrayList<Artist> artists = new ArrayList<>();

//        1.把所有艺术家的名称收集到String类型的List里
        ArrayList<String> members = new ArrayList<>();
        members.add("约翰列侬");
        members.add("保罗麦卡特尼");
        members.add("乔治·哈里森");

        ArrayList<String> songs = new ArrayList<>();
        songs.add("Lover");
        songs.add("The Man");
        songs.add("The Archer");

        ArrayList<String> musicians = new ArrayList<>();
        musicians.add("泰勒·斯威夫特");
        musicians.add("路易斯·贝尔");
        musicians.add("杰克·安托诺夫");

        ArrayList<Albums> albums = new ArrayList<>();
        albums.add(new Albums("Love", songs, musicians));
        artists.add(new Artist("甲壳虫乐队", members, "利物浦", albums));


        ArrayList<String> members1 = new ArrayList<>();
        members1.add("布赖恩·梅");
        members1.add("罗杰⋅泰勒");
        members1.add("约翰·迪肯");
        members1.add("佛莱迪·摩克瑞");

        ArrayList<String> songs1 = new ArrayList<>();
        songs1.add("Queen Forever");

        ArrayList<String> musicians1 = new ArrayList<>();
        musicians1.add("Queen Boys");
        musicians1.add("Gloria B. Vega");
        ArrayList<Albums> albums1 = new ArrayList<>();
        albums1.add(new Albums("Queen Forever", songs1, musicians1));
        artists.add(new Artist("皇后乐队", members1, "伦敦", albums1));


//        2.过滤出来自利物浦的乐队
        artists.stream().filter(artist -> artist.getOrigin().equals("利物浦")).forEach(System.out::println);

//        3.挑一个乐队,把乐队的其中一个专辑转换成K为name,V为songs的map (Map<String, List<String>>)
        Artist artist = artists.get(0);
//        Map<String, ArrayList<String>> artistalbum = artist.getAlbums().stream().filter(album -> album.getName().equals("Love")).collect(
//                Collectors.toMap(albums2 -> albums2.getName(), albums2 -> albums2.getSongs()));
//        artistalbum.forEach((k, v) -> System.out.println(k + ":" + v));

//        map 一对一转换
//        flatMap（流的扁平化）一对一转换，只需要操作一个流，合成一个流
        Map<String, ArrayList<String>> collect = artists.stream().map(o -> o.getAlbums()).flatMap(o -> o.stream()).collect(
                Collectors.toMap(albums2 -> albums2.getName(), albums2 -> albums2.getSongs()));
        collect.forEach((k, v) -> System.out.println(k + ":" + v));


    }
}
