import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StatisticsTest {

    @Test
    public void testForHeadsProbabilityEqualToTailsProbability(){
        double headsProbability = 0.5;
        double tailsProbability = 0.5;

        CoinProbability coinProbability = new CoinProbability(headsProbability, tailsProbability);

        assertEquals(true, coinProbability.equals(coinProbability));
    }
}
