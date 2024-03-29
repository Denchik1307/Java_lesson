package oop.homework.one.cat;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Cat {

    private int corm =  100;
    int maxEatToMisc = 10;
    private String name;
    private int miscFood;

    public void byeFood(int cormPCS, int cormWeight) {
        this.corm = cormPCS * cormWeight;
    }

    public Cat(String name) {
        this.name = name;
    }

    public void addFootToMisc() {
        this.miscFood = maxEatToMisc;
    }

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
}
