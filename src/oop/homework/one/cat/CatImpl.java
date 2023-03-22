package oop.homework.one.cat;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class CatImpl implements Cat {

    private String name;

    public CatImpl(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return this.name;
    }

    public void changeName(String newName) {
        this.name = newName;
    }

    public void callTheCat() {
        sound("Мяууу");
    }

    public void petTheCat() {
        sound("Муррр");
    }

    private void sound(String sound) {
        StringBuilder tmp = new StringBuilder();
        AtomicInteger rand = new AtomicInteger(new Random().nextInt(1, 3));
        while (rand.get() >= 0) {
            tmp.append(sound).append(" ");
            rand.getAndDecrement();
        }
        System.out.println(tmp.toString());
    }

    @Override
    public void voice() {
        sound("Mpp МЯУ");
    }

    @Override
    public void sleep() {
        System.out.println("The cat sleeping");
    }

    @Override
    public void walk() {
        System.out.println("The cat walking");
    }
}
