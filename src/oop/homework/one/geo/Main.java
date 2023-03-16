package oop.homework.one.geo;

import oop.homework.one.wardrobeplus.Wardrobe;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Person irina = new Person("Ирина");
        Person vasya = new Person("Вася");
        Person jane = new Person("Женя");
        Person natasha = new Person("Наташа");
        Person katy = new Person("Катя");
        GeoTree geoTree = new GeoTree();
        geoTree.appendPartner(irina, vasya);
        geoTree.appendChildren(irina, jane);
        geoTree.appendChildren(irina, natasha);
//
        System.out.println(new Research(geoTree).spend(irina));
        System.out.println(new Research(geoTree).spend(irina,Relationship.children));
        System.out.println(new Research(geoTree).spend(irina,Relationship.parent));
        System.out.println(new Research(geoTree).spend(katy));

    }

}
