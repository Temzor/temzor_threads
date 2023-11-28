package ru.j4j.oop;

public class Local {
    private String name = "Dmitrii";

    public void getFullName() {
        final String surname = "Kapustin";

        class FullName {

            public void printFullName() {
                System.out.println(name + " " + surname);
            }

        }

        FullName fullName = new FullName();
        fullName.printFullName();
    }

    public static void main(String[] args) {
        Local local = new Local();
        local.getFullName();
    }

}
