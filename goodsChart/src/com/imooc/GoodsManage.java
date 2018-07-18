package com.imooc;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class GoodsManage {

    private Set<Goods> goodsSet = new HashSet<>();
    private static GoodsManage instance = null;

    public GoodsManage(){}

    public GoodsManage(Set<Goods> goodsSet) {
        this.setGoodsSet(goodsSet);
    }



    public Set<Goods> getGoodsSet() {
        return goodsSet;
    }

    public void setGoodsSet(Set<Goods> goodsSet) {
        this.goodsSet = goodsSet;
    }

    public void importGoods() {
        System.out.println("商品信息导入");
        Goods phone = new Goods("goods004", "手机", 2300.0, "android手机");
        Goods yinshuiji = new Goods("goods002", "饮水机", 299.0, "带净化功能的饮饮水机");
        Goods macbook = new Goods("goods003", "笔记本电脑", 4999.0, "15寸笔记本电脑");
        Goods mug = new Goods("goods001", "水杯", 56.0, "不锈钢水杯");
        goodsSet.add(phone);
        goodsSet.add(yinshuiji);
        goodsSet.add(macbook);
        goodsSet.add(mug);
        System.out.println("导入成功");

    }

    public void displayAllGoods() throws Exception{
        Iterator<Goods> it = goodsSet.iterator();
        while(it.hasNext()){
            System.out.println("商品信息：" + it.next());
        }
    }
}
