package lesson1210;

public class Parrot extends Animal {
    double wingLength;

    public Parrot() {
    }

    public Parrot(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Parrot(String name, int age, double wingLength) {
        super(name, age);
        this.wingLength = wingLength;
    }

    void sayName() {
        System.out.println("Я попугай, меня зовут " + name);
    }

    public void sayPhrase() {
        System.out.println("My name is " + name
                + ". I'm " + age + " years old"
                + " I have wings about " + wingLength + " meters length");
    }
}
