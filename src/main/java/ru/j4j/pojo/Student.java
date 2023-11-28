package ru.j4j.pojo;

import java.util.Date;

public class Student {
    private String surname;
    private int group;
    private Date statStudy;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public Date getStatStudy() {
        return statStudy;
    }

    public void setStatStudy(Date statStudy) {
        this.statStudy = statStudy;
    }
}
