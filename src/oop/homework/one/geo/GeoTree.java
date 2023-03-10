package oop.homework.one.geo;

import java.util.ArrayList;

public class GeoTree {
    private final ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

    public void appendChildren(Person parent, Person children) {
        tree.add(new Node(parent, Relationship.parent, children));
        tree.add(new Node(children, Relationship.children, parent));
    }

    public void appendPartner(Person partnerOne, Person partnerTwo) {
        tree.add(new Node(partnerOne, Relationship.married,partnerTwo));
        tree.add(new Node(partnerTwo, Relationship.married,partnerOne));
        for (var item: tree){

        }
    }
}
