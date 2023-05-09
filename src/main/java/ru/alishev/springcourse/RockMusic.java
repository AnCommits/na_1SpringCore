package ru.alishev.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//@Component
public class RockMusic implements Music {

    @Override
    public String getSong() {
        return "Wind cries Mary";
    }

    @Override
    public List<String> getSongList() {
        List<String> rockMusicList = new ArrayList<>();
        rockMusicList.add("Rock_01");
        rockMusicList.add("Rock_02");
        rockMusicList.add("Rock_03");
        return rockMusicList;
    }
}
