package com.imooc;

public class Main {


    public static void main(String[] args) {
	// write your code here
//        MyThread t1 = new MyThread("打印机1");
//        MyThread t2 = new MyThread("打印机2");
//        t1.start();
//        t2.start();

//        Dog dog = new Dog();
//        Cat cat = new Cat();
//        Thread t1 = new Thread(dog);
//        Thread t2 = new Thread(cat);
//        for(int i = 0 ; i < 3; i++){
//            System.out.println("Main thread");
//        }
//        t1.run();
//        t2.run();
        Letter letter = new Letter();
        Thread thread = new Thread(letter);
        thread.start();
    }
}
