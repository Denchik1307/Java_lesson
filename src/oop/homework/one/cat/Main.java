package oop.homework.one.cat;

public class Main {
    public static void main(String[] args) {
        HumanExampleCat alex = new HumanExampleCat("Alex");
        Cat myCat = new Cat("Мурка");
        alex.callTheCat(myCat);
        alex.petTheCat(myCat);
    }
}
