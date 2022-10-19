package lesson1910;

import java.io.*;
import java.util.Scanner;

public class Main {
    static void exceptions() {
//        System.out.println(5/0);
//        int[] arr = new int[5];
//        System.out.println(arr[5]);

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
//        if (y != 0) {
//            System.out.println("Частное x и y = " + (x / y));
//        } else {
//            System.out.println("Деление на 0 невозможно");
//        }
        try {
            System.out.println("Частное x и y = " + (x / y));
        } catch (ArithmeticException e) {
            System.out.println("Деление на 0 невозможно");
            System.out.println(e.getMessage());
        } catch (IndexOutOfBoundsException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Выполняется в любом случае");
        }
    }

    static void checkedExceptions(){
        // Прочитать содержимое файла и вывести его на экран
        try {
            FileInputStream in = new FileInputStream(".gitignore");
            System.out.println(in);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    static void checkedExceptions1() throws FileNotFoundException {
        // Прочитать содержимое файла и вывести его на экран
        FileInputStream in = new FileInputStream(".gitignore");
    }

    private static void customExceptions() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x <= 0) {
            throw new InputNotPositiveException("x <= 0");
        }
        System.out.println(x);
    }

    static void ioStreams() {
        try {
            FileInputStream in = new FileInputStream("test.txt");
            FileOutputStream out = new FileOutputStream("test_copy.txt");

            // in.read() - считать один байт из источника
            int i = in.read();
            while (i != -1) {
                System.out.println(i + " " + ((char) i));
                // out.write() - записать один байт
                out.write(i);
                i = in.read();
            }
            in.close();
            out.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    static void ioStreamsWithFinally() {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("test.txt");
            out = new FileOutputStream("test_copy.txt");

            // in.read() - считать один байт из источника (при работе с наследниками InputStream)
            int i = in.read();
            while (i != -1) {
                System.out.println(i + " " + ((char) i));
                // out.write() - записать один байт (при работе с наследниками OutputStream)
                out.write(i);
                i = in.read();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    static void tryWithResources() {
        try (FileInputStream in = new FileInputStream("test.txt");
             FileOutputStream out = new FileOutputStream("test_copy.txt");
             ExoticFileFormat exotic = new ExoticFileFormat()) {
            int i = in.read();
            while (i != -1) {
                System.out.println(i + " " + ((char) i));
                out.write(i);
                i = in.read();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    static void charStreams() {
        try (FileReader in = new FileReader("test.txt");
             FileWriter out = new FileWriter("test_copy.txt")) {
            // in.read() - считывание символа  (при работе с наследниками Reader)
            int i = in.read();
            while (i != -1) {
                System.out.println(i + " " + ((char) i));
                // out.write() - запись символа (при работе с наследниками Writer)
                out.write(i);
                i = in.read();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    static void bufferedStreams() {
        try (BufferedReader in = new BufferedReader(new FileReader("test.txt"));
             BufferedWriter out = new BufferedWriter(new FileWriter("test_copy.txt"))) {
            int i = in.read();
            while (i != -1) {
                System.out.println(i + " " + ((char) i));
                out.write(i);
                i = in.read();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        try (BufferedInputStream in = new BufferedInputStream(new FileInputStream("test.txt"));
             BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("test_copy.txt"))) {
            int i = in.read();
            while (i != -1) {
                System.out.println(i + " " + ((char) i));
                out.write(i);
                i = in.read();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {
//        exceptions();
//        checkedExceptions();
//        try {
//            checkedExceptions1();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        customExceptions();
//        ioStreams();
//        tryWithResources();
//        charStreams();
        bufferedStreams();
    }
}
