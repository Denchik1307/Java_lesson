package oop.homework.one;

import java.util.ArrayList;
import java.util.Objects;

public class Wardrobe {

    private boolean isOpen = true;
    private boolean isLocked = true;
    private final ArrayList<Objects> plate = new ArrayList<>();

    public void open() {
        this.isOpen = true;
    }

    public void close() {
        this.isOpen = false;
    }

    public void lock() {
        this.isLocked = true;
    }

    public void unlock() {
        this.isLocked = false;
    }

    public void Push(Objects something) {
        if (!isLocked) {
            if (isOpen) {
                this.plate.add(something);
            } else {
                helpIfClosed();
            }
        } else {
            helpIfLocked();
        }
    }

    public void showAll(Object something) {
        if (!isLocked) {
            if (isOpen){
                for (int i = 0; i < this.plate.size(); i++) {
                    System.out.println(i + " - " + this.plate.get(i));
                }
            }else {
                helpIfClosed();
            }
        }else {
            helpIfLocked();
        }
    }
    public Object getForWardrobe(int index){
        return this.plate.get(index);
    }

    private void helpIfClosed(){
        System.out.println("need open for push");
    }

    private void helpIfLocked(){
        System.out.println("need unlock wardrobe");
    }
}
