package oop.homework.one.geo;

import java.util.Date;

public interface Person {
    String getFirstName();
    void changeFirstName(String newFirstName);
    String getLastName();
    void changLastName(String newLastName);
    Date getBirthday();
    void setOrChangeBirthday(Date birthday);
}
