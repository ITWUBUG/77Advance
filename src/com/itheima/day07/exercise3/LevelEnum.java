package com.itheima.day07.exercise3;

public enum LevelEnum {
    PERFECT("优", 90, 100),
    GOOD("良", 70, 89),
    NOT_BAD("中", 60, 69),
    BAD("差", 0, 59);

    private String name;
    private int start;
    private int end;

    LevelEnum(String name, int start, int end) {
        this.name = name;
        this.start = start;
        this.end = end;
    }

    public static void judge(int score) {
        LevelEnum[] values = LevelEnum.values();
        for (LevelEnum value : values) {
            if (score >= value.start && score <= value.end) {
                System.out.println(value.name);
                return;
            }
        }
        throw new RuntimeException("分数不符合要求");

    }
}
