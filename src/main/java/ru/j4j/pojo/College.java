package ru.j4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setSurname("Libovsky");
        student.setGroup(1814);
        student.setStatStudy(new Date());

        System.out.printf("Student: %s, Group: %s, Start of study: %s", student.getSurname(),
                student.getGroup(), student.getStatStudy());
    }
}
