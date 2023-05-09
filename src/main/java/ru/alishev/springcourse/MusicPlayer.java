package ru.alishev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

//@Component
public class MusicPlayer {

    private List<Music> musicList;

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String playMusic() {
        int numberOfSong = getRandomSongNumber(musicList);
        return "Playing: " + musicList.get(numberOfSong).getSong();
    }

    private int getRandomSongNumber(List<Music> songList) {
        Random ran = new Random();
        return ran.nextInt(songList.size());
    }
}
