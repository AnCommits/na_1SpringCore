package ru.alishev.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {

        System.out.println("Point 0");

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        System.out.println("Point 1");

        Music music1 = context.getBean("classicalMusicBean", Music.class);
        Music music4 = context.getBean("classicalMusicBean", Music.class);
//        Music music2 = context.getBean("rockMusicBean", Music.class);
//        Music music3 = context.getBean("retroMusicBean", Music.class);

        System.out.println(music1.getSong());

//        MusicPlayer firstMusicPlayer = context.getBean("musicPlayerBean", MusicPlayer.class);
//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayerBean", MusicPlayer.class);
//
//        boolean comparison = firstMusicPlayer == secondMusicPlayer;
//        System.out.println(comparison);
//        System.out.println(firstMusicPlayer);
//        System.out.println(secondMusicPlayer);
//        firstMusicPlayer.setVolume(10);
//        System.out.println(firstMusicPlayer.getVolume());
//        System.out.println(secondMusicPlayer.getVolume());

//        musicPlayer.playMusic();
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());

        context.close();

        System.out.println("Point 2");
    }
}
