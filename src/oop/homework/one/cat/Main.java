package oop.homework.one.cat;

public class Main {
    public static void main(String[] args) {
        Human alex = new HumanImpl("Alex");
        Cat myCat = new CatImpl("Мурка");
        alex.callTheCat(myCat);
        alex.petTheCat(myCat);
        myCat.cuddleHuman(alex);
    }
}
