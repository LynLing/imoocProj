package com.imooc.animal.ICATImpl;

import com.imooc.animal.Animal;
import com.imooc.animal.IACT;

public class Lion extends Animal implements IACT {

    private String color;
    private String sex;

    public Lion(String color, String sex) {
        this.setColor(color);
        this.setSex(sex);
    }

    public Lion(String name, int age, String color, String sex) {
        super(name, age);
        this.setColor(color);
        this.setSex(sex);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public void love() {
        System.out.println("爱好： 喜欢吃各种肉类" );
    }

    @Override
    public void skill() {
        System.out.println("技能： 擅长钻火圈" );
    }

    @Override
    public void act() {
        System.out.println("表演者： " + super.getName());
        System.out.println("年龄： " + super.getAge() + "岁");
        System.out.println("性别： " + this.getSex());
        System.out.println("毛色： " + this.getColor());
        this.skill();
        this.love();

    }
}
