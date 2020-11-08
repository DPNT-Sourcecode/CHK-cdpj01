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
    public void compute_sum_1_1() {
        assertThat(sum.compute(1, 1), equalTo(2));
    }

    @Test
    @Parameters
    public void compute_sum_0_0() {

    }
}

