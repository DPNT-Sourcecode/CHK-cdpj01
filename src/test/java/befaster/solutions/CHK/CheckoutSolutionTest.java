package befaster.solutions.CHK;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.*;


public class CheckoutSolutionTest {


    @Test
    public void basket_with_single_A_costs_50() {
        assertBasketCost("A", 50);
    }

    @Test
    public void basket_with_multiple_items_no_offers() {
        assertBasketCost("AA", 100);
    }

    @Test
    public void basket_with_different_items_no_offers() {
        assertBasketCost("AB", 80);
    }

    @Test
    public void basket_with_one_offer() {
        assertBasketCost("AAA", 130);
    }

    private void assertBasketCost(String ab, int i) {
        Integer result = new CheckoutSolution().checkout(ab);
        assertThat(result, equalTo(i));
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


