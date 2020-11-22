package befaster.solutions.CHK;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CheckoutSolution {
    public Integer checkout(String skus) {

        return computeCostFor(skus, 'A', 50)
                        + computeCostFor(skus, 'B', 30)
                        + computeCostFor(skus, 'C', 20)
                        + computeCostFor(skus, 'D', 15);
    }

    private int computeCostFor(String skus, char sku, int freq) {
        
        return getFrequency(sku, skus) * freq;
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




