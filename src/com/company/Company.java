package com.company;

import java.util.Arrays;

public class Company {
    String name;
    Emploee[] employees = new Emploee[5];

    Company(String name){
        this.name = name;
    }

    public void setEmployees(Emploee[] employees) {
        this.employees = employees;
    }

    double getAverageAge(){
        double totalAge = 0;
        for ( Emploee employee : employees) {
            totalAge += employee.getAge();
        }
        return totalAge/5;
    }

    // cmd: ALT + Insert: to open generate window
    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", employees=" + Arrays.toString(employees) +
                '}';
    }

}
