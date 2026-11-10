
/**
 * The Exam class extends the Assessment class.
 * It calculates the points each question is worth
 * and determines the student's numeric exam score.
 */
public class Exam extends Assessment {

    // Stores the number of points each question is worth.
    private int pointsEach;

    // Stores the number of questions the student missed.
    private int numMissed;

    /**
     * Creates an Exam object and calculates the exam score.
     *
     * @param questions The total number of exam questions.
     * @param missed The number of questions the student missed.
     */
    public Exam(int questions, int missed) {

        // Prevent division by zero.
        if (questions == 0) {
            throw new ArithmeticException(
                    "The number of questions cannot be zero."
            );
        }

        // Make sure the total number of questions is positive.
        if (questions < 0) {
            throw new IllegalArgumentException(
                    "The number of questions must be positive."
            );
        }

        // Make sure the number missed is within a valid range.
        if (missed < 0 || missed > questions) {
            throw new IllegalArgumentException(
                    "The number of missed questions must be between 0 and the total number of questions."
            );
        }

        // Calculate the points each question is worth.
        // Integer division may truncate decimal values.
        pointsEach = 100 / questions;

        // Store the number of questions missed.
        numMissed = missed;

        // Calculate the student's numeric exam score.
        int numericScore = (questions - missed) * pointsEach;

        // Use the inherited setScore method from Assessment.
        setScore(numericScore);
    }

    /**
     * Returns the number of points each question is worth.
     *
     * @return Points assigned to each question.
     */
    public int getPointsEach() {

        return pointsEach;
    }

    /**
     * Returns the number of questions the student missed.
     *
     * @return Number of missed questions.
     */
    public int getNumMissed() {

        return numMissed;
    }
}
