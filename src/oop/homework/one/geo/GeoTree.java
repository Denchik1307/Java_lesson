package oop.homework.one.geo;

import java.util.ArrayList;

public interface GeoTree {
    ArrayList<Link>  getTree();
    void appendBrotherOrSister(Person personOne, Person personTwo);
    void appendParent(Person personOne, Person personTwo);
    void appendChildren(Person personOne, Person personTwo);
    void appendPartner(Person personOne, Person personTwo);
}
