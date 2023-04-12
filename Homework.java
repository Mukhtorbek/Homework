import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("write your name: ");
        String name = scanner.nextLine();

        System.out.print("write your age: ");
        int age = scanner.nextInt();

        System.out.println("hi," + name +" ! you are " + age +" age");
    }

}
