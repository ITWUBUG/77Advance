package com.itheima.day08.StuMangement1.enums;

import com.itheima.day08.StuMangement1.entity.Admin;

/**
 * 菜单枚举
 */
public enum MenuEnum {
    ADD("添加",1){
        @Override
        public void action() {
            Admin admian = Admin.createSingleton();
            admian.add();
        }
    },
    DELETE("删除",2){
        @Override
        public void action() {
            Admin admian = Admin.createSingleton();
            admian.delete();
        }
    },
    UPDATE("更新",3){
        @Override
        public void action() {
            Admin admian = Admin.createSingleton();
            admian.update();
        }
    },
    QUERY("查询",4){
        @Override
        public void action() {
            Admin admian = Admin.createSingleton();
            admian.query();
        }
    },
    EXIT("退出",5){
        @Override
        public void action() {
            Admin admian = Admin.createSingleton();
            admian.saveData();
            System.exit(0);
        }
    };

    MenuEnum(String name, int choice) {
        this.name = name;
        this.choice = choice;
    }

    private  String name;
    private  int choice;
    public abstract void action();

    public static void doaction(int choice){
        MenuEnum[] values = MenuEnum.values();
        for (MenuEnum value : values) {
            if (value.choice == choice){
                value.action();
                return;
            }
        }
    }

}
