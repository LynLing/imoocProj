package com.imooc;

public class BallTest {
    public class Inner_m implements Ball{
        public void play(){
            System.out.println("成员内部类：");
            System.out.println("打篮球");
        }
    }
    public void info(){
        class Inner_f implements Ball{
            @Override
            public void play() {
                System.out.print("===============");
                System.out.println("方法内部类：");
                System.out.println("打乒乓球");
            }
        }
        new Inner_f().play();
    }
    public void playBall(Ball ball){
        ball.play();
    }
}
