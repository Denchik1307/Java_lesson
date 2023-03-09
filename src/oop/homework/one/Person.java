package oop.homework.one;

public class Person {
    private String fullName;

    public Person(String fullName) {
        this.fullName = fullName;
    }

    public void changeName(String newName) {
        this.fullName = newName;
    }

    public String getFullName() {
        return fullName;
    }

}
