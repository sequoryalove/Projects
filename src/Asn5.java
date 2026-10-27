
import java.util.ArrayList;

public class Asn5 {
    public static void main(String[] args) {

        // First ArrayList for Strings
        ArrayList<String> fruits = new ArrayList<String>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grape");

        // Second ArrayList for Integers
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        // Display the original fruits
        System.out.println("Fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Display the original numbers
        System.out.println("\nNumbers:");
        for (Integer number : numbers) {
            System.out.println(number);
        }

        // Additional method 1: remove()
        fruits.remove("Banana");
        numbers.remove(Integer.valueOf(20));

        // Additional method 2: add()
        fruits.add("Mango");
        numbers.add(50);

        // Display the updated fruits
        System.out.println("\nUpdated Fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Display the updated numbers
        System.out.println("\nUpdated Numbers:");
        for (Integer number : numbers) {
            System.out.println(number);
        }

        // Display the sizes of both ArrayLists
        System.out.println("\nFruit list size: " + fruits.size());
        System.out.println("Number list size: " + numbers.size());
    }
}
