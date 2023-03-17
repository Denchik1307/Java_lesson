package oop.homework.one.cat;

import java.util.Date;

public class HumanExampleCat implements InteractionWithTheCat {
    public HumanExampleCat(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    private String name;
    private Date birthday;
    private Integer age;

    public HumanExampleCat(String name, Date birthday, Integer age) {
        this.name = name;
        this.birthday = birthday;
        this.age = age;
    }

    public HumanExampleCat(String name) {
        this.name = name;
    }

    public HumanExampleCat(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void changeName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void changeBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setBirthday(Date birthday) {
        changeBirthday(birthday);
    }


    public Integer getAge() {
        return age;
    }

    public void changeAge(Integer age) {
        this.age = age;
    }

    public void setAge(Integer age) {
        changeAge(age);
    }

    @Override
    public void callTheCat(Cat cat) {
        cat.callTheCat();
    }

    @Override
    public void petTheCat(Cat cat) {
        cat.petTheCat();
    }
}
