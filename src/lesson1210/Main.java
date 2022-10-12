package lesson1210;

public class Main {
    static void basicSyntax() {
        double[] doubles = new double[5];
        double[] doubles1 = new double[]{4.5, 2.5, -100.1};

        System.out.println(doubles.length);
        System.out.println(doubles1.length);

        System.out.println(doubles1[1]);
        doubles1[1] = -2.5;
        System.out.println(doubles1[1]);

        if (doubles1[1] == 2.5) {
            System.out.println("2.5");
        } else if (doubles1[1] == -2.5) {
            System.out.println("-2.5");
        } else {
            System.out.println("-");
        }

        for (int i = 0; i < doubles1.length; i++) {
            System.out.println(doubles1[i]);
        }
    }

    static void classes() {
        int vasyaAge = 14;
        String vasyaBorn = "Msk";
        int[] vasyaGrades = new int[]{3,5,4,4,4,4,4};

//        Pupil vasya = new Pupil();
//        vasya.name = "Vasya";
//        vasya.age = 14;
//        vasya.born = "Msk";
        System.out.println(Pupil.count);
        Pupil vasya = new Pupil("Vasya", 14, "Msk", new int[]{3,5,2,4,4,4,4});
        vasya.doHomework();
        vasya.changeGrade(0, 5);
        vasya.changeGrade(2, 4);

        System.out.println(vasya.age + " " + vasya.born);
        System.out.println(vasya.grades[0]);

        System.out.println(vasya.doAdd(1,2));
        System.out.println(Pupil.doAdd(-1212, 1213));
        Pupil p = new Pupil();
        System.out.println(Pupil.count);
    }

    public static void main(String[] args) {
        Parrot p = new Parrot("Petya", 4, 1.5);
        p.sayName();
        p.sayPhrase();
        Animal a = new Animal("Barsik",2);
        a.sayName();

        Duck d = new Duck();
        d.fly();
        d.swim();

        Swimming s1 = new Duck();
        Swimming s2 = new Ship();
        s1.swim();
        s2.swim();
    }
}
