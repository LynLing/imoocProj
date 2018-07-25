package com.imooc;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PlayListCollection {

    private Map<String, PlayList> playListMap = new HashMap<>();

    public PlayListCollection(Map<String, PlayList> playListMap) {
        this.playListMap = playListMap;
    }

    public Map<String, PlayList> getPlayListMap() {
        return playListMap;
    }

    public void setPlayListMap(Map<String, PlayList> playListMap) {
        this.playListMap = playListMap;
    }

    // 添加播放列表
    public void addPlayList(PlayList playList) throws Exception{

        if(playListMap.containsKey(playList.getPlayListName())){
            System.out.println("已存在该播放列表！");
            return;
        }

        playListMap.put(playList.getPlayListName(), playList);


    }

    // 删除播放列表
    public void deletePlayList(PlayList playList) throws Exception{
        if(!playListMap.containsKey(playList.getPlayListName())){
            System.out.println("未找到该播放列表");
            return;
        }

        playListMap.remove(playList.getPlayListName());
    }

    // 通过名字查询
    public PlayList searchPlayListByName(String playListname){

        if(!playListMap.containsKey(playListname)){
            System.out.println("该播放列表不存在，请先将播放列表添加到播放器中！");
            return null;
        }

        return playListMap.get(playListname);

    }

    public PlayListCollection() {
    }

    // 显示所有播放列表名称
    public void displayPlayListName(){

        Set<String> set = playListMap.keySet();
        for(String c : set){
            System.out.println(c);

        }
    }
}
