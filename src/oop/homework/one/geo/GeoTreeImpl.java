package oop.homework.one.geo;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class GeoTreeImpl implements GeoTree {
    private final ArrayList<Link> tree = new ArrayList<>();

    public ArrayList<Link> getTree() {
        return this.tree;
    }

    public void appendLink(Person personOne, @NotNull Relationship relationship, Person personTwo) {
        if (relationship.equals(Relationship.children)) {
            appendParentOrParent(personOne, personTwo);
        } else if (relationship.equals(Relationship.parent)) {
            appendParentOrParent(personTwo, personOne);
        } else {
            this.tree.add(new Link(personOne, relationship, personTwo));
            this.tree.add(new Link(personTwo, relationship, personOne));
        }
    }

    private void appendParentOrParent(Person personOne, Person personTwo) {
        this.tree.add(new Link(personOne, Relationship.parent, personTwo));
        this.tree.add(new Link(personTwo, Relationship.children, personOne));
    }
}
