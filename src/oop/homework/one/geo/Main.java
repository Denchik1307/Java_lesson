package oop.homework.one.geo;

public class Main {
    public static void main(String[] args) {

        Person irina = new PersonImpl("Ирина");
        Person vasya = new PersonImpl("Вася");
        Person jane = new PersonImpl("Женя","Малик");
        Person natasha = new PersonImpl("Наташа");
        Person katy = new PersonImpl("Катя");
        GeoTree geoTreeIrina = new GeoTreeImpl();
        geoTreeIrina.appendPartner(irina, vasya);
        geoTreeIrina.appendChildren(irina, jane);
        geoTreeIrina.appendChildren(irina, natasha);

        System.out.println(Research.createResearch(geoTreeIrina).spend(irina));
        System.out.println(Research.createResearch(geoTreeIrina).spend(irina,Relationship.children));
        System.out.println(Research.createResearch(geoTreeIrina).spend(irina,Relationship.parent));
        System.out.println(Research.createResearch(geoTreeIrina).spend(katy));

        GeoTree geoTreeKaty = new GeoTreeImpl();
    }
}
