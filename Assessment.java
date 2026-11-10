
/**
 * A class that holds a numeric score for an assessment.
 * This class serves as the parent class for other
 * assessment-related classes.
 */
public class Assessment {

    // Stores the numeric score for the assessment.
    private int score;

    /**
     * Sets the score field to the value provided.
     *
     * @param s The numeric score to store.
     */
    public void setScore(int s) {

        this.score = s;
    }

    /**
     * Returns the numeric score stored in the score field.
     *
     * @return The numeric assessment score.
     */
    public int getScore() {

        return this.score;
    }

    /**
     * Determines the letter grade based on the numeric score.
     *
     * A score of 90 or above receives an A.
     * A score of 80-89 receives a B.
     * A score of 70-79 receives a C.
     * A score of 60-69 receives a D.
     * Any score below 60 receives an F.
     *
     * @return The letter grade for the assessment.
     */
    public char getGrade() {

        char letterGrade;

        // Divide the score by 10 to determine the grade range.
        switch (this.score / 10) {

            case 10:
            case 9:
                letterGrade = 'A';
                break;

            case 8:
                letterGrade = 'B';
                break;

            case 7:
                letterGrade = 'C';
                break;

            case 6:
                letterGrade = 'D';
                break;

            default:
                letterGrade = 'F';
                break;
        }

        return letterGrade;
    }
}
