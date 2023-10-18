package com.itheima.day09.work02;


import java.util.ArrayList;

/**
 * 专辑
 */
public class Albums {
    /**
     * 专辑名
     */
    private String name;
    /**
     * 专辑中的所有歌曲
     */
    private ArrayList<String> songs;
    /**
     * 参与创作本专辑的艺术家
     */
    private ArrayList<String> musicians;

    public Albums(String name, ArrayList<String> songs, ArrayList<String> musicians) {
        this.name = name;
        this.songs = songs;
        this.musicians = musicians;
    }

    public Albums() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<String> songs) {
        this.songs = songs;
    }

    public ArrayList<String> getMusicians() {
        return musicians;
    }

    public void setMusicians(ArrayList<String> musicians) {
        this.musicians = musicians;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Albums albums = (Albums) o;

        if (name != null ? !name.equals(albums.name) : albums.name != null) return false;
        if (songs != null ? !songs.equals(albums.songs) : albums.songs != null) return false;
        return musicians != null ? musicians.equals(albums.musicians) : albums.musicians == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (songs != null ? songs.hashCode() : 0);
        result = 31 * result + (musicians != null ? musicians.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Albums{" +
                "name='" + name + '\'' +
                ", songs=" + songs +
                ", musicians=" + musicians +
                '}';
    }
}
