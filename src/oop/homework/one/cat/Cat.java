package oop.homework.one.cat;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Cat {

    private int corm =  100;
    int maxEatToMisc = 10;
    private String name;

    private void byeCorm(int cormPCS, int cormWeight) {
        this.corm = cormPCS * cormWeight;
    }

    public Cat(String name) {
        this.name = name;
    }

    public void addCorm() {
        int miscEat = maxEatToMisc;
    }

    public String getName() {
        return name;
    }

    public void changeName(String newName) {
        this.name = newName;
    }

    public void voice() {
        sound("Мяууу");
    }

    public void petTheCat() {
        sound("Муррр");
    }

//    public void ()

    private void sound(String sound) {
        StringBuilder tmp = new StringBuilder();
        AtomicInteger rand = new AtomicInteger(new Random().nextInt(1, 5));
        while (rand.get() >= 0) {
            tmp.append(sound).append(" ");
            rand.getAndDecrement();
        }
        System.out.println(tmp.toString());
    }
}
