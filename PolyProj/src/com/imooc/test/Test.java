package com.imooc.test;

import com.imooc.animal.Animal;
import com.imooc.animal.Cat;
import com.imooc.animal.Dog;
import com.imooc.animal.Sheep;

import java.util.Random;

public class Test {
    public static void main(String[] args){
        Animal[] animals = new Animal[5];
        Random random = new Random();
        for(int i = 0; i < 5; i++){
            if(random.nextInt(3) == 0){
                animals[i] = new Cat();
            }else if(random.nextInt(3) == 1){
                animals[i] = new Dog();
            }else{
                animals[i] = new Sheep();
            }
        }

        for(int i = 0; i < 5; i++){
            animals[i].cry();
        }
    }
}
