package org.example;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring  {
    public static void main(String[] args) throws BeansException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

//        Music music= context.getBean("classicalMusic", ClassicalMusic.class);
//        Music music1 = context.getBean("rockMusic", RockMusic.class);
//        Music music2 = context.getBean("rapMusic", RapMusic.class);
//
//
//        MusicPlayer musicPlayer= new MusicPlayer(music);
//        MusicPlayer musicPlayer1= new MusicPlayer(music1);
//        MusicPlayer musicPlayer2= new MusicPlayer(music2);
//
//        musicPlayer.playMusic();
//        musicPlayer1.playMusic();
//        musicPlayer2.playMusic();

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);
        context.close();
    }
}
