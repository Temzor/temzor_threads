package ru.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringStart {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayerSingle = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        System.out.println("Is singleton (scope default singleton): " + (musicPlayer == musicPlayerSingle));

        context.close();
    }
}
