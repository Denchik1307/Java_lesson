package oop.homework.one.wardrobeplus;

public class Main {
    public static void main(String[] args) {
        HumanExampleWardrobe andy = new HumanExampleWardrobe("Andy");
        Wardrobe wardrobeCloth = new Wardrobe();
        String text = "Something";

        andy.unlock(wardrobeCloth);
        andy.open(wardrobeCloth);
        andy.lookAllInWardrobe(wardrobeCloth);
        andy.close(wardrobeCloth);
        andy.lookAllInWardrobe(wardrobeCloth);
    }
}
