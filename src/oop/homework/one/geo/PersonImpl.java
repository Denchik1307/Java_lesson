package oop.homework.one.geo;

public class PersonImpl implements Person{
    private final String EMPTY = "Empty";
    private String firstName;
    private String lastName;
    private String birthday;

    public PersonImpl(String firstName,String lastName, String birthday) {
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
    public String getFullName() {
        return firstName;
    }
    public void changLastName(String newLastName) {
        this.lastName = newLastName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getBirthday() {
        return (this.birthday.equals(EMPTY)) ? EMPTY: this.birthday;
    }

    public void setOrChangeBirthday(String birthday) {
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
