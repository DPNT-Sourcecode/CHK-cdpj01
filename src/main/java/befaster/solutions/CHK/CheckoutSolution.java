package befaster.solutions.CHK;

import java.util.Arrays;
import java.util.List;

public class CheckoutSolution {
    public Integer checkout(String skus) {

        List<Offer> offers = Arrays.asList(
                new Offer("AAAAA", 200),
                new Offer("AAA", 130),
                new Offer("EEB", 80),
                new Offer("BB", 45),
                new Offer("A", 50),
                new Offer("B", 30),
                new Offer("C", 20),
                new Offer("D", 15),
                new Offer("E", 40)
        );

        Basket basket = new Basket(skus);

        for (Offer offer : offers) {
            while (basket.canApplyOffer(offer)) {
                basket = basket.applyOffer(offer);
            }
        }

        if (!basket.isEmpty()) {
            return -1;
        } else {
            return basket.valueSoFar;
        }
    }
}

