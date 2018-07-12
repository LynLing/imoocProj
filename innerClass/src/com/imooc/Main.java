package com.imooc;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BallTest b1 = new BallTest();
        b1.new Inner_m().play();

        BallTest b2 = new BallTest();
        b2.info();

        BallTest b3 = new BallTest();
        b3.playBall(new Ball(){
            public void play() {
                System.out.println("============");
                System.out.println("匿名内部类：");
                System.out.println("打排球");
            }
        });

    }
}
