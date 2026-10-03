import java.util.Scanner;

public class HalloWelt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();

        int age = -1;
        while (true) {
            System.out.print("Please enter your age: ");

            if (scanner.hasNextInt()) {
                age = scanner.nextInt();

                if (age < 0) {
                    System.out.println("Age cannot be negative!");
                } else {
                    break;
                }
            } else {
                System.out.println("Age must be a number!");
                scanner.next();
            }
        }

        Person person = new Person(name, age);
        System.out.println(person.toString());
        scanner.close();
    }
}
