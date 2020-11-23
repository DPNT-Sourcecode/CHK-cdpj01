package befaster.solutions.CHK;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class OffersBuilderTest {

    @Test
    public void any_1_from_list_of_2() {
        List<String> ab = OffersBuilder.combinations("AB", 1);
        assertThat(ab, containsInAnyOrder("A", "B"));
    }

    @Test
    public void any_2_from_list_of_2() {
        List<String> ab = OffersBuilder.combinations("AB", 2);
        assertThat(ab, containsInAnyOrder("AB", "BA"));
    }

    @Test
    public void any_2_from_list_of_3() {
        List<String> ab = OffersBuilder.combinations("ABC", 2);
        assertThat(ab, containsInAnyOrder("AB", "AC", "BA", "BC", "CA", "CB"));
    }
}