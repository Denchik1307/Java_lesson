package oop.homework.one.geo;

import java.util.ArrayList;
import java.util.Objects;

public class Research {
    ArrayList<String> result = new ArrayList<>();
    private final ArrayList<Node> tree;

    public Research(GeoTree geoTree) {
        tree = geoTree.getTree();
    }

    public ArrayList<String> spend(Person personOne, Relationship relationship) {
        for (Node person : tree) {
            if (Objects.equals(person.personOne().getFullName(), person.personTwo().getFullName()) &&
                    person.relationship() == relationship) {
                result.add(person.personTwo().getFullName());
            }
        }
        return result;
    }

}
