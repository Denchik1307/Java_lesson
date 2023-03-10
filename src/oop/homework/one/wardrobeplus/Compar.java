package oop.homework.one.wardrobeplus;

import oop.homework.one.geo.Person;

import java.util.Comparator;

public class Compar implements Comparator<Person> {
    @Override
    public int compare(Person personOne, Person personTwo) {
        return personOne.getAge().compareTo(personTwo.getAge());
    }
}
