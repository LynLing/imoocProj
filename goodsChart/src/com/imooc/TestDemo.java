package com.imooc;

import java.util.Scanner;

public class TestDemo {

    public static void main(String[] args) {
	// write your code here
        ShoppingCart shoppingCart = new ShoppingCart();
        GoodsManage goodsManage = new GoodsManage();
        MainMenu mainMenu = new MainMenu();
        GoodsManagement goodsManagement = new GoodsManagement();
        ShoppingCartManagement shoppingCartManagement = new ShoppingCartManagement();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

            try{
                boolean flag1 = true;
                while(flag1){
                    mainMenu.displayInfo();
                    switch(scanner.nextInt()){
                        case 1:
                            // 商品管理
                            boolean flag3 = true;
                            while(flag3){
                                goodsManagement.displayInfo();
                                switch(scanner.nextInt()){
                                    case 1:
                                        goodsManage.importGoods();
                                        break;
                                    case 2:
                                        goodsManage.displayAllGoods();
                                        break;
                                    case 9:
                                        flag3 = false;
                                        break;
                                    default:
                                        System.out.println("无该操作项");

                                }
                            }
                            break;
                        case 2:
                            boolean flag2 = true;
                            while(flag2){
                                shoppingCartManagement.displayInfo();
                                switch(scanner.nextInt()){
                                    case 1:
                                        System.out.println("添加商品到购物车");
                                        System.out.println("所有商品信息为");
                                        goodsManage.displayAllGoods();
                                        System.out.println("请输入要添加的商品编号：");
                                        String id = scanner.next();
                                        //String id = "goods002";
                                        shoppingCart.addGoodsToCart(goodsManage, id);
                                        System.out.println("请输入要添加商品的数量：");
                                        shoppingCart.updateNumInCart(id, scanner.nextInt());
                                        break;
                                    case 2:
                                        System.out.println("修改购物车中的商品数量");
                                        System.out.println("请输入要修改的商品编号：");
                                        String Id = scanner.next();
                                        System.out.println("请输入新的商品数量：");
                                        shoppingCart.updateNumInCart(Id, scanner.nextInt());
                                        break;
                                    case 3:
                                        System.out.println("显示购物车中的所有商品信息");
                                        shoppingCart.displayAllInCart();
                                        break;
                                    case 4:
                                        System.out.println("结算");
                                        shoppingCart.displayAllInCart();
                                        System.out.println("商品的总价为：" + shoppingCart.settleAccounts());
                                        break;
                                    case 9:
                                        flag2 = false;
                                        break;
                                    default:
                                        System.out.println("无该操作选项");
                                }
                            }
                            break;
                        case 0:
                            flag1 = false;
                            break;
                        default:
                            System.out.println("无该操作选项");
                    }
                }
            }catch (Exception e){
                System.out.println(e.getMessage());
            }



    }
}
