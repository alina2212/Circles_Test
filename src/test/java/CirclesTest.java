import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CirclesTest {

    @DataProvider(name = "circleData")
    public Object[][] createTestData() {
        return new Object[][] {
                {0, 3, 6, 3, 1},
                {0, 5, 0, 5, -1},
                {0, 5, 3, 2, 1},
                {0, 5, 4, 3, 2},
                {0, 2, 7, 2, 0},
                {1, 1, 5, 1, 0},
                {0, 1, 2, 1, 1},
                {0, 1, 1, 2, 1},
                {0, 3, 3, 1, 2},
                {0, 5, 2, 4, 2},
                {0, 3, 2, 1, 1}

        };
    }

    @Test(dataProvider = "circleData")
    public void testFindNumberOfPoints(int x1, int r1, int x2, int r2, int expected) {
        int actual = Circles.findNumberOfPoints(x1, r1, x2, r2);
        assertEquals(actual, expected);
    }
}
