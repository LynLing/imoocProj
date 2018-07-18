package com.imooc;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ShoppingCart {
    private static Map<String, GoodInCart> map = new HashMap<>();
    public ShoppingCart(){}

    public ShoppingCart(Map<String, GoodInCart> map) {
        this.setMap(map);
    }

   // private static ShoppingCart instance = null;


    public Map<String, GoodInCart> getMap() {
        return map;
    }

    public void setMap(Map<String, GoodInCart> map) {
        this.map = map;
    }

    public void addGoodsToCart(GoodsManage gm, String goodsId) throws Exception{

        Set<Goods> goods = gm.getGoodsSet();
        Iterator<Goods> it = goods.iterator();
        while(it.hasNext()){
            Goods curGood = it.next();
            if(goodsId.equals(curGood.getGoodsId())){
                GoodInCart goodInCart = new GoodInCart(curGood, 1);
                this.getMap().put(goodsId, goodInCart);
                return;
            }
        }
        System.out.println("没有找到该商品编号，请确认输入正确");


    }

    public void updateNumInCart(String goodsId, int num) throws Exception{
        if(!this.getMap().containsKey(goodsId)){
            System.out.println("该商品不在购物车里");
            return;
        }
        if(num < 0){
            throw new Exception("请输入正整数~~");
        }else if(num == 0){
            if(this.getMap().containsKey(goodsId)){
                this.getMap().remove(goodsId);
                System.out.println("因为商品数量为0，该商品已从购物车中移除");
            }
        }else{
            GoodInCart goodInCart = this.getMap().get(goodsId);
            goodInCart.setNum(num);
            map.put(goodsId, goodInCart);
        }
    }

    public void displayAllInCart() throws Exception{
        if(map.isEmpty()){
            System.out.println("购物车是空的哟，赶快装满吧~~");
            return;
        }
        Set<Map.Entry<String, GoodInCart>> entrySet = map.entrySet();
        for(Map.Entry<String, GoodInCart> entry : entrySet){
            GoodInCart goodInCart = entry.getValue();
            System.out.print(goodInCart.getGoods());
            System.out.println("，数量：" + goodInCart.getNum());
        }

    }

    public double settleAccounts() throws Exception{
        //System.out.println("结算：");
        double sum = 0;
        Set<Map.Entry<String, GoodInCart>> entrySet = map.entrySet();
        for(Map.Entry<String, GoodInCart> entry : entrySet){
            GoodInCart goodInCart = entry.getValue();
            sum += goodInCart.getGoods().getPrice() * goodInCart.getNum();
        }
        map.clear();
        return sum;





    }
}
