package com.imooc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeTest {

    public static void main(String[] args){
        //定义Employee类的对象
        Employee e1 = new Employee("emp001", "张三", 18000.0);
        Employee e2 = new Employee("emp002", "李四", 25000.0);
        Employee e3 = new Employee("emp003", "王五", 16000.0);



        //将对象添加到List中
        List<Employee> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);


        //输出排序前的数据
        for(Employee e : list){
            System.out.println(e);
        }


        //排序
        Collections.sort(list);


        //输出排序后的数据
        for(Employee e : list){
            System.out.println(e);
        }
    }
}
