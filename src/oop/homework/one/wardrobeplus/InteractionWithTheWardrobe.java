package oop.homework.one.wardrobeplus;

public interface InteractionWithTheWardrobe {

    void open(Wardrobe wardrobe);
    void close(Wardrobe wardrobe);
    void lock(Wardrobe wardrobe);
    void unlock(Wardrobe wardrobe);
    void push(Wardrobe wardrobe, int place, Object anyThing);
    void lookAllInWardrobe(Wardrobe wardrobe);
    void getForWardrobe(Wardrobe wardrobe, int index);
}
