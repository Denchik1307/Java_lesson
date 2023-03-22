package oop.homework.one.geo;

import java.util.Date;

public class PersonImpl implements Person{
    private final Date EMPTY = null;
    private String firstName;
    private String lastName;
    private Date birthday;

    public PersonImpl(String firstName,String lastName, Date birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
    }

    public PersonImpl(String firstName,String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = EMPTY;
    }

    public PersonImpl(String firstName) {
        this.firstName = firstName;
        this.birthday = EMPTY;
    }

    public void changeFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void changLastName(String newLastName) {
        this.lastName = newLastName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public Date getBirthday() {
        return this.birthday;
    }

    public void setOrChangeBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        if (this.lastName!=null){
            return this.firstName + " " + this.lastName;
        }else {
            return this.firstName;
        }
    }
}
