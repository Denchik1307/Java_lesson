package oop.homework.one.geo;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
