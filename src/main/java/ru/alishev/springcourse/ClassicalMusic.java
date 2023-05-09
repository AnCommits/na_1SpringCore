package ru.alishev.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component
@Scope("prototype")
public class ClassicalMusic implements Music {

    @PostConstruct
    public void doMyInit() {
        System.out.println("My initialization");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("My destruction");
    }

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
