package lesson_oop.lesson_one;

public class Animal {

    private String model;
    public String publ;
    protected int age;

    public Animal(String model) {
        this.model = model;
    }

    public Animal() {}

    public void setModel(String model) {
        this.model = model;
    }


    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return this.model;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
