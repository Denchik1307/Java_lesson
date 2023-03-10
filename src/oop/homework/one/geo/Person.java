package oop.homework.one.geo;

public class Person {
    private String fullName;
    private String age;

    public Person(String fullName) {
        this.fullName = fullName;
    }

    public void changeName(String newName) {
        this.fullName = newName;
    }

    public String getFullName() {
        return fullName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
