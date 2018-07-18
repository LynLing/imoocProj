package com.imooc;

public class GoodsManagement {

    private GoodsManage goodsManage;

    public GoodsManage getGoodsManage() {
        return goodsManage;
    }

    public void setGoodsManage(GoodsManage goodsManage) {
        this.goodsManage = goodsManage;
    }

    public GoodsManagement(GoodsManage goodsManage) {

        this.setGoodsManage(goodsManage);
    }
    public GoodsManagement(){}

    public void displayInfo(){
        System.out.println("*********************************");
        System.out.println("             **商品管理**           ");
        System.out.println("           1 -- 商品信息导入         ");
        System.out.println("           2 -- 显示所有商品信息      ");
        System.out.println("           9 -- 返回上一级菜单        ");
        System.out.println("*********************************");
        System.out.println("请输入对应的数字对商品进行管理：");
    }

    public void operation(int op) throws Exception{
        switch(op){
            case 1:
                //GoodsManage goodsManage = new GoodsManage();
                goodsManage.importGoods();
                break;
            case 2:
                goodsManage.displayAllGoods();
                break;
            case 9:
                break;
            default:
                throw new Exception("无该操作项，请重新输入");
        }
    }
}
