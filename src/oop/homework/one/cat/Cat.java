package oop.homework.one.cat;

public interface Cat extends CatActions,Animal {
    String getName();
    void changeName(String newName);

}
