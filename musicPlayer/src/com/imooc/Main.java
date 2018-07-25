package com.imooc;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try{
            TestDemo testDemo = new TestDemo();
            testDemo.test();
        }catch(IOException err){
            err.printStackTrace();

        }catch(Exception err){
            err.printStackTrace();
        }finally {
            System.out.println("谢谢使用");
        }

    }

}
