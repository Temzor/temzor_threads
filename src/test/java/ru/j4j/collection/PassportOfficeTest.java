package ru.j4j.collection;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PassportOfficeTest {
    @Test
    public void whenTestAddMethod() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertThat(office.get(citizen.getPassport())).isEqualTo(citizen);
    }

    @Test
    public void whenTestAddMethodFalse() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertThat(office.add(citizen)).isFalse();
    }
    @Test
    public void whenTestAddMethodTrue() {
        Citizen citizenFirst = new Citizen("14Fhg", "Turkun Gamgunuly");
        Citizen citizenSecond = new Citizen("2f44a", "Petr Arsentev");
        PassportOffice office = new PassportOffice();
        office.add(citizenFirst);
        assertThat(office.add(citizenSecond)).isTrue();
    }
}