package ru.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringStart {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        Music classicalMusic = context.getBean("classicalMusic", Music.class);
        System.out.println(classicalMusic.getSong());

        Music rockMusic = context.getBean("rockMusic", Music.class);
        System.out.println(rockMusic.getSong());

        context.close();
    }
}
