package befaster.solutions.CHK;

import java.util.ArrayList;
import java.util.List;

public class OffersBuilder {

    private List<Offer> offers = new ArrayList<>();

    List<Offer> build() {
        return offers;
    }

    OffersBuilder offer(String aaaaa, int i) {
        offers.add(new Offer(aaaaa, i));

        return this;
    }
}



