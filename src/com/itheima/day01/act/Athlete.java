package com.itheima.day01.act;

/**
 * 运动员类
 */
public class Athlete extends Human {

    /**
     * 运动项目
     */
    private String sports;

    /**
     * 历史最好成绩
     */
    private String best;

    public Athlete(String name, int age, String gender, String sports, String best) {
        super(name, age, gender);
        this.sports = sports;
        this.best = best;
    }

    public Athlete() {
    }

    /**
     * 自我介始
     */
    @Override
    public void introduce() {
        System.out.println("演员的自我介绍:我是" + getName() + "项目" + sports + "最好成绩是" + best);
    }

    public String getSports() {
        return sports;
    }

    public void setSports(String sports) {
        this.sports = sports;
    }

    public String getBest() {
        return best;
    }

    public void setBest(String best) {
        this.best = best;
    }
}
