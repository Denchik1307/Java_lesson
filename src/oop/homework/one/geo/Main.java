package oop.homework.one.geo;

import oop.homework.one.wardrobeplus.Wardrobe;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Person irina = new Person("Ирина");
        Person vasya = new Person("Вася");
        Person jane = new Person("Женя","Малик");
        Person natasha = new Person("Наташа");
        Person katy = new Person("Катя");
        GeoTree geoTreeIrina = new GeoTree();
        geoTreeIrina.appendPartner(irina, vasya);
        geoTreeIrina.appendChildren(irina, jane);
        geoTreeIrina.appendChildren(irina, natasha);

        System.out.println(new Research(geoTreeIrina).spend(irina));
        System.out.println(new Research(geoTreeIrina).spend(irina,Relationship.children));
        System.out.println(new Research(geoTreeIrina).spend(irina,Relationship.parent));
        System.out.println(new Research(geoTreeIrina).spend(katy));

        GeoTree geoTreeKaty = new GeoTree();
    }
}
