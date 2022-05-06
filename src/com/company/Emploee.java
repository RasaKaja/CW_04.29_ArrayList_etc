package com.company;

public class Emploee {
    String firstName, lastName;
    private int age;

    Emploee(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    int getAge(){
        return age;
    }

    @Override
    public String toString() {
        return "Emploee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
