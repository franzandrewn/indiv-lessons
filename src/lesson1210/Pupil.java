package lesson1210;

public class Pupil {
    static int count = 0;

    String name;
    int age;
    String born;
    int[] grades;

    public Pupil() {
        count++;
    }

    Pupil(String n, int a, String b) {
        count++;
        name = n;
        age = a;
        born = b;
    }

    public Pupil(String name, int age, String born, int[] grades) {
        count++;
        this.name = name;
        this.age = age;
        this.born = born;
        this.grades = grades;
    }

    void doHomework() {
        System.out.println(name + ", не хочу делать домашку");
    }

    void changeGrade(int index, int newGrade) {
        grades[index] = newGrade;
    }

    static int doAdd(int x, int y) {
        return x + y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
