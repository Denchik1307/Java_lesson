package oop.homework.one.cat;

import java.util.Date;

public class HumanImpl implements Human, Actions {
    public HumanImpl(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    private String name;
    private Date birthday;
    private Integer age;

    public HumanImpl(String name, Date birthday, Integer age) {
        this.name = name;
        this.birthday = birthday;
        this.age = age;
    }

    public HumanImpl(String name) {
        this.name = name;
    }

    public HumanImpl(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void changeName(String name) {
        this.name = name;
    }

    @Override
    public Date getBirthday() {
        return birthday;
    }

    @Override
    public void changeBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public void setBirthday(Date birthday) {
        changeBirthday(birthday);
    }

    @Override
    public Integer getAge() {
        return age;
    }

    @Override
    public void changeAge(Integer age) {
        this.age = age;
    }

    @Override
    public void setAge(Integer age) {
        changeAge(age);
    }

    @Override
    public void voice() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }
}
