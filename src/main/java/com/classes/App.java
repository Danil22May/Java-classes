package com.classes;


public final class App {

    public static void main(String[] args) {
        Person person1 = new Person("Mark", "Kil", 129839, 1990, "Russia", 'H');
        Person person2 = new Person("Daniil", "Tararak", 18231927, 2004, "Ukraine", 'H');
        person1.printDetails();
        System.out.println();
        person2.printDetails();
    }
}
