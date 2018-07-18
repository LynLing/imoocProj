package com.imooc;

public class MyThread extends Thread {
    public MyThread(String name){
        super(name);
    }

    public void run(){
        for(int i = 1; i <= 10; i++){
            System.out.println(super.getName() + "正在打印" + i);
        }
    }
}
