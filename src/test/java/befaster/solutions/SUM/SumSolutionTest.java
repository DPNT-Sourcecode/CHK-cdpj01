package befaster.solutions.SUM;

import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class SumSolutionTest {
    private SumSolution sum;

    @Before
    public void setUp() {
        sum = new SumSolution();
    }

    @Test
    public void compute_sums() {
        assertSum(1, 1, 2);
        assertSum(0, 0, 0);
        assertSum(100, 0, 100);
        assertSum(0, 100, 100);
        assertSum(100, 100, 200);
        assertSum(50, 1, 51);
    }

    private void assertSum(int i, int i2, int i3) {
        assertThat(sum.compute(i, i2), equalTo(i3));
    }
}


