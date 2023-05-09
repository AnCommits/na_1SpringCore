package ru.alishev.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

    @Override
    public List<String> getSongList() {
        List<String> classicalMusicList = new ArrayList<>();
        classicalMusicList.add("Classical_01");
        classicalMusicList.add("Classical_02");
        classicalMusicList.add("Classical_03");
        return classicalMusicList;
    }
}
