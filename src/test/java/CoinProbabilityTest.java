import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CoinProbabilityTest {

    @Test
    public void testForHeadsProbabilityEqualToTailsProbability(){
        double headsProbability = 0.5;
        double tailsProbability = 0.5;

        CoinProbability coinProbability = new CoinProbability(headsProbability, tailsProbability);

        assertEquals(true, coinProbability.equals(coinProbability));
    }

    @Test
    public void testForOneHeadAndOneTailOccurringTogether() {
        double headsProbability = 0.5;
        double tailsProbability = 0.5;
        double expectedValue = 0.25;
        double actualValue;
        CoinProbability coin1 = new CoinProbability(headsProbability, tailsProbability);
        CoinProbability coin2 = new CoinProbability(headsProbability, tailsProbability);
        double coin1_HeadProbability = coin1.getHeadProbability();
        double coin2_TailProbability = coin2.getTailProbability();

        actualValue = CoinProbability.and(coin1_HeadProbability, coin2_TailProbability);

        assertEquals(expectedValue, actualValue, 0.0001);
    }

    @Test
    public void testForProbabilityOfHeadNotOccurring() {
        double headsProbability = 0.5;
        double tailsProbability = 0.5;
        double expectedValue = 0.5;
        double actualValue;
        CoinProbability coinProbability = new CoinProbability(headsProbability, tailsProbability);

        actualValue = CoinProbability.not(headsProbability);

        assertEquals(expectedValue, actualValue, 0.0001);
    }
}
