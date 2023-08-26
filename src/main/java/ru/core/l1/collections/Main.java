package ru.core.l1.collections;

public class Main {
    public static void main(String[] args) {
        String[] firstEmployees = {
                "Nick",
                "Anna",
                "Belka",
                "Zubr"
        };
        String[] secondEmployees = new String[firstEmployees.length + 1];
        System.arraycopy(firstEmployees, 0, secondEmployees, 0, firstEmployees.length);
        secondEmployees[secondEmployees.length - 1] = "Guba";
        firstEmployees = secondEmployees;
        firstEmployees[1] = null;

        String[] newNames = new String[firstEmployees.length - 1];
        for (int i = 0, j = 0; i < firstEmployees.length; i++) {
            if (firstEmployees[i] != null) {
                newNames[j] = firstEmployees[i];
                j++;
            }
        }
        firstEmployees = newNames;

        for (String firstEmployee : firstEmployees) {
            System.out.println(firstEmployee);
        }

    }
}
