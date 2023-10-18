package com.itheima.day01.act;

/**
 * 演员类
 */
public class Actor extends Human {


    /**
     * 毕业院校
     */
    private String school;

    /**
     * 代表作
     */
    private String masterWork;

    public Actor(String name, int age, String gender, String school, String masterWork) {
        super(name, age, gender);
        this.school = school;
        this.masterWork = masterWork;
    }

    public Actor() {
    }

    /**
     * 自我介绍
     */
    @Override
    public void introduce() {
        System.out.println("演员的自我介绍:我是" + getName() + "来自" + school + "代表作" + masterWork);
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getMasterWork() {
        return masterWork;
    }

    public void setMasterWork(String masterWork) {
        this.masterWork = masterWork;
    }
}
