package befaster.solutions.CHK;

import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

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
    public void offer_5A_for_200() {
        assertBasketCost("AAAAA", 200);
    }

    @Test
    public void basket_with_mix_of_offers_and_non_offers() {
        assertBasketCost("AAAB", 130 + 30);
    }

    @Test
    public void buy_2E_get_one_B_for_free() {
        assertBasketCost("EEB", 80);
    }

    @Test
    public void basket_with_two_instances_of_an_offer() {
        assertBasketCost("AAAAAAAAAA", 200 * 2);
    }

    @Test
    public void basket_with_multiple_instances_of_product_with_no_offer() {
        assertBasketCost("CC", 20 * 2);
    }

    @Test
    public void basket_with_illegal_characters() {
        assertBasketCost("____", -1);
    }

    @Test
    public void empty_basket_is_legal_with_value_0() {
        assertBasketCost("", 0);
    }

    @Test
    public void E_costs_40() {
        assertBasketCost("E", 40);
        assertBasketCost("ABCDE", 155);
        assertBasketCost("EE", 80);
    }

    @Test
    public void F_costs_10() {
        assertBasketCost("F", 10);
    }

    @Test
    public void buy_2F_get_1_F_for_free() {
        assertBasketCost("FFF", 20);
    }

    @Test
    public void buy_1K_for_70() {
        assertBasketCost("K", 70);
    }

    @Test
    public void buy_2K_for_120() {
        assertBasketCost("KK", 120);
    }

    @Test
    public void buy_single_product_out_of_S_T_X_Z() {
        assertBasketCost("S", 20);
        assertBasketCost("T", 20);
        assertBasketCost("X", 17);
        assertBasketCost("Y", 20);
        assertBasketCost("Z", 21);
    }

    @Test
    public void buy_any_3_of_S_T_X_Y_Z_for_45() {
        assertBasketCost("STX", 45);
    }

    @Test
    public void complex_offer_is_good_for_repeated_instances_of_same_product() {
        assertBasketCost("SSS", 45);
        assertBasketCost("SSSZ", 65);
        assertBasketCost("ZZZ", 45);
    }

    private void assertBasketCost(String skus, int expectedCost) {
        Integer result = new CheckoutSolution().checkout(skus);
        assertThat(skus, result, equalTo(expectedCost));
    }
}



