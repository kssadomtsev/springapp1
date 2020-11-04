package ru.sadomtsev.springcourse;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RockMusic implements Music {
    private List<String> songs = List.of("Song1_rock","Song2_rock", "Song3_rock");
    @Override
    public List<String> getSongs() {
        return songs;
    }
}
