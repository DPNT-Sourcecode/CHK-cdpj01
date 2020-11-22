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
    public void basket_with_one_offer_for_A() {
        assertBasketCost("AAA", 130);
    }

    @Test
    public void basket_with_mix_of_offers_and_non_offers() {
        assertBasketCost("AAAB", 130 + 30);
    }

    @Test
    public void basket_with_two_instances_of_an_offer() {
        assertBasketCost("AAAAAA", 130 * 2);
    }

    @Test
    public void basket_with_multiple_instances_of_product_with_no_offer() {
        assertBasketCost("CC", 20 * 2);
    }

    @Test
    public void basket_with_illegal_characters() {
        assertBasketCost("ZZZ", -1);
    }

    @Test
    public void empty_basket_is_legal_with_value_0() {
        assertBasketCost("", 0);
    }

    private void assertBasketCost(String skus, int expectedCost) {
        Integer result = new CheckoutSolution().checkout(skus);
        assertThat(result, equalTo(expectedCost));
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
