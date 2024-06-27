package com.classes;

public class Person {
    private String firstName;
    private String lastName;
    private int idNumber;
    private int birthYear;
    private String birthCountry;
    private char gender;

    public Person(String firstName, String lastName, int i, int birthYear, String birthCountry, char gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = i;
        this.birthYear = birthYear;
        this.birthCountry = birthCountry;
        this.gender = gender;
    }

    public void printDetails() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("ID Number: " + idNumber);
        System.out.println("Birth Year: " + birthYear);
        System.out.println("Birth Country: " + birthCountry);
        System.out.println("Gender: " + gender);
    }

}
