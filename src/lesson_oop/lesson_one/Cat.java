package lesson_oop.lesson_one;

import java.awt.font.NumericShaper;
import java.util.Random;
import java.util.concurrent.Flow;

public class Cat extends Animal {

    private String name;

    public Cat() {
        super("Кошариус");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return super.toString() + " " + this.name;
    }
}
