import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Pet p1 = new Pet();
        System.out.println(p1.toString());
        System.out.println();

        Pet p2 = new Pet("Buster", "Dog", 11);
        System.out.println(p2.toString());
        System.out.println();

        System.out.println("Enter animal type: ");
        String type = input.nextLine();

        System.out.println("Enter animal name: ");
        String name = input.nextLine();

        System.out.println("Enter animal age: ");
        int age = input.nextInt();

        Pet p3 = new Pet(name, type, age);
        System.out.println();
        System.out.println(p3.toString());

        input.close();
    }
}