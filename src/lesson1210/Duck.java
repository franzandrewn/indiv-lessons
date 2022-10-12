package lesson1210;

public class Duck extends Animal implements Flying, Swimming {
    double beakLength;

    public Duck() {
    }

    public Duck(String name, int age, double beakLength) {
        super(name, age);
        this.beakLength = beakLength;
    }

    @Override
    public void fly() {
        System.out.println("Кря, лечу");
    }

    public void swim() {
        System.out.println("Кря, плыву");
    }
}
