package befaster.solutions.CHK;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CheckoutSolution {
    public Integer checkout(String skus) {

        int total = (int) ((frequencies.get('A') * 50)
                        + frequencies.get('B') * 30
                        + frequencies.get('C') * 20
                        + frequencies.get('D') * 15);

        return 50 * skus.length();
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


