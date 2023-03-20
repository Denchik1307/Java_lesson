package oop.homework.one.wardrobeplus;

import java.util.HashMap;

public class Wardrobe {

    private boolean isOpen = false;
    private boolean isLocked = true;

    private int index = 0;
    private final HashMap<Integer, String> plate = new HashMap<>();

    public void open() {
        if (!isOpen) {
            this.isOpen = true;
            helpText("wardrobe is open");
        } else {
            helpText("don`t need open");
        }
    }

    public void close() {
        if (isOpen) {
            this.isOpen = false;
            helpText("wardrobe is close");
        } else {
            helpText("don`t need close");
        }
    }

    public void lock() {
        if (!isOpen) {
            this.isLocked = true;
            helpText("wardrobe locked");
        } else {
            helpText("need close for lock");
        }
    }

    public void unlock() {
        if (isLocked) {
            this.isLocked = false;
            helpText("wardrobe unlocked");
        } else {
            helpText("don`t need unlock");
        }
    }

    public void push(int place, Object something) {
        if (!isLocked) {
            if (isOpen) {
                this.plate.put(index++, something.toString());
                helpText("item added");
            } else {
                helpText("need open");
            }
        } else {
            helpText("need unlock");
        }
    }

    public void lookAllInWardrobe() {
        if (!isLocked) {
            if (isOpen) {
                if (this.plate.size() > 0) {
                    for (int i : this.plate.keySet()) {
                        System.out.println(i + " - " + this.plate.get(i));
                    }
                } else {
                    helpText("empty");
                }
            } else {
                helpText("need open");
            }
        } else {
            helpText("need unlock");
        }
    }

    public String getForWardrobe(int index) {
        try {
            var tmp = this.plate.get(index);
            this.plate.remove(index);
            return tmp;
        } catch (Exception e) {
            helpText("can`t find this");
        }
        helpText("empty");
        return "Empty";
    }

    private void helpText(String text) {
        System.out.println(text);
    }

}
