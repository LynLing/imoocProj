package com.imooc.animal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int triger = 1;
        CircusUI circusUI = new CircusUI(triger);
        while(triger != 0){
            circusUI.display();
            triger = in.nextInt();
            circusUI.show(triger);
            circusUI.exit();
            int flag = in.nextInt();
            if(flag != 1 && flag != 0) {
                System.out.println("**  输入信息不正确，请重新输入  **");
            }
            if(flag == 0){
                triger = 0;
            }
        }
        System.out.println("********  欢迎下次光临  ********");

    }
}
