public class CoinProbability {
    private double headProbability;
    private double tailProbability;

    public CoinProbability(double headProbability, double tailProbability) {
        this.headProbability = headProbability;
        this.tailProbability = tailProbability;
    }

    @Override
    public boolean equals(Object obj) {
        CoinProbability coinProbability =(CoinProbability)obj;
        return this==obj && Double.compare(this.headProbability, coinProbability.tailProbability)==0;
    }
}
