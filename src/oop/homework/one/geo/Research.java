package oop.homework.one.geo;

import java.util.ArrayList;

public class Research {
    //    private final ArrayList<String> result = new ArrayList<>();
    private final ArrayList<Link> tree;

    public Research(GeoTree geoTree) {
        tree = geoTree.getTree();
    }

    public String spend(Person personForSpend, Relationship relationship) {
        StringBuilder result = new StringBuilder();
        for (Link person : tree) {
            if (personForSpend.equals(person.getPersonOne()) && person.getLinks().equals(relationship)) {
                result.append(person.toString());
            }
        }
        if (result.length() < 1) {
            result.append(relationship)
                    .append(" not found");
        }
        return result.toString();
    }

    public String spend(Person personForSpend) {
        StringBuilder result = new StringBuilder();
        for (Link person : tree) {
            if (personForSpend.equals(person.getPersonOne())) {
                result.append(person.toString());
            }
        }
        if (result.length() < 1) {
            result.append(personForSpend.toString())
                    .append(" ↔ spend not found");
        }
        return result.toString();
    }


}
