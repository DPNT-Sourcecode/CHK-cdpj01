package befaster.solutions.CHK;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CheckoutSolution {
    public Integer checkout(String skus) {
        if (!isLegalBasket(skus)) {
            return -1;
        } else {
            return computeCostFor(skus, 'A', 50, 3, 130)
                    + computeCostFor(skus, 'B', 30, 2, 45)
                    + computeCostFor(skus, 'C', 20, 0, 0)
                    + computeCostFor(skus, 'D', 15, 0, 0);
        }
    }

    private boolean isLegalBasket(String skus) {
        long illegalCharacters = characterFrequencies(skus).keySet().stream()
                .filter(this::isLegalSku)
                .count();
        return illegalCharacters > 0;
    }

    private boolean isLegalSku(Character c) {
        return c == 'A'
                || c == 'B'
                || c == 'C'
                || c == 'D';
    }

    private int computeCostFor(String skus, char sku, int costPerItem, int offerQuantity, int amountPerOffer) {
        int frequency = getFrequency(sku, skus);

        if (offerQuantity == 0) {
            return frequency * costPerItem;
        } else {
            return (frequency / offerQuantity) * amountPerOffer
                    + (frequency % offerQuantity) * costPerItem;
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

    private static Map<Character, Long> characterFrequencies(String skus) {
        return skus.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                                Function.identity(),
                                Collectors.counting()
                        )
                );
    }
}


