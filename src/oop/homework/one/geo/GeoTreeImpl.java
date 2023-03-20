package oop.homework.one.geo;

import java.util.ArrayList;

public class GeoTreeImpl implements GeoTree {
    private final ArrayList<Link> tree = new ArrayList<>();

    public ArrayList<Link> getTree() {
        return this.tree;
    }

    @Override
    public void appendBrotherOrSister(Person personOne, Person personTwo) {
        this.tree.add(new LinkImpl(personOne, Relationship.brotherOrSister, personTwo));
        this.tree.add(new LinkImpl(personTwo, Relationship.brotherOrSister, personOne));
    }

    @Override
    public void appendParent(Person personOne, Person personTwo) {
        this.tree.add(new LinkImpl(personOne, Relationship.parent, personTwo));
        this.tree.add(new LinkImpl(personTwo, Relationship.children, personOne));
    }

    @Override
    public void appendChildren(Person personOne, Person personTwo) {
        this.tree.add(new LinkImpl(personOne, Relationship.children, personTwo));
        this.tree.add(new LinkImpl(personTwo, Relationship.parent, personOne));
    }

    @Override
    public void appendPartner(Person personOne, Person personTwo) {
        tree.add(new LinkImpl(personOne, Relationship.partner, personTwo));
        tree.add(new LinkImpl(personTwo, Relationship.partner, personOne));
    }
}