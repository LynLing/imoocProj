package com.imooc.singleton;

public class SingletonTwo {
    //1.创建私有构造方法
    private SingletonTwo(){}
    //2.创建静态的该类实例对象
    private static SingletonTwo instance = null;

    //3.创建开放的静态方法提供实例对象
    public static SingletonTwo getInstance(){
        if(instance == null){
            instance = new SingletonTwo();
        }
        return instance;
    }
}
