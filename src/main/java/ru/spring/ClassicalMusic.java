package ru.spring;

import lombok.AccessLevel;

public class ClassicalMusic implements Music {

    private ClassicalMusic() {

    }

    public static ClassicalMusic getInstance() {
        return new ClassicalMusic();
    }

    public void classicalMusicBeanInit() {
        System.out.println("Initialization bean: " + ClassicalMusic.class.getName());
    }

    public void classicalMusicBeanDestroy() {
        System.out.println("Destroying bean: " + ClassicalMusic.class.getName());
    }

    @Override
    public String getSong() {
        return "Moon Rhapsody";
    }
}
