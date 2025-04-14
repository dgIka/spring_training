package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    private Music classical;
    private Music rock;
    private Music rap;

    //IoC

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music classical, @Qualifier("rockMusic") Music rock, @Qualifier("rapMusic") Music rap) {
        this.classical = classical;
        this.rock = rock;
        this.rap = rap;

    }


    public void   playMusic(Genre genreEnum) {
        switch (genreEnum) {
            case RAP:
                System.out.println(this.rap.getSong());
                break;
            case ROCK:
                System.out.println(this.rock.getSong());
                break;
            case CLASSICAL:
                System.out.println(this.classical.getSong());
                break;

        }
    }
}
