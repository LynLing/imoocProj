package com.imooc;

public class GoodInCart {
    private Goods goods;
    private int num;

    public GoodInCart(Goods goods, int num) {
        this.setGoods(goods);
        this.setNum(num);
    }

    //private static GoodInCart instance = null;



    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
