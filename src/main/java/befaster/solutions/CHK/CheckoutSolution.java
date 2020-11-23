package befaster.solutions.CHK;

import java.util.List;

public class CheckoutSolution {

    public static final boolean LOGGING_ENABLED = false;

    public Integer checkout(String skus) {
        List<Offer> offers = new OffersBuilder().build();

        Basket basket = new Basket(skus);

        for (Offer offer : offers) {
            while (basket.canApplyOffer(offer)) {
                log(offer);
                basket = basket.applyOffer(offer);
            }
        }

        if (!basket.isEmpty()) {
            return -1;
        } else {
            return basket.valueSoFar;
        }
    }

    private void log(Offer offer) {
        if (LOGGING_ENABLED) {
            System.out.println("Applying offer: " + offer);
        }
    }
}




