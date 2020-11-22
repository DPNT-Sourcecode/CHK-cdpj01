package befaster.solutions.CHK;

import java.util.Arrays;
import java.util.List;

public class CheckoutSolution {

    public static final boolean LOGGING_ENABLED = false;

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
                new Offer("E", 40),
                new Offer("FFF", 20),
                new Offer("F", 10),
                new Offer("G", 20),
                new Offer("HHHHHHHHHH", 80),
                new Offer("HHHHH", 45),
                new Offer("H", 10),
                new Offer("I", 35),
                new Offer("J", 60),
                new Offer("KK", 150),
                new Offer("K", 80),
                new Offer("L", 90),
                new Offer("NNNM", 120),
                new Offer("N", 40),
                new Offer("M", 15),
                new Offer("O", 10),
                new Offer("PPPPP", 200),
                new Offer("P", 50),
                new Offer("RRRQ", 150),
                new Offer("R", 50),
                new Offer("QQQ", 80),
                new Offer("Q", 30),
                new Offer("S", 30),
                new Offer("T", 20),
                new Offer("UUUU", 120),
                new Offer("U", 40),
                new Offer("VVV", 130),
                new Offer("VV", 90),
                new Offer("V", 50),
                new Offer("W", 20),
                new Offer("X", 90),
                new Offer("Y", 10),
                new Offer("Z", 50)
        );

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


