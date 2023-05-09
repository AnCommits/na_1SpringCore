package ru.alishev.springcourse;

import java.util.List;

public class RetroMusic implements Music {
    @Override
    public String getSong() {
        return "RetroMusic";
    }

    @Override
    public List<String> getSongList() {
        return null;
    }
}
