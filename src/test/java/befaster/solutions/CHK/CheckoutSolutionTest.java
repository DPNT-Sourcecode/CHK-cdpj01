package befaster.solutions.CHK;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.*;


public class CheckoutSolutionTest {


    @Test
    public void single_A_costs_50() {
        Integer result = new CheckoutSolution().checkout("A");
        assertThat(result, equalTo(50));
    }

    @Test
    public void computes_cost_of_multiple_items_without_offers() {
        Integer result = new CheckoutSolution().checkout("AA");
        assertThat(result, equalTo(100));
    }

    @Test
    public void computes_cost_of_basket_with_different_items_no_offers() {
        Integer result = new CheckoutSolution().checkout("AB");
        assertThat(result, equalTo(80));
    }

    //    +------+-------+----------------+
//    | Item | Price | Special offers |
//    +------+-------+----------------+
//    | A    | 50    | 3A for 130     |
//    | B    | 30    | 2B for 45      |
//    | C    | 20    |                |
//    | D    | 15    |                |
//    +------+-------+----------------+

}

