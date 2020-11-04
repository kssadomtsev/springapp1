package ru.sadomtsev.springcourse;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClassicalMusic implements Music {
    public List<String> songs = List.of("Song1_classic","Song2_classic", "Song3_classic");

    private ClassicalMusic() {
    }

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
