package com.imooc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class TestDemo {

    public void testSong(){
        Song test1 = new Song("1", "2","3");


    }

    public void testPlayList() throws Exception{
        PlayList playList = new PlayList("name", new ArrayList<Song>());
        playList.addToPlayList(new Song("1", "2", "3"));
        playList.deleteSong("1");
        playList.displayAllSong();
        playList.exportPlayList();


    }

    public void testPlayListCollection() throws Exception{
        PlayListCollection playListCollection = new PlayListCollection();
        playListCollection.searchPlayListByName("name");
        playListCollection.addPlayList(new PlayList("name", new ArrayList<Song>()));
        playListCollection.displayPlayListName();
    }

    // 主菜单

    public void mainMenu(){

        System.out.println("*****************************************");
        System.out.println("");
        System.out.println("         **主菜单**               ");
        System.out.println("       1--播放列表管理             ");
        System.out.println("       2--播放器管理               ");
        System.out.println("       0--退出                    ");
        System.out.println("");
        System.out.println("*****************************************");
        System.out.println("请输入对应数字进行操作");

    }
    // 播放列表管理菜单
    public void playListMenu(){
        System.out.println("*****************************************");
        System.out.println("");
        System.out.println("         **播放列表管理**               ");
        System.out.println("       1--将歌曲添加到主播放列表          ");
        System.out.println("       2--将歌曲添加到普通播放列表        ");
        System.out.println("       3--通过歌曲id查询播放列表中的歌曲   ");
        System.out.println("       4--通过歌曲名称查询播放列表中的歌曲 ");
        System.out.println("       5--修改播放列表中的歌曲            ");
        System.out.println("       6--删除播放列表中的歌曲            ");
        System.out.println("       7--显示播放列表中的所有歌曲         ");
        System.out.println("       8--导出歌单                       ");
        System.out.println("       9--返回上一级菜单                  ");
        System.out.println("");
        System.out.println("*****************************************");
        System.out.println("请输入对应数字对播放列表进行管理");

    }

    // 播放器菜单
    public void playMenu(){
        System.out.println("****************************************");
        System.out.println("");
        System.out.println("         **播放器管理**               ");
        System.out.println("       1--向播放器添加播放列表          ");
        System.out.println("       2--从播放器删除播放列表        ");
        System.out.println("       3--通过名字查询播放列表信息   ");
        System.out.println("       4--显示所有播放列表名称 ");
        System.out.println("       9--返回上一级菜单                  ");
        System.out.println("");
        System.out.println("*****************************************");
        System.out.println("请输入对应数字对播放器进行管理");


    }

    // 主流程实现
    public void test() throws Exception{
        Scanner sc = new Scanner(System.in);
        PlayListCollection playListCollection = new PlayListCollection();
        PlayList mainList = new PlayList("主歌单", new ArrayList<Song>());
        playListCollection.addPlayList(mainList);
        Boolean flag = true;

        while(flag){
            this.mainMenu();
            switch(sc.nextInt()){
                case 1:
                    boolean flag1 = true;
                    while(flag1){
                        this.playListMenu();
                        switch(sc.nextInt()){
                            case 1:
                                System.out.println("将歌曲添加到主播放列表");
                                System.out.println("请输入需要添加的歌曲的数量");
                                int count1 = sc.nextInt();
                                for(int i = 0; i < count1; i++){
                                    System.out.println("请输入第" + (i + 1) + "首歌曲");
                                    System.out.println("请输入歌曲的id");
                                    String id = sc.next();
                                    System.out.println("请输入歌曲的名称");
                                    String name = sc.next();
                                    System.out.println("请输入演唱者");
                                    String singer = sc.next();
                                    Song song = new Song(id, name, singer);
                                    mainList.addToPlayList(song);
                                }
                                break;
                            case 2:
                                System.out.println("将歌曲添加到普通播放列表");
                                System.out.println("请输入要添加的播放列表名称");
                                String playListName = sc.next();
                                if(playListCollection.searchPlayListByName(playListName) == null){
                                    break;
                                }else{
                                    PlayList playList = playListCollection.searchPlayListByName(playListName);
                                    System.out.println("请输入需要添加的歌曲的数量");
                                    int num = sc.nextInt();
                                    for(int i = 0; i < num; i++){
                                        System.out.println("请输入第" + (i + 1) + "首歌曲");
                                        System.out.println("请输入歌曲的id");
                                        String id = sc.next();
                                        String name = null;
                                        String singer = null;
                                        if(mainList.searchSongById(id) == null ){
                                            System.out.println("该歌曲在主播放列表不存在，继续输入歌曲的其他信息");
                                            System.out.println("请输入歌曲名称：");
                                            name = sc.next();
                                            System.out.println("请输入演唱者：");
                                            singer = sc.next();
                                            Song newSong = new Song(id, name, singer);
                                            mainList.addToPlayList(newSong);
                                            playList.addToPlayList(newSong);
                                        }else{
                                            playList.addToPlayList(mainList.searchSongById(id));
                                        }
                                    }
                                    System.out.println("主播放列表：");
                                    System.out.println("播放列表内的所有歌曲：");
                                    mainList.displayAllSong();
                                    System.out.println("普通播放列表：");
                                    System.out.println("播放列表内的所有歌曲：");
                                    playList.displayAllSong();
                                    break;
                                }
                            case 3:
                                System.out.println("通过歌曲id查询播放列表中的歌曲");
                                System.out.println("请输入需要查询的播放列表名称");
                                String listName = sc.next();
                                if(playListCollection.searchPlayListByName(listName) == null){
                                    break;
                                }
                                System.out.println("请输入需要查询的歌曲id");
                                String id = sc.next();
                                if(playListCollection.searchPlayListByName(listName).searchSongById(id) == null){
                                    break;
                                }else{
                                    System.out.println("该歌曲信息为");
                                    System.out.println(playListCollection.searchPlayListByName(listName).searchSongById(id));
                                }
                                break;
                            case 4:
                                System.out.println("通过歌曲名称查询播放列表中的歌曲");
                                System.out.println("请输入需要查询的播放列表名称");
                                String listName4 = sc.next();
                                if(playListCollection.searchPlayListByName(listName4) == null){
                                    break;
                                }
                                System.out.println("请输入需要查询的歌曲名");
                                String name4 = sc.next();
                                if(playListCollection.searchPlayListByName(listName4).searchSongByName(name4) == null){
                                    break;
                                }else{
                                    System.out.println("该歌曲信息为");
                                    System.out.println(playListCollection.searchPlayListByName(listName4).searchSongByName(name4));
                                }
                                break;
                            case 5:
                                System.out.println("修改播放列表中的歌曲");
                                System.out.println("请输入要修改的歌曲id");
                                String id5 = sc.next();
                                if(mainList.searchSongById(id5) == null){
                                    break;
                                }else{
                                    System.out.println("请输入修改后的歌曲名称");
                                    String name5 = sc.next();
                                    System.out.println("请输入修改后的演唱者");
                                    String singer5 = sc.next();
                                    mainList.searchSongById(id5).setName(name5);
                                    mainList.searchSongById(id5).setSinger(singer5);
                                }
                                break;
                            case 6:
                                System.out.println("删除播放列表中的歌曲");
                                System.out.println("请输入要删除的歌曲id");
                                String id6 = sc.next();
                                if(mainList.searchSongById(id6) == null){
                                    break;
                                }else{
                                    Map<String, PlayList> map = playListCollection.getPlayListMap();
                                    Iterator iter = map.entrySet().iterator();
                                    while(iter.hasNext()){
                                        Map.Entry entry = (Map.Entry) iter.next();
                                        PlayList playList = (PlayList) entry.getValue();
                                        if(playList.searchSongById(id6) != null){
                                            playList.deleteSong(id6);
                                        }
                                    }
                                }
                                break;
                            case 7:
                                System.out.println("显示播放列表的所有信息");
                                System.out.println("请输入要显示的播放列表名称");
                                String playListName7 = sc.next();
                                System.out.println("播放列表中的所有歌曲为");
                                playListCollection.searchPlayListByName(playListName7).displayAllSong();
                                break;
                            case 8:
                                System.out.println("导出歌单");
                                System.out.println("请输入要导出的歌单名");
                                String name8 = sc.next();
                                playListCollection.searchPlayListByName(name8).exportPlayList();
                                break;
                            case 9:
                                flag1 = false;
                                break;

                            default:
                                System.out.println("无效输入！");
                        }

                    }
                    break;
                case 2:
                    boolean flag2 = true;
                    while(flag2){
                        this.playMenu();
                        switch(sc.nextInt()){
                            case 1:
                                System.out.println("向播放器添加播放列表");
                                System.out.println("输入要添加的播放列表名称");
                                String listName = sc.next();
                                playListCollection.addPlayList(new PlayList(listName, new ArrayList<Song>()));
                                break;
                            case 2:
                                System.out.println("向播放器删除播放列表");
                                System.out.println("输入要删除的播放列表名称");
                                String listName2 = sc.next();
                                if(playListCollection.searchPlayListByName(listName2) == null){
                                    break;
                                }else{
                                    playListCollection.addPlayList(playListCollection.searchPlayListByName(listName2));
                                }
                                break;
                            case 3:
                                System.out.println("通过名字查询播放列表信息");
                                System.out.println("输入要查询的播放列表名称");
                                String listName3 = sc.next();
                                if(playListCollection.searchPlayListByName(listName3) == null){
                                    break;
                                }else{
                                    System.out.println("该播放列表存在！");
                                    System.out.println("该播放列表的名称是： " + listName3);
                                    System.out.println("播放列表中的所有歌曲：");
                                    playListCollection.searchPlayListByName(listName3).displayAllSong();
                                }
                                break;
                            case 4:
                                System.out.println("显示所有播放列表名称");
                                playListCollection.displayPlayListName();
                                break;
                            case 9:
                                flag2 = false;
                                break;
                            default:
                                System.out.println("无效输入！");
                        }
                    }
                case 0:
                    flag = false;
                    break;
                default:
                    System.out.println("无效输入");
            }
        }

    }
}
