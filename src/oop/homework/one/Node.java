package oop.homework.one;

public class Node {

    public Node(Person p1, Relationship re, Person p2) {
        this.p1 = p1;
        this.re = re;
        this.p2 = p2;
    }

    private final Person p1;
    private final Relationship re;
    private final Person p2;

    @Override
    public String toString() {
        return String.format("<%s %s %s>", p1, re, p2);
    }

    public Person getP1() {
        return p1;
    }

    public Relationship getRe() {
        return re;
    }

    public Person getP2() {
        return p2;
    }
}
