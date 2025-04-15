package org.example;

import java.util.ArrayList;
import java.util.List;

public class Genres {
    private List<Music> genres = new ArrayList<Music>();

    public Genres(Music... musics) {
        for (Music genre1 : musics) {
            addGenre(genre1);
        }
    }

    private void addGenre(Music music) {
        this.genres.add(music);
    }

    public List<Music> getGenres() {
        return genres;
    }
}
