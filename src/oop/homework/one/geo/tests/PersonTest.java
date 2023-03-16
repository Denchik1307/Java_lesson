package oop.homework.one.geo.tests;

import oop.homework.one.geo.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    private final String NAME = "Sashha";
    private final String EMPTY = "Empty";
    private final Person sasha = new Person(NAME);
    @Test
    void changeName() {

        sasha.changeName("Sasha");
        assertEquals(sasha.getFullName(),"Sasha");
    }
    @Test
    void getBirthday() {
        assertEquals(sasha.getBirthday(),EMPTY);
    }

    @Test
    void setOrChangeBirthday() {
        sasha.setOrChangeBirthday("13.07.1981");
        assertEquals(sasha.getBirthday(),"13.07.1981");
    }

    @Test
    void testToString() {
        assertEquals(sasha.getFullName(),sasha.toString());
    }
}