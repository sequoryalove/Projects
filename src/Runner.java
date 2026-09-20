import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double sum = 0;
        int count = 0;

        System.out.print("Enter a test score (or -1 to quit): ");

        double score = input.nextDouble();

        while (score != -1) {
            sum += score;
            count++;

            System.out.print("Enter another test score (or -1 to quit): ");
            score = input.nextDouble();
        }

        Tests tests = new Tests(sum, count);

        System.out.println();
        System.out.println("Number of test scores entered: " + count);
        System.out.printf("Average test score: %.2f%n", tests.getAverage());

        input.close();
    }
}