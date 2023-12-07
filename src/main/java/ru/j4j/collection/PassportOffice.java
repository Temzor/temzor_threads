package ru.j4j.collection;

import java.util.HashMap;
import java.util.Map;

public class PassportOffice {
    private final Map<String, Citizen> citizensData = new HashMap<>();

    public boolean add(Citizen citizen) {
        boolean rsl = false;
        if (!citizensData.containsKey(citizen.getPassport())) {
            citizensData.put(citizen.getPassport(), citizen);
            rsl = true;
        }
        return rsl;
    }

    public Citizen get(String passport) {
        return citizensData.get(passport);
    }
}
