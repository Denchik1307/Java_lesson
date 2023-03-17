package oop.homework.one.wardrobeplus;

import java.util.Date;

public class HumanExampleWardrobe implements InteractionWithTheWardrobe {

    private String name;
    private Date birthday;
    private Integer age;

    public HumanExampleWardrobe(String name, Date birthday, Integer age) {
        this.name = name;
        this.birthday = birthday;
        this.age = age;
    }

    public HumanExampleWardrobe(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public HumanExampleWardrobe(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public HumanExampleWardrobe(String name) {
        this.name = name;
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
    public void open(Wardrobe wardrobe) {
        wardrobe.open();
    }

    @Override
    public void close(Wardrobe wardrobe) {
        wardrobe.close();
    }

    @Override
    public void lock(Wardrobe wardrobe) {
        wardrobe.lock();
    }

    @Override
    public void unlock(Wardrobe wardrobe) {
        wardrobe.unlock();
    }

    @Override
    public void push(Wardrobe wardrobe, int place, Object anyThing) {
        wardrobe.push(place, anyThing);
    }

    @Override
    public void lookAllInWardrobe(Wardrobe wardrobe) {
        wardrobe.lookAllInWardrobe();
    }

    @Override
    public void getForWardrobe(Wardrobe wardrobe, int index) {
        wardrobe.getForWardrobe(index);
    }
}
