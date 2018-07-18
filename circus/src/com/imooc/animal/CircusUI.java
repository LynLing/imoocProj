package com.imooc.animal;

import com.imooc.animal.AnimalImpl.Clown;
import com.imooc.animal.ICATImpl.Bear;
import com.imooc.animal.ICATImpl.Lion;
import com.imooc.animal.ICATImpl.Monkey;
import com.imooc.animal.ICATImpl.Parrot;

public class CircusUI {
    private int operation;

    public CircusUI(int operation) {
        this.setOperation(operation);
    }

    public int getOperation() {
        return operation;
    }

    public void setOperation(int operation) {
        this.operation = operation;
    }

    public void display(){
        System.out.println("********欢迎来到马戏团********");
        System.out.println("**********  请选择表演者  **********");
        System.out.println("**********   1.棕熊  **************");
        System.out.println("**********   2.狮子  **************");
        System.out.println("**********   3.猴子  **************");
        System.out.println("**********   4.鹦鹉  **************");
        System.out.println("**********   5.小丑  **************");
    }

    public void exit(){
        System.out.println("********  是否继续观看(1/0)  ********");
    }

    public void show(int operation){
        if(operation >= 6 || operation < 0){
            System.out.println("**  输入信息不正确，请重新输入  **");
        }
        IACT actor = null;
        switch(operation){
            case 1: {
                actor = new Bear("Bill", 1);

                break;
            }
            case 2: {
                actor = new Lion("Lain", 2, "灰色", "公狮");

                break;
            }
            case 3: {
                actor = new Monkey("Tom", 1, "金丝猴");

                break;
            }
            case 4:{
                actor = new Parrot("Rose", 1, "牡丹鹦鹉");

                break;
            }
            case 5:{
                actor = new Clown("Kahle", 5);

                break;
            }
            default:{
                System.out.println("");
            }
        }
        actor.act();
    }
}
