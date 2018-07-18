package com.imooc;

public class Goods {
    private String goodsId;
    private String goodsName;
    private double price;
    private String goodsDesp;

    public Goods(String goodsId, String goodsName, double price, String goodsDesp) {
        this.setGoodsDesp(goodsDesp);
        this.setGoodsId(goodsId);
        this.setGoodsName(goodsName);
        this.setPrice(price);
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getGoodsDesp() {
        return goodsDesp;
    }

    public void setGoodsDesp(String goodsDesp) {
        this.goodsDesp = goodsDesp;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o.getClass() == Goods.class){
            Goods goods = (Goods) o;
            if(goods.getGoodsDesp() == this.getGoodsDesp() && goods.getGoodsId() == this.getGoodsId()
                    && goods.getGoodsName() == this.getGoodsName() && goods.getPrice() == this.getPrice()){
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = result * prime + (int)price;
        result = result * prime + (goodsId == null ? 0 : goodsId.hashCode());
        result = result * prime + (goodsName == null ? 0 : goodsName.hashCode());
        result = result * prime + (goodsDesp == null ? 0 : goodsDesp.hashCode());

        return result;

    }

    @Override
    public String toString() {
        return "Goods{" +
                "goodsId: " + goodsId  +
                ", goodsName: " + goodsName  +
                ", price: " + price +
                ", goodsDesp: " + goodsDesp +
                '}';
    }
}
