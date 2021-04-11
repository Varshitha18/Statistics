public class CoinProbability {
    private double headProbability;
    private double tailProbability;

    public CoinProbability(double headProbability, double tailProbability) {
        this.headProbability = headProbability;
        this.tailProbability = tailProbability;
    }

    public static double and(double event1_Probability, double event2_Probability) {
        return event1_Probability*event2_Probability;
    }

    public static double not(double eventProbability) {
        return 1 - eventProbability;
    }

    public double getHeadProbability() {
        return headProbability;
    }

    public double getTailProbability() {
        return tailProbability;
    }

    @Override
    public boolean equals(Object obj) {
        CoinProbability coinProbability =(CoinProbability)obj;
        return this==obj && Double.compare(this.headProbability, coinProbability.tailProbability)==0;
    }
}
