package ru.sadomtsev.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //Music music = context.getBean("musicBean", Music.class);

        //MusicPlayer musicPlayer = new MusicPlayer(music);
/*        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayerTwo = context.getBean("musicPlayer", MusicPlayer.class);

        boolean compramison = musicPlayer == musicPlayerTwo;

        System.out.println(compramison);

        musicPlayer.playMusic();

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());
        context.close();*/
        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);

        context.close();

    }
}
