package oop.homework.one.geo;

public class Person{
    private final String EMPTY = "Empty";
    private String fullName;
    private String birthday;

    public Person(String fullName, String birthday) {
        this.fullName = fullName;
        this.birthday = birthday;
    }

    public Person(String fullName) {
        this.fullName = fullName;
        this.birthday = EMPTY;
    }

    public void changeName(String newName) {
        this.fullName = newName;
    }

    public String getFullName() {
        return fullName;
    }

    public String getBirthday() {
        return (this.birthday.equals(EMPTY)) ? EMPTY: this.birthday;
    }

    public void setOrChangeBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return this.fullName;
    }
}
