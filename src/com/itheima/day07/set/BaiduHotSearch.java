package com.itheima.day07.set;

import java.util.Objects;

/**
 * 百度热搜排行榜
 */
public class BaiduHotSearch implements Comparable<BaiduHotSearch> {

    /**
     * 标题
     */
    private String title;
    /**
     * 点击量
     */
    private int click;

    public BaiduHotSearch(String title, int click) {
        this.title = title;
        this.click = click;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getClick() {
        return click;
    }

    public void setClick(int click) {
        this.click = click;
    }

    @Override
    public int compareTo(BaiduHotSearch o) {
//      参数代表已经存在，this代表即将存的
        return o.click - this.click ;
    }

    @Override
    public String toString() {
        return "BaiduHotSearch{" +
                "title='" + title + '\'' +
                ", click=" + click +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaiduHotSearch that = (BaiduHotSearch) o;
        return click == that.click && Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, click);
    }
}
