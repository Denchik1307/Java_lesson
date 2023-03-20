package oop.homework.one.geo;

public class LinkImpl implements Link {

    private final Person personOne;
    private final Relationship relationship;
    private final Person personTwo;

    @Override
    public Person getPersonOne() {
        return personOne;
    }

    @Override
    public Relationship getLinks() {
        return relationship;
    }

    @Override
    public Person getPersonTwo() {
        return personTwo;
    }

    public LinkImpl(Person personOne, Relationship relationship, Person personTwo) {
        this.personOne = personOne;
        this.relationship = relationship;
        this.personTwo = personTwo;
    }

    @Override
    public String toString() {
        return String.format("%s ↔ %s (%s)\n", personOne, personTwo, relationship);
    }

}
