package befaster.solutions.CHK;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class CheckoutSolution {
    public Integer checkout(String skus) {




        return 50 * skus.length();
    }

    private Map<Character, Integer> characterFrequencies(String skus) {
        List<Character> characters = skus.chars()
                .mapToObj(c -> (char) c)

                .collect(
                        

                );



    }

}





