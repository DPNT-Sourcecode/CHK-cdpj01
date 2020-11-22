package befaster.solutions.CHK;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class CheckoutSolution {
    public Integer checkout(String skus) {

        List<Character> collect = skus.chars()
                .mapToObj(c -> (char) c)
                .collect(toList());
        collect.sort();

        return 50 * skus.length();
    }
}




