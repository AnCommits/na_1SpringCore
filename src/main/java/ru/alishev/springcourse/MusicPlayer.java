package ru.alishev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    private static final Random ran = new Random();
    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic(Genre genre) {
        List<String> songList = switch (genre) {
            case ROCK -> music1.getSongList();
            case CLASSICAL -> music2.getSongList();
        };
        int numberOfSong = getRandomSongNumber(songList);
        return "Playing: " + songList.get(numberOfSong);
    }

    protected int getRandomSongNumber(List<String> songList) {
        return ran.nextInt(songList.size());
    }
}
