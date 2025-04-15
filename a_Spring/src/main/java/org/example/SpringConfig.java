package org.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic(new ArrayList<>());
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic(new ArrayList<>());
    }

    @Bean
    public RapMusic rapMusic() {
        return new RapMusic(new ArrayList<>());
    }
    @Bean
    public Genres genres() {
        return new Genres(rapMusic(), rockMusic(), classicalMusic());
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(genres());
    }
}
