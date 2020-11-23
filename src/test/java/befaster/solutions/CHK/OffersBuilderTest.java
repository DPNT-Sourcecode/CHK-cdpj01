package befaster.solutions.CHK;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class OffersBuilderTest {

    @Test
    public void combinations_is_vaguely_sane() {
        List<String> ab = OffersBuilder.combinations("AB", 1);

        assertThat(ab, equalTo(Arrays.asList('A', 'B')));
    }
}