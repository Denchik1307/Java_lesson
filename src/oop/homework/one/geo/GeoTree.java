package oop.homework.one.geo;

import java.util.ArrayList;

public class GeoTree {
    private final ArrayList<Link> tree = new ArrayList<>();

    public ArrayList<Link> getTree() {
        return this.tree;
    }

    public void appendBrotherOrSister(Person personOne, Person personTwo) {
        this.tree.add(new Link(personOne, Relationship.brotherOrSister, personTwo));
        this.tree.add(new Link(personTwo, Relationship.brotherOrSister, personOne));
    }

    public void appendParent(Person personOne, Person personTwo) {
        this.tree.add(new Link(personOne, Relationship.parent, personTwo));
        this.tree.add(new Link(personTwo, Relationship.children, personOne));
    }

    public void appendChildren(Person personOne, Person personTwo) {
        this.tree.add(new Link(personOne, Relationship.children, personTwo));
        this.tree.add(new Link(personTwo, Relationship.parent, personOne));
    }

    public void appendPartner(Person personOne, Person personTwo) {
        tree.add(new Link(personOne, Relationship.partner, personTwo));
        tree.add(new Link(personTwo, Relationship.partner, personOne));
    }
}