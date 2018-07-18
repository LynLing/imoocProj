package com.imooc;

public class MainMenu {


    public void displayInfo(){
        System.out.println("*********************************");
        System.out.println("             **主菜单**           ");
        System.out.println("            1 -- 商品管理          ");
        System.out.println("            2 -- 购物车            ");
        System.out.println("            0 -- 退出              ");
        System.out.println("**********************************");
        System.out.println("请输入对应的数字对商品进行管理：");
    }

    public void operation(int op) throws Exception{
        switch(op){
            case 1:
                GoodsManagement goodsManagement = new GoodsManagement();
                goodsManagement.displayInfo();
            case 2:
                ShoppingCartManagement shoppingCartManagement = new ShoppingCartManagement();
                shoppingCartManagement.displayInfo();
            case 0:
                System.out.println("欢迎下次光临");
            default:
                System.out.println("无该操作选项");


        }
    }
}
