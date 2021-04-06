import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatisticsTest {

    @Test
    public void testForHeadsProbabilityEqualToTailsProbability(){
        double headsProbability = 0.5;
        double tailsProbability = 0.5;
        boolean expectedValue = true;
        boolean actualValue;

        actualValue = Statistics.compareHeadsAndTailsProbability(headsProbability, tailsProbability);

        assertEquals(expectedValue, actualValue);
    }
}
