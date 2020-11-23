package befaster.solutions.CHK;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
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

        skuSet.minus


        return this;
    }
}




