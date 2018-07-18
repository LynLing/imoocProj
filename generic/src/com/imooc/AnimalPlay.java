package com.imooc;

import java.util.List;

public class AnimalPlay {
    public  static void play(List<? extends Animal> animals){
        for(Animal c : animals){
            c.playGame();
        }

    }
}
