package lv.rvt;

public class Person {
    private String name;
    private int age;
    private double weight;
    private double height;

    public Person(String name) {
        this.name = name;
        this.age = 0;
        this.weight = 0.0;
        this.height = 0.0;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 0.0;
        this.height = 0.0;
    }
    @Override
    public String toString() {
        return name + " is " + age + " years old.";
    }
}
