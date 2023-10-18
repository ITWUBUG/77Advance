package com.itheima.day09.work02;

import java.util.ArrayList;

/**
 * 乐队类
 */
public class Artist {
    /**
     * 乐队名称
     */
    private String name;
    /**
     * 乐队成员
     */
    private ArrayList<String> members;
    /**
     * 乐队来自哪里
     */
    private String origin;
    /**
     * 专辑
     */
    private ArrayList<Albums> albums ;

    public Artist(String name, ArrayList<String> members, String origin, ArrayList<Albums> albums) {
        this.name = name;
        this.members = members;
        this.origin = origin;
        this.albums = albums;
    }

    public Artist() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getMembers() {
        return members;
    }

    public void setMembers(ArrayList<String> members) {
        this.members = members;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public ArrayList<Albums> getAlbums() {
        return albums;
    }

    public void setAlbums(ArrayList<Albums> albums) {
        this.albums = albums;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Artist artist = (Artist) o;

        if (name != null ? !name.equals(artist.name) : artist.name != null) return false;
        if (members != null ? !members.equals(artist.members) : artist.members != null) return false;
        if (origin != null ? !origin.equals(artist.origin) : artist.origin != null) return false;
        return albums != null ? albums.equals(artist.albums) : artist.albums == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (members != null ? members.hashCode() : 0);
        result = 31 * result + (origin != null ? origin.hashCode() : 0);
        result = 31 * result + (albums != null ? albums.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "name='" + name + '\'' +
                ", members=" + members +
                ", origin='" + origin + '\'' +
                ", albums=" + albums +
                '}';
    }
}
