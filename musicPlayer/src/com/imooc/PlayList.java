package com.imooc;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PlayList {

    private String playListName;
    private List<Song> musicList = new ArrayList<Song>();

    public PlayList() {
    }

    public PlayList(String playListName, List musicList) {
        this.playListName = playListName;
        this.musicList = musicList;
    }

    public String getPlayListName() {
        return playListName;
    }

    public void setPlayListName(String playListName) {
        this.playListName = playListName;
    }

    public List getMusicList() {
        return musicList;
    }

    public void setMusicList(List musicList) {
        this.musicList = musicList;
    }

    public void addToPlayList(Song song) throws Exception{

        musicList.add(song);

    }

    // 显示播放列表中的所有歌曲
    public void displayAllSong(){
        if(musicList.size() == 0 || musicList == null){
            System.out.println("列表为空！");
            return;
        }

        for(Song c : musicList){
            System.out.println(c);
        }

    }

    public Song searchSongById(String id) throws IOException{

        if(musicList.size() == 0 || musicList == null){
            System.out.println("播放列表不存在");
            return null;
        }

        for(Song s : musicList){
            if(s.getId().equals(id)){
                return s;
            }
        }
        System.out.println("歌曲不存在");
        return null;


    }

    // 通过名称查询歌曲
    public Song searchSongByName(String name) throws IOException{
        if(musicList.size() == 0 || musicList == null){
            System.out.println("播放列表不存在");
            return null;
        }

        for(Song s : musicList){
            if(s.getName().equals(name)){
                return s;
            }
        }
        System.out.println("歌曲不存在");
        return null;


    }

    // 修改歌曲
    public void updateSong(Song song) throws IOException{

        Song song1 = this.searchSongById(song.getId());
        if(song1 == null){
            System.out.println("试图修改的歌曲不存在，请检查播放列表。");
            return;
        }
        song1.setName(song.getName());
        song1.setSinger(song.getSinger());

    }

    // 从播放列表删除歌曲
    public void deleteSong(String id) throws IOException{
        Song song = this.searchSongById(id);
        if(song == null){
            System.out.println("试图删除的的歌曲不存在，请检查播放列表。");
            return;
        }
        musicList.remove(song);

    }

    // 导出歌单
    public void exportPlayList(){
        try{
            FileOutputStream fos = new FileOutputStream(this.getPlayListName() + ".txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for(Song c : musicList){
                oos.writeObject(c);
            }
            oos.flush();
            fos.close();
            oos.close();
        }catch(FileNotFoundException err){
            err.printStackTrace();
        }catch(IOException err){
            err.printStackTrace();
        }
    }
}
