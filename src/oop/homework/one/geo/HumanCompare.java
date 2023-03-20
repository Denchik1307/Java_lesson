package oop.homework.one.geo;

import java.util.Comparator;

public class HumanCompare implements Comparator<Person> {
    @Override
    public int compare(Person personOne, Person personTwo) {
        return personOne.getBirthday().compareTo(personTwo.getBirthday()) ;
    }
}
