public class Tests {

    private double sum;
    private int count;

    public Tests(double sum, int count) {
        this.sum = sum;
        this.count = count;
    }

    public double getAverage() {
        return sum / count;
    }
}