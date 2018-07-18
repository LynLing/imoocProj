package com.imooc;

public class ShoppingCartManagement {
    private ShoppingCart shoppingCart;

    public void displayInfo(){
        System.out.println("*********************************");
        System.out.println("             **购物车挂管理**           ");
        System.out.println("           1 -- 添加商品到购物车         ");
        System.out.println("           2 -- 修改购物车中的商品数量      ");
        System.out.println("           3 -- 显示购物车中所有商品信息       ");
        System.out.println("           4 -- 结算       ");
        System.out.println("           9 -- 返回上一级菜单       ");
        System.out.println("*********************************");
        System.out.println("请输入对应的数字对购物车进行管理：");
    }

    public void operation(int op) throws Exception{
        switch(op){
            case 1:
                GoodsManagement goodsManagement = new GoodsManagement();
                System.out.println("所有商品信息为：");
                goodsManagement.displayInfo();
                break;
            case 2:
                System.out.println("修改购物车中的商品数量");
                break;

            case 3:
                System.out.println("显示购物车中的所有商品信息：");
                break;
            case 4:
                System.out.println("结算：");
                break;
            case 9:
                break;
            default:
                System.out.println("无该操作选项");


        }
    }
}
