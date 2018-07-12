package com.imooc.animal.ICATImpl;

import com.imooc.animal.Animal;
import com.imooc.animal.IACT;

public class Monkey extends Animal implements IACT {
    private String type;

    public Monkey(String type) {
        this.setType(type);
    }

    public Monkey(String name, int age, String type) {
        super(name, age);
        this.setType(type);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void love() {
        System.out.println("爱好： 喜欢模仿人的动作表情");
    }

    @Override
    public void skill() {
        System.out.println("技能： 骑独轮车过独木桥");
    }

    @Override
    public void act() {
        System.out.println("表演者： " + super.getName());
        System.out.println("年龄： " + super.getAge() + "岁");
        System.out.println("品种： " + this.getType());
        this.skill();
        this.love();

    }
}
