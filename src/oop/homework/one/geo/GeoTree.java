package oop.homework.one.geo;

import java.util.ArrayList;

public interface GeoTree {
    ArrayList<Link>  getTree();

    void appendLink(Person personOne, Relationship relationship, Person personTwo);
}
