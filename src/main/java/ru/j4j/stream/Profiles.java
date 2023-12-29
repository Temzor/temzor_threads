package ru.j4j.stream;

import java.util.List;

public class Profiles {

    public static List<Address> collect(List<Profile> profiles) {
        return profiles.stream()
                .map(profile -> new Address(profile.getAddress().getCity(), profile.getAddress().getStreet(),
                        profile.getAddress().getHome(), profile.getAddress().getApartment()))
                .toList();
    }
}
