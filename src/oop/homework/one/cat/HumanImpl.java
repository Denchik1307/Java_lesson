package oop.homework.one.cat;

import java.util.Date;
import java.util.Random;

public class HumanImpl implements Human {
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
        System.out.println("I`m say");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping");
    }

    @Override
    public void walk() {
        System.out.println("Walking");
    }

    @Override
    public void eat() {
        System.out.println("Eating");
    }

    @Override
    public void callTheCat(Cat cat) {
        cat.callTheCat();
    }

    @Override
    public void petTheCat(Cat cat) {
        cat.petTheCat();
    }

    @Override
    public void answerForCat() {
        Random rand = new Random();
        boolean tmp = rand.nextInt(0, 100)%2 == 0;
        System.out.println(tmp ? "Хочешь кушать?" : "Погладить?");
        ;
    }
}
