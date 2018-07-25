package com.imooc;

import java.io.Serializable;

public class Song implements Serializable{
    private final String id;
    private String name;
    private String singer;

    public Song(String id, String name, String singer) {
        this.id = id;
        this.name = name;
        this.singer = singer;
    }

    public String getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Song)) return false;

        Song song = (Song) o;

        if (getId() != null ? !getId().equals(song.getId()) : song.getId() != null) return false;
        if (getName() != null ? !getName().equals(song.getName()) : song.getName() != null) return false;
        return getSinger() != null ? getSinger().equals(song.getSinger()) : song.getSinger() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getSinger() != null ? getSinger().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "歌曲信息：" +
                "歌曲id = '" + id + " " +
                "歌曲名 ='" + name + " " +
                "演唱者 ='" + singer + " ";
    }
}
