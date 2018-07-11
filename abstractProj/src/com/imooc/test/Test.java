package com.imooc.test;

import com.imooc.shape.Circle;
import com.imooc.shape.Rectangle;

public class Test {
    public static void main(String[] args){
        Circle c = new Circle(20);
        Rectangle r = new Rectangle(10, 20);

        System.out.println("圆的面积为：" + c.area());
        System.out.println("矩形的面积为：" + r.area());

    }
}
