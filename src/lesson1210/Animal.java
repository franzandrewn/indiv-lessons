package lesson1210;

public class Animal {
    String name;
    int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void sayName() {
        System.out.println(name);
    }
}
