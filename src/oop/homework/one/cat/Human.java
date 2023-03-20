package oop.homework.one.cat;

import java.util.Date;

public interface Human extends InteractionWithTheCat{
    String getName();

    void changeName(String name);

    Date getBirthday();

    void changeBirthday(Date birthday);

    void setBirthday(Date birthday);

    Integer getAge();

    void changeAge(Integer age);

    void setAge(Integer age);
}
