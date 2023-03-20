package oop.homework.one.geo;

public interface Person {
    void changeFirstName(String newFirstName);
    void changLastName(String newLastName);
    String getLastName();
    String getBirthday();
    void setOrChangeBirthday(String birthday);
}
