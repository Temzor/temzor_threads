package ru.spring;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Component
public class MusicPlayer {
    private List<Music> musics = new ArrayList<>();

    private String name;
    private int volume;

    public void playMusic() {
        for (Music music : musics) {
            System.out.println("Playing: " + music.getSong());
        }
    }
}
