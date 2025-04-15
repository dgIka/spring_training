package org.example;

import org.springframework.cache.annotation.CachePut;
import org.springframework.stereotype.Component;

import java.util.List;


public class RockMusic implements Music{
    private List<String> list;

    public RockMusic(List<String> list) {
        this.list = list;
        list.add("Bohemian Rhapsody");
        list.add("Smells Like Teen Spirit");
        list.add("Stairway to Heaven");
    }

    @Override
    public String getSong() {
        return this.list.get((int) (Math.random() * 3));
    }
}
