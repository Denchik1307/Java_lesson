package oop.homework.one.wardrobeplus;

public class Main {
    public static void main(String[] args) {
        Wardrobe wardrobeCloth = new Wardrobe();
        String text = "Something";
        wardrobeCloth.push(0,text);
        wardrobeCloth.unlock();
        wardrobeCloth.push(1,text);
        wardrobeCloth.open();
        wardrobeCloth.push(2,text);
        wardrobeCloth.lookAllInWardrobe();
        wardrobeCloth.getForWardrobe(0);
        wardrobeCloth.lookAllInWardrobe();
        wardrobeCloth.lock();
        wardrobeCloth.close();
        wardrobeCloth.lock();
    }
}
