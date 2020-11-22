package befaster.solutions.CHK;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CheckoutSolution {
    public Integer checkout(String skus) {
        return 50 * skus.length();
    }

    /* package */ Map<Character, Long> characterFrequencies(String skus) {
        Map<Character, Long> collect = skus.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                                Function.identity(),
                                Collectors.counting()
                        )
                );
    }

}






