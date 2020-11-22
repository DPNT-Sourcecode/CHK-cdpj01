package befaster.solutions.CHK;

import java.util.Map;

public class Offer {
    final Map<Character, Long> items;
    public final int cost;
    private final String skus;

    public Offer(String skus, int cost) {
        this.skus = skus;
        items = Basket.characterFrequencies(skus);
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Offer{" + skus + ", cost=" + cost + '}';
    }
}
