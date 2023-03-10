package oop.homework.one.geo;

import oop.homework.one.wardrobeplus.Wardrobe;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Person irina = new Person("Ирина");
        Person vasya = new Person("Вася");
        Person masha = new Person("Маша");
        Person jane = new Person("Женя");
        Person ivan = new Person("Ваня");
        GeoTree geoTree = new GeoTree();
        geoTree.appendChildren(irina, vasya);
        geoTree.appendChildren(vasya, jane);
        geoTree.appendChildren(vasya, ivan);
        geoTree.appendPartner(irina, vasya);

        System.out.println(new Research(geoTree).spend(irina, Relationship.parent));

        ArrayList<String> list = new ArrayList<>();
        Stream<String> tmp = list.stream().filter(s -> s.equals("der"));


    }

}
