package oop.homework.one;

import java.util.ArrayList;
import java.util.Objects;

public class Research {
    ArrayList<String> result = new ArrayList<>();
    ArrayList<Node> tree;

    public Research(GeoTree geoTree) {
        tree = geoTree.getTree();
    }

    public ArrayList<String> spend(Person personOne, Relationship re) {
        for (Node t : tree) {
            if (Objects.equals(t.getP1().getFullName(), personOne.getFullName()) && t.getRe() == re) {
                result.add(t.getP2().getFullName());
            }
        }
        return result;
    }

}
