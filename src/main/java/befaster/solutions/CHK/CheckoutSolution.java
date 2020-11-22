package befaster.solutions.CHK;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CheckoutSolution {
    public Integer checkout(String skus) {

        return computeCostFor(skus, 'A', 50, 3, 130)
                        + computeCostFor(skus, 'B', 30, 2, 45)
                        + computeCostFor(skus, 'C', 20, 0, 0)
                        + computeCostFor(skus, 'D', 15, 0, 0);
    }

    private int computeCostFor(String skus, char sku, int costPerItem, int offerQuantity, int amountPerOffer) {
        int frequency = getFrequency(sku, skus);

        if (offerQuantity == 0) {
            return frequency * costPerItem;
        } else {
            int numOfferChunks = frequency / offerQuantity;
            int actualOfferAmount = numOfferChunks * amountPerOffer;

            int nonOfferAmount = frequency % offerQuantity;

            return actualOfferAmount + nonOfferAmount * costPerItem;
        }
    }

    private int getFrequency(char sku, String skus) {
        Map<Character, Long> frequencies = characterFrequencies(skus);

        Long frequency = frequencies.get(sku);
        if (frequency != null) {
            return frequency.intValue();
        } else {
            return 0;
        }
    }

    /* package */ static Map<Character, Long> characterFrequencies(String skus) {
        return skus.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                                Function.identity(),
                                Collectors.counting()
                        )
                );
    }
}





