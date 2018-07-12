package com.imooc.animal.ICATImpl;

import com.imooc.animal.Animal;
import com.imooc.animal.IACT;

public class Bear extends Animal implements IACT {
    public Bear() {
    }

    public Bear(String name, int age) {
        super(name, age);
    }

    @Override
    public void love() {
        System.out.println("爱好：喜欢卖萌");
    }

    @Override
    public void skill() {
        System.out.println("技能： 挽着花篮，打着雨伞，直立行走");

    }

    @Override
    public void act() {
        System.out.println("表演者： " + super.getName());
        System.out.println("年龄： " + super.getAge() + "岁");
        this.skill();
        this.love();

    }
}
