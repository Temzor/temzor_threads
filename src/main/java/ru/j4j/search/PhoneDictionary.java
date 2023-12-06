package ru.j4j.search;

import ru.j4j.search.model.Person;

import java.util.ArrayList;

public class PhoneDictionary {
    private final ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (Person p : persons) {
            if (p.toString().contains(key)) {
                result.add(p);
            }
        }
        return result;
    }
}
