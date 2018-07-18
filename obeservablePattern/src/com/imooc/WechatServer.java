package com.imooc;

import java.util.ArrayList;
import java.util.List;

public class WechatServer implements Observerable {
    private List<Observer> list;
    private String message;

    public WechatServer(List<Observer> list) {
        this.list = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        list.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if(!list.isEmpty()){
            list.remove(o);
        }

    }

    @Override
    public void notifyObserver() {
        for(Observer c : list){
            c.update(message);
        }

    }

    public void setInformation(String s){
        this.message = s;
        System.out.println("微信服务更新消息：" + s);
        notifyObserver();
    }
}
