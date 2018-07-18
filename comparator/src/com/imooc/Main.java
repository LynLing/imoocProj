package com.imooc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static class comparator implements Comparator<Student>{
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    public static void main(String[] args) {
	// write your code here
        List<Student> list = new ArrayList<>();
        list.add(new Student(40, "peter", 20));
        list.add(new Student(28, "angel", 5));
        list.add(new Student(15, "tom", 18));
        for(Student c:list){
            System.out.println(c);
        }
        Collections.sort(list, new comparator());
        for(Student c:list){
            System.out.println(c);
        }

    }
}
