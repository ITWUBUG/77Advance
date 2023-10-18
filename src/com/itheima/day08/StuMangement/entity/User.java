package com.itheima.day08.StuMangement.entity;

import java.io.Serializable;

/**
 * 用户类
 */
public abstract class User implements Serializable {
    /**
     * 用户姓名
     */
    private String name;
    /**
     * 用户id
     */
    private String id;

    /**
     * 有参构造器
     * @param name 姓名
     * @param id 用户id
     */
    public User(String name, String id) {
        this.name = name;
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return id != null ? id.equals(user.id) : user.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
