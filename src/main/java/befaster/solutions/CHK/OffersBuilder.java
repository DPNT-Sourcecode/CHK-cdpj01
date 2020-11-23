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
        List<String> skuCombinations = combinations(skus, numberPurchasedAtOnce);

        skuCombinations.stream()
                .map(s -> new Offer(s, price))
                .forEach(o -> offers.add(o));

        return this;
    }

    static List<String> combinations(String skus, int num) {
        if (num == 0) {
            return Collections.singletonList("");
        } else {
            List<String> accumulator = new ArrayList<>();
            for (int i = 0; i < skus.length(); i++) {
                char sku = skus.charAt(i);

                String remainingSkus = skus.replace(Character.toString(sku), "");

                List<String> combinations = combinations(remainingSkus, num - 1);
                List<String> combinationsPlusThisSku = combinations.stream().map(s -> s + sku).collect(Collectors.toList());

                accumulator.addAll(combinationsPlusThisSku);
            }

            return accumulator;
        }
    }
}

