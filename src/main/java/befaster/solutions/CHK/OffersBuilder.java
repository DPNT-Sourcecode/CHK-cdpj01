package befaster.solutions.CHK;

import com.google.common.collect.Sets;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OffersBuilder {

    private List<Offer> offers = new ArrayList<>();

    List<Offer> build() {
        return offers;
    }

    OffersBuilder offer(String skus, int price) {
        offers.add(new Offer(skus, price));

        return this;
    }

    OffersBuilder complexOffer(String skus, int numberPurchasedAtOnce, int price) {

        Set<Character> skuSet = skus.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toSet());

        List<String> skuCombinations = combinations(skuSet, numberPurchasedAtOnce);

        return this;
    }

    private Set<String> combinations(String skus, int num) {
        if (num == 0) {
            return Collections.emptySet();
        } else {
            Set<Character> accumulator = new HashSet<>();
            for (char sku : skus) {
                String remainingSkus = skus.replace(Character.toString(sku), "");

                Set<String> combinations = combinations(remainingSkus, num - 1);
                List<String> ston = combinations.stream().map(s -> s + sku).collect(Collectors.toList());
                accumulator.addAll(ston);
            }
        }

    }
}


