package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

public class MusicPlayer {
    private List<Music> genres;

    private int volume;
    private String name;



    public MusicPlayer(Genres genre) {
        this.genres = genre.getGenres();
    }


    public void  playMusic() {
        System.out.println(genres.get((int) (Math.random() * 3)).getSong());
    }

    public int getVolume() {
        return volume;
    }


    public String getName() {
        return name;
    }

}
