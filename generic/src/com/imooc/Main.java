package com.imooc;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Animal> list = new ArrayList<>();
        Dog dog1 = new Dog("巴迪");
        Dog dog2 = new Dog("豆豆");
        Cat cat1 = new Cat("花花");
        Cat cat2 = new Cat("凡凡");
        list.add(dog1);
        list.add(dog2);
        list.add(cat1);
        list.add(cat2);
        AnimalPlay.play(list);

    }
}
