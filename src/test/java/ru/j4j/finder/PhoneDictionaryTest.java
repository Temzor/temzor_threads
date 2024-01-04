package ru.j4j.finder;

import org.junit.jupiter.api.Test;
import ru.j4j.finder.model.Person;

import static org.assertj.core.api.Assertions.assertThat;

class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        var phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        var persons = phones.find("Petr");
        assertThat(persons.get(0).getSurName()).isEqualTo("Arsentev");
    }
    @Test
    public void whenNoFindByName() {
        var phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        var persons = phones.find("Dmitrii");
        assertThat(persons.isEmpty()).isTrue();
    }
}