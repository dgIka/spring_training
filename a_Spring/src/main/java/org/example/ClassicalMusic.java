package org.example;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;


import java.util.List;

@Component
public class ClassicalMusic implements Music {
    private List<String> list;

    public ClassicalMusic(List<String> list) {
        this.list = list;
        list.add("Toccata and fugue in d minor");
        list.add("4 seasons");
        list.add("Simphony №9");
    }

    @Override
    public String getSong() {
        return this.list.get((int) (Math.random() * 3));
    }

    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization");
    }
    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }

}
