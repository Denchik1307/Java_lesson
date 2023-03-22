package oop.homework.one.geo;

public class Link {

    private final Person personOne;
    private final Relationship relationship;
    private final Person personTwo;

    public Person getPersonOne() {
        return personOne;
    }

    public Relationship getLinks() {
        return relationship;
    }

    public Person getPersonTwo() {
        return personTwo;
    }

    public Link(Person personOne, Relationship relationship, Person personTwo) {
        this.personOne = personOne;
        this.relationship = relationship;
        this.personTwo = personTwo;
    }

    @Override
    public String toString() {
        return String.format("%s ↔ %s (%s)\n", personOne, personTwo, relationship);
    }

}
