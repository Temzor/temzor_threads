package ru.j4j.inheritance;

public class Programmer extends Engineer {
    private final String programLang;

    public Programmer(boolean degree, int experience, String programLang) {
        super(degree, experience);
        this.programLang = programLang;
    }
}
