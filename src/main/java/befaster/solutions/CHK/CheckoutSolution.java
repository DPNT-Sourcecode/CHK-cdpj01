package befaster.solutions.CHK;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CheckoutSolution {
    public Integer checkout(String skus) {

        return (getFrequency('A', skus) * 50)
                        + getFrequency('B', skus) * 30
                        + getFrequency('C', skus) * 20
                        + getFrequency('D', skus) * 15;
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



