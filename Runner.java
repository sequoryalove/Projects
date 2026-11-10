
import javax.swing.JOptionPane;

/**
 * This program demonstrates the Exam class.
 * It asks the user for the number of exam questions
 * and the number of questions the student missed.
 *
 * Exception handling is used to prevent the program
 * from crashing when invalid input is entered.
 */
public class Runner {

    public static void main(String[] args) {

        int questions;
        int missed;
        Exam exam = null;

        // Keep asking for exam information until valid
        // information is entered.
        while (exam == null) {

            // Get the number of questions on the exam.
            questions = getIntegerInput(
                    "How many questions are on the exam?"
            );

            // Get the number of questions the student missed.
            missed = getIntegerInput(
                    "How many questions did the student miss?"
            );

            try {
                // Create an Exam object using the input values.
                exam = new Exam(questions, missed);

            } catch (ArithmeticException e) {

                // Handle division by zero.
                JOptionPane.showMessageDialog(
                        null,
                        "The number of questions cannot be zero. Please try again."
                );

            } catch (IllegalArgumentException e) {

                // Handle invalid exam information.
                JOptionPane.showMessageDialog(
                        null,
                        e.getMessage()
                );
            }
        }

        // Display the exam results.
        String message = "Each question counts "
                + exam.getPointsEach();

        message += " points.\nThe exam score is "
                + exam.getScore();

        message += "\nThe exam grade is "
                + exam.getGrade();

        JOptionPane.showMessageDialog(null, message);

        System.exit(0);
    }

    /**
     * Gets an integer from the user.
     * Uses a try-catch block to handle input that
     * cannot be converted into an integer.
     *
     * @param prompt The message displayed to the user.
     * @return A valid integer entered by the user.
     */
    public static int getIntegerInput(String prompt) {

        while (true) {

            String input = JOptionPane.showInputDialog(prompt);

            // Exit if the user cancels the input window.
            if (input == null) {
                System.exit(0);
            }

            try {

                // Convert the String input into an integer.
                return Integer.parseInt(input.trim());

            } catch (NumberFormatException e) {

                // Display an error if the input is not a number.
                JOptionPane.showMessageDialog(
                        null,
                        "Invalid input. Please enter a whole number."
                );
            }
        }
    }
}

