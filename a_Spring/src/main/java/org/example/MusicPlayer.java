package org.example;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private Music music;

    //IoC


    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println(this.music.getSong());
    }
}
