package ru.alishev.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

//        Music music1 = context.getBean("classicalMusicBean", Music.class);
//        Music music2 = context.getBean("rockMusicBean", Music.class);
//        Music music3 = context.getBean("retroMusicBean", Music.class);

        MusicPlayer firstMusicPlayer = context.getBean("musicPlayerBean", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayerBean", MusicPlayer.class);

        boolean comparison = firstMusicPlayer == secondMusicPlayer;
        System.out.println(comparison);
        System.out.println(firstMusicPlayer);
        System.out.println(secondMusicPlayer);
        firstMusicPlayer.setVolume(10);
        System.out.println(firstMusicPlayer.getVolume());
        System.out.println(secondMusicPlayer.getVolume());

//        musicPlayer.playMusic();
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());

        context.close();
    }
}
