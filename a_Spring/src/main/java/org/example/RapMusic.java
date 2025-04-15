package org.example;

import org.springframework.stereotype.Component;

import java.util.List;


public class RapMusic implements Music{

    private List<String> list;

    public RapMusic(List<String> list) {
        this.list = list;
        list.add("Lose Yourself");
        list.add("Changes");
        list.add("Gangstas paradise");
    }

    @Override
    public String getSong() {
        return this.list.get((int) (Math.random() * 3));
    }
}
