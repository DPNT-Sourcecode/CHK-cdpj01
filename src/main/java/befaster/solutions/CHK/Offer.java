package befaster.solutions.CHK;

import java.util.Map;

public class Offer {


    final Map<Character, Long> items;
    private final int cost;

    public Offer(String skus, int cost) {
        items = Basket.characterFrequencies(skus);
        this.cost = cost;
    }
}
