
public class Exam extends Assessment
{
    private int pointsEach;
    private int numMissed;

    public Exam(int questions, int missed)
    {
        pointsEach = 100 / questions;
        numMissed = missed;

        int numericScore = (questions - missed) * pointsEach;

        setScore(numericScore);
    }

    public int getPointsEach()
    {
        return pointsEach;
    }

    public int getNumMissed()
    {
        return numMissed;
    }
}
