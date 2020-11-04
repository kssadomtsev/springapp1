package ru.sadomtsev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;


@Component
public class MusicPlayer {
    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic(Genre genre) {
        if (genre == Genre.CLASSICAL) {
            return getRandomChestItem(music2.getSongs());
        } else {
            return getRandomChestItem(music1.getSongs());
        }
    }

    private String getRandomChestItem(List<String> items) {
        return items.get(new Random().nextInt(items.size()));
    }
}
