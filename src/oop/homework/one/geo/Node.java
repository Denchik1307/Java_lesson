package oop.homework.one.geo;

public record Node(Person personOne, Relationship relationship, Person personTwo) {

    @Override
    public String toString() {
        return String.format("<%s %s %s>", personOne, relationship, personTwo);
    }
}
