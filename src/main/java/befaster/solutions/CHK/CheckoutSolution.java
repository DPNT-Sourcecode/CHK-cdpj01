package befaster.solutions.CHK;

import java.util.List;

public class CheckoutSolution {

    public static final boolean LOGGING_ENABLED = false;

    public Integer checkout(String skus) {
        List<Offer> offers = new OffersBuilder()
                .offer("AAAAA", 200)
                .offer("AAA", 130)
                .offer("EEB", 80)
                .offer("BB", 45)
                .offer("A", 50)
                .offer("B", 30)
                .offer("C", 20)
                .offer("D", 15)
                .offer("E", 40)
                .offer("FFF", 20)
                .offer("F", 10)
                .offer("G", 20)
                .offer("HHHHHHHHHH", 80)
                .offer("HHHHH", 45)
                .offer("H", 10)
                .offer("I", 35)
                .offer("J", 60)
                .offer("KK", 120)
                .offer("K", 70)
                .offer("L", 90)
                .offer("NNNM", 120)
                .offer("N", 40)
                .offer("M", 15)
                .offer("O", 10)
                .offer("PPPPP", 200)
                .offer("P", 50)
                .offer("RRRQ", 150)
                .offer("R", 50)
                .offer("QQQ", 80)
                .offer("Q", 30)
                .complexOffer("STXYZ", 3, 45)
                .offer("S", 20)
                .offer("T", 20)
                .offer("UUUU", 120)
                .offer("U", 40)
                .offer("VVV", 130)
                .offer("VV", 90)
                .offer("V", 50)
                .offer("W", 20)
                .offer("X", 17)
                .offer("Y", 20)
                .offer("Z", 21)
                .build();

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


